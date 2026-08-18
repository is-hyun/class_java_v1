package client_socket.ch06;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * 서버와의 프로토콜 준수
 * [1바이트] + [N바이트] + [나머지]
 * */
public class FileClient {

    private static String HOST = "localhost";
    private static int PORT = 5000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // String filePath = sc.nextLine();
        System.out.println("전송할 파일 경로 예. C:\\work_space\\test.txt");
        String filePath = "C:\\lsh\\work_space\\java_class_1\\java_v1\\assets\\a.txt";

        File file = new File(filePath);

        if (!file.exists() || !file.isFile()) {
            System.out.println("파일이 존재하지 않거나 폴더 경로입니다 | " + filePath);
            return;
        }

        // 클라이언트 입장에서 서버에 경로를 제외하고 파일명만 전송
        // >> 전체 경로에서 파일 이름만 추출해서 저장해야 함
        String fileName = file.getName();
        byte[] nameBytes = fileName.getBytes();

        // 이름의 길이는 255를 초과할 수 없음 (1바이트에 담기 때문)
        // 한글은 UTF-8 기준 85글자가 최대
        if (nameBytes.length > 255) {
            System.out.println("파일 이름의 최대 길이를 초과했습니다 (최대 255바이트)");
            return;
        }

        System.out.println("전송할 파일 : " + fileName + " (" + file.length() + "바이트)");

        try (Socket socket = new Socket(HOST, PORT)) {

            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream(); // >> 서버 응답 수신
            // --------------------------------------------------------
            // 1. 파일 이름 길이 (전송)
            // --------------------------------------------------------
            out.write(nameBytes.length);

            // --------------------------------------------------------
            // 2. 파일 이름 (전송)
            // --------------------------------------------------------
            out.write(nameBytes);

            // --------------------------------------------------------
            // 3. 파일 내용 (전송)
            // --------------------------------------------------------
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] buffer = new byte[4096];
                int byteRead;
                while ((byteRead = fis.read(buffer)) != -1) {
                    out.write(buffer, 0, byteRead);
                }
            }
            out.flush();

            // --------------------------------------------------------
            // 4. 완료 응답 (전송)
            // --------------------------------------------------------
            // >> 소켓의 출력 방향만 닫음.
            System.out.println("=== 전송 완료 ===");
            socket.shutdownOutput();

            // --------------------------------------------------------
            // 5. 완료 응답 (수신)
            // --------------------------------------------------------
            byte[] responseBuffer = new byte[1024];
            int responseLength = in.read(responseBuffer);
            if (responseLength > 0) {
                System.out.println("[서버] >> " + new String(responseBuffer, 0 , responseLength));
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
