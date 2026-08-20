package _http.ch03;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class TodoListClient {
    public static void main(String[] args) {

        String urlString = "https://jsonplaceholder.typicode.com/todos";
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
                // ================================================================
                // HTTP 통신을 활용한 전체 조회
                // ================================================================
                // JSON Array 형태 파싱
                // 1. 타입 지정
                // >> fromJson() 메서드의 변환 타입으로 사용
                TypeToken<List<Todo>> typeToken = new TypeToken<List<Todo>>() {};
                // 2. 설계된 타입에 실제 파싱 처리 진행
                List<Todo> todoList = gson.fromJson(sb.toString(), typeToken.getType());

                System.out.println("전체 개수 : " + todoList.size());
                // 반복문으로 상위 JSON 3개 출력
                for (int i = 0; i < 3; i++) {
                    System.out.println(todoList.get(i));
                }
                // ================================================================
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
