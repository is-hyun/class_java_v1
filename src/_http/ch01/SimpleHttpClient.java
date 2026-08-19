package _http.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

// HTTP 통신으로 접근할 서버 주소
// https://jsonplaceholder.typicode.com          >> 서버 주소
//                                     /todos/1  >> 엔드 포인트
// https://jsonplaceholder.typicode.com/todos/1  >> 요청 완성 주소
public class SimpleHttpClient {
    public static void main(String[] args) {

        String baseURL = "https://jsonplaceholder.typicode.com";
        String urlString = baseURL + "/todos/2";
        // ==========================================================
        // 존재하는 사이트의 주소로 실행 가능
        //String urlString = "https://www.google.com/webhp?hl=ko";
        // ==========================================================
        HttpURLConnection connection = null;

        try {
            // 1단계 - URI로 파싱(Parsing)한 뒤 URL 객체로 변환
            URI uri = URI.create(urlString);
            URL url = uri.toURL();

            // 2단계 - 연결 객체 생성 ( 아직 미연결 )
            connection = (HttpURLConnection) (url.openConnection()); // 다운캐스팅

            // 3단계 - 요청 방식 설정 ( Method 등 )
            // GET 메서드
            // ! GET 방식에는 요청 메시지의 HTTP 바디 영역이 없다.
            connection.setRequestMethod("GET");
            // 추가 설정 세팅 가능
            connection.setRequestProperty("Accept", "application/json");

            // 4단계 - TCP 연결 + 요청 전송
            int responseCode = connection.getResponseCode();
            System.out.println("HTTP 상태 코드 : " + responseCode);  // HTTP 상태 코드 : 200 >> 성공

            // 방어적 코드
            if (responseCode != 200) {
                // 실패 응답의 본문은 getInputStream() 대신,
                // getErrorStream()으로 읽어야 함
                System.out.println("! 요청 실패");
                return;
            }

            // 5단계 - HTTP BODY(본문) 읽기
            // 데이터 추출 ( 보조 스트림 활용 )
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder response = new StringBuilder(); // StringBuffer와 유사
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line).append("\n"); // 한 줄 처리하고 줄바꿈
                }
                System.out.println("\n=== 응답 메시지 ===");
                System.out.println(response);
                System.out.println("===== END =====");
            }


        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // HttpURLConnection는 try-with-resources를 사용할 수 없음
            // (문법적으로 인터페이스 Closeable이 구현되지 않음)

            // 6단계 - 연결 종료
            if (connection != null) {
                connection.disconnect(); // 연결 종료
            }
        }

    }
}
