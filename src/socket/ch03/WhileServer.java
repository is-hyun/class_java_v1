package socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WhileServer {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(5000)) {

            System.out.println("--- 클라이언트의 연결을 기다립니다 ---");
            Socket socket = serverSocket.accept();
            System.out.println("=== 클라이언트 연결 완료 ===");

            // 입출력 스트림
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            // 서버 측 프로그램에서 키보드로 데이터 받아서 클라이언트 전송
            // 키보드 입력 스트림
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            // 클라이언트 전송 -> 서버 수신 -> 키보드 입력 -> 클라이언트에게 응답 전송
            // 수신
            String line;
            while ((line = reader.readLine()) != null) {
                // 프로토콜 : exit 문자열이 들어오면 종료
                if ("exit".equalsIgnoreCase(line)) {
                    break;
                }
                System.out.println("클라이언트 >> \" " + line + " \"");
            }

            // 서버 측에서 키보드 입력값 전송
            System.out.println("-- 콘솔 로그 -- 내용 입력 --");
            String serverKeyboardMessage = keyboardReader.readLine();
            writer.println(serverKeyboardMessage);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
