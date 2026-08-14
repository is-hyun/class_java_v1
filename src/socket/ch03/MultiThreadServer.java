package socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(5001)) {
            Socket socket = serverSocket.accept();
            System.out.println("=============== 클라이언트 연결 완료 ===============");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            // 읽기 스레드 : 클라이언트에게 온 메시지만 수신
            Thread readThread = new Thread(() -> {
                try {
                    String clientMessage;
                    while ((clientMessage = reader.readLine()) != null) {
                        // 프로토콜 1
                        if ("exit".equalsIgnoreCase(clientMessage)) {
                            System.out.println("클라이언트가 종료를 요청합니다");
                            break;
                        }
                        // 프로토콜 2
                        if ("🎉".equalsIgnoreCase(clientMessage)) {
                            System.out.println("  🎉상대방이 축하 메시지를 보냈습니다🎉");
                            break;
                        }
                        System.out.println("[클라이언트 메시지] : " + clientMessage);
                    }
                } catch (IOException e) {
                    // throw new RuntimeException();
                    System.out.println("클라이언트가 강제로 연결 종료했습니다");
                }

            });

            // 쓰기 스레드 : 키보드로 입력받아서 전송
            Thread writeThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {

                        String serverMessage;
                        while ((serverMessage = keyboardReader.readLine()) != null) {
                            writer.println(serverMessage);
                            if ("exit".equalsIgnoreCase(serverMessage)) {
                                System.out.println("서버 종료");
                                break;
                            }
                            if ("🎉".equalsIgnoreCase(serverMessage)) {
                                System.out.println("상대방에게 축하 메시지를 전송했습니다");
                                break;
                            }
                        }

                    } catch (IOException e) {
                        System.out.println("메시지 전송 중 오류 발생");
                    }
                }
            });

            readThread.start();
            writeThread.start();

            readThread.join();
            writeThread.join();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    } // main
}
