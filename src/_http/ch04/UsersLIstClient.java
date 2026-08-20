package _http.ch04;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class UsersLIstClient {
    public static void main(String[] args) {

        // 전체 조회
        String urlString = "https://jsonplaceholder.typicode.com/users";
        HttpURLConnection connection = null;

        try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();

            // GET
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode(); // 상태 코드
            // 방어적 코드
            if (responseCode != 200) {
                System.out.println("! 요청 실패");
                return;
            }

            // HTTP BODY
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }

            // Gson 활용
            Gson gson = new Gson();
            // fromJson()
            // 1. 타입 지정
            TypeToken<List<Users>> typeToken = new TypeToken<List<Users>>() {};

            // 2. 설계한 타입에 실제 파싱 처리 진행
            List<Users> usersList = gson.fromJson(sb.toString(), typeToken.getType());

            // 3. 상위 2개만 출력
            for (int i = 0; i < 2; i++) {
                System.out.println(usersList.get(i));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

    } // main
}
