package _http.ch03;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class TodoClient {
    public static void main(String[] args) {

        // HTTP 통신을 활용한 단건 조회
        String urlString = "https://jsonplaceholder.typicode.com/todos/1";
        HttpURLConnection connect = null;

        try {

            URL url = new URL(urlString);
            connect = (HttpURLConnection) url.openConnection();

            // HTTP 메서드 설정
            connect.setRequestMethod("GET");

            int responseCode = connect.getResponseCode(); // 통신
            System.out.println("상태 코드 확인 : " + responseCode); // 상태 코드 확인

            // 방어적 코드
            if (responseCode != 200) {
                System.out.println("! 요청 실패");
                return;
            }

            // 응답 본문(HTTP BODY) 확인
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connect.getInputStream()))) {
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append("\n");
                }

                // GSON 라이브러리 활용
                Gson gson = new Gson();
                // fromJson(json 문자열, 변환할 클래스)
                Todo todo = gson.fromJson(sb.toString(), Todo.class);
                System.out.println("[파싱 결과]");
                System.out.println("userId : " + todo.getUserId());
                System.out.println("id : " + todo.getId());
                System.out.println("title : " + todo.getTitle());
                System.out.println("completed : " + todo.isCompleted());
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (connect != null) {
                connect.disconnect();
            }
        }

    }
}
