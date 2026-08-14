package client_socket.ch03;

import com.oop14.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class WhileClient {
    public static void main(String[] args) {

        // 1. 서버에 연결 요청
        try (Socket socket = new Socket("127.0.0.1", 5000)) {

            System.out.println("=== 서버 연결 완료 ===");

            // 입출력 스트림
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // 3. 클라이언트 측 키보드 스트림
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));
            // 3.1 메시지 입력 후 서버 전송
            String line;
            while (true) {
                System.out.println("-- 콘솔 로그 -- 내용 입력 --");
                String clientMessge = keyboardReader.readLine(); // 블로킹
                writer.println(clientMessge); // 서버에 전송

                // exit 입력하면 종료
                if ("exit".equalsIgnoreCase(clientMessge)) {
                    break;
                }
            }
            // 4. 서버의 응답 메시지 수신
            String response = reader.readLine();
            System.out.println("서버 응답 >> \" " + response + " \"");


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
