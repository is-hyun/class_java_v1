package _http.ch04;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UsersClient {
    public static void main(String[] args) {

        // 단건 조회
        String urlString = "https://jsonplaceholder.typicode.com/users/1";
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
            Users users = gson.fromJson(sb.toString(), Users.class);
            System.out.println("[파싱 결과]");
            System.out.println("id : " + users.getId());
            System.out.println("name : " + users.getName());
            System.out.println("username : " + users.getUsername());
            System.out.println("email : " + users.getEmail());
            // ===================================================================
            // System.out.println("address : " + users.getAddress());
            // >> Users.Address(...) - 클래스 명이 같이 출력
            System.out.println("address : " + gson.toJson(users.getAddress()));
            // 객체 address를 gson.toJson()으로 감싸서 JSON 형식으로 출력하면 클래스명이 붙지 않음
            // ===================================================================
            System.out.println("phone : " + users.getPhone());
            System.out.println("website : " + users.getWebsite());

            //System.out.println("company : " + users.getCompany());
            System.out.println("company : " + gson.toJson(users.getCompany()));


        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

    } // main
}
