package socket.ch06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

    private static final int PORT = 5000;
    private static final String UPLOAD_DIR = "assets/uploads";

    // 서버-클라이언트 간의 약속 : 프로토콜
    // [1바이트] 파일 이름의 길이 (0 ~ 255)
    // [N바이트] 파일 이름
    // [나머지] 파일 내용 (클라이언트가 출력 방향을 닫으면 끝)

    public static void main(String[] args) {

        // File 객체 - 경로가 적힌 쪽지일 뿐, 실제 폴더나 파일이 아님
        File dir = new File(UPLOAD_DIR);
        // >> 실제로 uploads 폴더가 생성되지는 않고 해당 폴더의 경로를 가리키는 객체만 생성

        if (!dir.exists()) {
            // mkdirs() - 실제 폴더 생성 메서드
            //  * mkdir()과 달리 중간 경로까지 한번에 생성
            boolean created = dir.mkdirs();
            System.out.println("업로드 폴더 생성 : " + created);
        }

        System.out.println("파일 전송 서버 시작 - 포트 : " + PORT);
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            Socket socket = serverSocket.accept(); // 연결 전까지 블로킹

            System.out.println("클라이언트 연결 : " + socket.getInetAddress().getHostAddress());
            // >>

            // 소켓에 연결된 입출력 스트림
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            // --------------------------------------------------------
            // 1. 파일 이름 길이 (수신)
            // --------------------------------------------------------
            int nameLength = in.read();

            if (nameLength == -1) {
                System.out.println("클라이언트가 아무것도 전송하지 않고 종료했습니다");
                return;
            }
            System.out.println("파일 이름 길이 : 총 " + nameLength + "바이트");

            // --------------------------------------------------------
            // 2. 파일 이름 (수신)
            // --------------------------------------------------------
            byte[] nameBuffer = new byte[nameLength];
            int nameRead = 0; // 현재까지 읽은 바이트 수

            // read(값을 담을 배열, 시작 위치, 최대 개수) >> 요청한 만큼 반드시 읽어준다는 보장은 없음
            // >> 네트워크 사정에 따라 총 30바이트를 받는다고 해도 첫 번째에 3바이트만 올 수도 있다
            // 따라서, 놓치는 경우를 대비해 while문을 사용
            while (nameRead < nameLength) {
                int count = in.read(nameBuffer, nameRead, nameLength - nameRead);
                // 방어적 코드
                if (count == -1) {
                    throw new IOException("파일 이름을 받는 중에 연결이 끊겼습니다");
                }
                // 읽은 바이트만큼 커서 이동. 무한 루프 방지
                nameRead += count;
            }

            // 파일명 바이트 배열 -> 문자열로 변경
            String fileName = new String(nameBuffer);
            // 방어적 코드 - 악의적 클라이언트 방지
            if (fileName.contains("..") || fileName.contains("/") || fileName.contains("\\")) {
                System.out.println("허용되지 않는 파일 이름입니다 | " + fileName);
                return;
            }
            System.out.println("수신할 파일 이름 : " + fileName);

            // --------------------------------------------------------
            // 3. 파일 내용 (수신)
            // --------------------------------------------------------
            // 아직 실제 파일은 생성되지 않음
            File target = new File(dir, fileName);

            FileOutputStream fos = new FileOutputStream(target); // >> 파일 생성

            byte[] buffer = new byte[4096]; // 4KB - 운영체제가 디스크를 다루는 단위와 일치
            int bytesRead;
            long total = 0;

            // shutdownOutput() - 클라이언트가 소켓 close 전에 -1 전송
            // 클라이언트가 shutdownOutput()를 호출하면 read()가 -1 반환
            while ((bytesRead = in.read(buffer)) != -1) {
                fos.write(buffer,0,bytesRead);
                total += bytesRead;
            }
            System.out.println("=== 저장 완료 ===");
            System.out.println("저장 위치 : " + target.getPath() + " | 파일 크기 : " + total + "바이트");

            // --------------------------------------------------------
            // 4. 완료 응답 (전송)
            // --------------------------------------------------------
            // 클라이언트는 출력 방향만 닫았고 입력 방향은 살아 있는 상태
            // >> 서버의 응답을 정상적으로 수신
            out.write(("업로드 성공 : " + fileName).getBytes());
            out.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
