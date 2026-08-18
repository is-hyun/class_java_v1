package socket.ch06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MultiFileServer {

    private static final int PORT = 5000;
    private static final String UPLOAD_DIR = "assets/uploads/multi";

    private static Vector<OutputStream> clientOutputList = new Vector<>();

    private static class ClientHandler extends Thread {
        private Socket socket;
        private InputStream in;
        private OutputStream out;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            File dir = new File(UPLOAD_DIR);

            if (!dir.exists()) {
                boolean created = dir.mkdirs();
                System.out.println("업로드 폴더 생성 : " + created);
            }

            try {
                out = socket.getOutputStream();
                in = socket.getInputStream();

                // 1. 파일 이름 길이
                int nameLength = in.read();

                if (nameLength == -1) {
                    System.out.println("클라이언트가 아무것도 전송하지 않고 종료했습니다");
                    return;
                }
                System.out.println("파일 이름 길이 : 총 " + nameLength + "바이트");

                // 2. 파일 이름
                byte[] nameBuffer = new byte[nameLength];
                int nameRead = 0;

                while (nameRead < nameLength) {
                    int count = in.read(nameBuffer, nameRead, nameLength - nameRead);
                    // 방어적 코드
                    if (count == -1) {
                        throw new IOException("파일 이름을 받는 중에 연결이 끊겼습니다");
                    }
                    nameRead += count;
                }

                String fileName = new String(nameBuffer);
                // 방어적 코드 - 악의적 클라이언트 방지
                if (fileName.contains("..") || fileName.contains("/") || fileName.contains("\\")) {
                    System.out.println("허용되지 않는 파일 이름입니다 | " + fileName);
                    return;
                }
                System.out.println("수신할 파일 이름 : " + fileName);

                // 3. 파일 내용
                File target = new File(dir, fileName);

                FileOutputStream fos = new FileOutputStream(target); // >> 파일 생성

                byte[] buffer = new byte[4096]; // 4KB - 운영체제가 디스크를 다루는 단위와 일치
                int bytesRead;
                long total = 0;

                while ((bytesRead = in.read(buffer)) != -1) {
                    fos.write(buffer,0,bytesRead);
                    total += bytesRead;
                }
                System.out.println("=== 저장 완료 ===");
                System.out.println("저장 위치 : " + target.getPath() + " | 파일 크기 : " + total + "바이트");


                // 4. 응답
                out.write(("업로드 성공 : " + fileName).getBytes());
                out.flush();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    } // clientHandler


    public static void main(String[] args) {

        System.out.println("1:N 파일 전송 서버 - 포트 " + PORT);
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {

            while (true) {
                Socket socket = serverSocket.accept();
                new ClientHandler(socket).start();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    } // main

}
