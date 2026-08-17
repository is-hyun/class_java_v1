package socket.ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MultiChatServer {

    private static final int PORT = 5002;
    // Vector는 멀티스레드 환경에서 안전한 동작을 한다
    private static Vector<PrintWriter> clientWriterList = new Vector<>();

    private static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;

        public ClientHandler(Socket socket) {
            this.socket = socket; // main에서 생성된 객체의 주소값 할당
        }

        // run() - Thread.start() 실행 시 코드를 수행하기로 약속되어 있는 메서드
        @Override
        public void run() {
            try {

                out = new PrintWriter(socket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                // 브로드 캐스트
                // >> 생성한 출력 스트림 자료구조에 저장
                clientWriterList.add(out);

                System.out.println("==== 클라이언트 접속 ====");
                System.out.println("현재 접속자 : " + clientWriterList.size() + "명");

                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("[메시지] : " + message);
                    // 받은 메시지를 연결된 모든 클라이언트에게 전송
                    broadcast(message);
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                // 클라이언트 강제 종료 및 exit(프로토콜)이 넘어오면
                // 서버 측 자료구조에서 출력 스트림 제거
                clientWriterList.remove(out);

                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        private void broadcast(String msg) {
            for (PrintWriter w : clientWriterList) {
                // 자료구조에 저장된 출력 스트림 전체를 꺼내서 하나씩 전송
                w.println(msg);
            }
        }

    } // ClientHandler

    public static void main(String[] args) {
        System.out.println("===== 서버 시작 =====");
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {

            while (true) {
                Socket socket = serverSocket.accept();
                // 클라이언트가 연결되면 새 객체를 생성
                // 연결된 소켓 객체 주소값을 해당 클래스 필드에 할당
                new ClientHandler(socket).start();
//                System.out.println("==== 클라이언트 접속 ====");
//                System.out.println("현재 접속자 : " + clientWriterList.size() + "명");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
