package client_socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiThreadClient {
    public static void main(String[] args) {

        try (Socket socket = new Socket("192.168.5.17", 5001)) {
            System.out.println("=============== 서버 연결 완료 ===============");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            // 읽기 스레드 : 서버 메시지 수신
            Thread readThread = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = reader.readLine()) != null) {
                        // 프로토콜 1. exit
                        if ("exit".equalsIgnoreCase(serverMessage)) {
                            System.out.println("서버가 종료를 요청합니다");
                            break;
                        }
                        // 프로토콜 2
                        if ("🎉".equalsIgnoreCase(serverMessage)) {
                            System.out.println("  🎉상대방이 축하 메시지를 보냈습니다🎉");
                            break;
                        }
                        System.out.println("[서버 메시지] : " + serverMessage);
                    }
                } catch (Exception e) {
                    System.out.println("서버가 강제로 연결 종료했습니다");
                }
            });

            // 쓰기 스레드 : 키보드로 입력받아서 전송
            Thread writeThread = new Thread(() -> {
                try {
                    String clientMessage;
                    while ((clientMessage = keyboardReader.readLine()) != null) {
                        writer.println(clientMessage);
                        if ("exit".equalsIgnoreCase(clientMessage)) {
                            System.out.println("클라이언트 종료");
                            break;
                        }
                        if ("🎉".equalsIgnoreCase(clientMessage)) {
                            System.out.println("상대방에게 축하 메시지를 전송했습니다");
                            break;
                        }
                    }

                } catch (Exception e) {
                    System.out.println("메시지 전송 중 오류 발생");
                }
            });

            readThread.start();
            writeThread.start();

            readThread.join();
            writeThread.join();

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
