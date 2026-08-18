package client_socket.ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiChatClient {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("닉네임을 입력하세요 : ");
        String name = sc.nextLine();

        try (Socket socket = new Socket("127.0.0.1", 5002)) {

            System.out.println("===== 서버 입장 =====");
            System.out.println(name + "님, 환영합니다(종료| exit)");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            // 읽기 스레드
            Thread readThread = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = reader.readLine()) != null) {
                        // 프로토콜
                        if ("exit".equalsIgnoreCase(serverMessage)) {
                            System.out.println("서버가 종료를 요청합니다");
                            break;
                        }
                        System.out.println("[서버 메시지] : " + serverMessage);
                    }
                } catch (Exception e) {
                    System.err.println("서버가 강제로 연결 종료했습니다");
                }
            });

            // 쓰기 스레드
            Thread writeThread = new Thread(() -> {
                String clientMessage;
                try {
                    while ((clientMessage = keyboardReader.readLine()) != null) {
                        writer.println(name + " : " + clientMessage);
                        if ("exit".equalsIgnoreCase(clientMessage)) {
                            System.out.println("클라이언트 종료");
                            writer.println(name + "님이 퇴장했습니다");
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("메세지 전송 중 오류 발생");
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
