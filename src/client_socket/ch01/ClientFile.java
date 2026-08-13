package client_socket.ch01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientFile {
    public static void main(String[] args) {

        // localhost = 127.0.0.1
        try (Socket socket = new Socket("192.168.5.11", 5000)) {

            System.out.println("클라이언트 : 서버에 연결되었습니다");

            // 서버 측으로 메시지를 보내기 위한 출력 스트림
            // socket + PrintWriter (+ autoFlush)
            socket.getOutputStream();

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            pw.println("안녕 서버야 나는 클라이언트야."); // 마지막에 자동으로 \n 추가

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
