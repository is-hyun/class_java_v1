package socket.ch02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile2 {
    // 내 IP 주소 : 192.168.5.17
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(5000)) {

            System.out.println("서버 측 프로그램 시작 - 포트 번호 : 5000 에서 대기 중...");
            // 클라이언트가 내 IP 주소와 포트번호를 사용해서 연결할 때까지 이 줄에서 대기(블로킹)
            Socket socket = serverSocket.accept();

            // 문자 기반 읽기 스트림. 클라이언트 --> 서버
            BufferedReader readerClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 문자 기반 쓰기 스트림. 서버 --> 클라이언트
            PrintWriter writerToCilent = new PrintWriter(socket.getOutputStream(), true);

            // 클라이언트가 보낸 데이터 한 줄 읽기
            String message = readerClient.readLine();
            System.out.println("클라이언트가 보낸 메시지 : " + message);

            // 서버 -> 클라이언트 응답 메시지
            writerToCilent.println("안녕 나는 서버야");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
