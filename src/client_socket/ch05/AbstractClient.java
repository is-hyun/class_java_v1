package client_socket.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public abstract class AbstractClient {

    private String name;
    private Socket socket;
    private PrintWriter socketWriterStream;
    private BufferedReader socketReaderStream;
    private BufferedReader keyboardReaderStream;

    public AbstractClient(String name) {
        this.name = name;
    }

    // 메서드를 통해 socket 주입 받기 (setter)
    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public final void run() {
        try {
            connectToServer();
            setupStream();
            startCommunication();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    // 자식 클래스는 반드시 메서드를 재정의 해야 함(강제성)
    protected abstract void connectToServer();

    private void setupStream() throws IOException {
        socketWriterStream = new PrintWriter(socket.getOutputStream(), true);
        socketReaderStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        keyboardReaderStream = new BufferedReader(new InputStreamReader(System.in));
    }

    private void startCommunication() throws InterruptedException {

        // 서버에서 보낸 데이터 받기
        Thread readThread = new Thread(() -> {

            String msg;
            try {
                while ((msg = socketReaderStream.readLine()) != null) {
                    System.out.println(msg);
                }
            } catch (Exception e) {
                System.err.println("서버와의 연결이 끝겼습니다");
            }

        });

        // 키보드로 값을 입력해서 서버로 전송
        Thread writeThread = new Thread(() -> {

            try {
                String input;
                while ((input = keyboardReaderStream.readLine()) != null) {
                    socketWriterStream.println("[" + name + "] " + input);
                }
            } catch (IOException e) {
                System.err.println("메시지 전송 중 오류 발생");
            }

        });

        readThread.start();
        writeThread.start();

        readThread.join();
        writeThread.join();
    }

}
