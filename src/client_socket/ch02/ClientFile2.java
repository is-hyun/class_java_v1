package client_socket.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientFile2 {
    public static void main(String[] args) {

        // localhost = 127.0.0.1
        try (Socket socket = new Socket("127.0.0.1", 5000)) {

            System.out.println("---------- 서버 연결 완료 ----------");

            // 문자 기반 쓰기 스트림. 클라이언트 --> 서버
            PrintWriter writerToServer = new PrintWriter(socket.getOutputStream(), true);
            // 문자 기반 읽기 스트림. 서버 --> 클라이언트
            BufferedReader readerServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 서버로 보내는 메시지
            writerToServer.println("안녕 서버야. 나는 클라이언트야");

            // 서버의 응답 메시지 수신
            String reMessage =  readerServer.readLine();
            System.out.println("서버 응답 : " + reMessage);

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
