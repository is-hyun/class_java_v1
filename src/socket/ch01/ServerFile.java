package socket.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {
    // 내 IP 주소 : 192.168.5.17
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(5000)) {

            System.out.println("서버 측 프로그램 시작 - 포트 번호 : 5000 에서 대기 중...");
            // 클라이언트가 내 IP 주소와 포트번호를 사용해서 연결할 때까지 이 줄에서 대기(블로킹)
            Socket socket = serverSocket.accept();

            // I/O 스트림 사용
            // 스트림 체이닝 - socket + 브릿지(InputStreamReader) + BufferedReader
            InputStream in = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            // 클라이언트가 보낸 데이터를 한 줄 읽어 보자
            String message = br.readLine();
            System.out.println("클라이언트가 보낸 메시지 : " + message);

            System.out.println("클라이언트가 연결되었습니다");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
