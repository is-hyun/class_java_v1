package _http.ch07;

import _http.ch07.bf.SimpleHttpServer;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 /api/users
 GET : 목록 조회
 POST : 새 사용자 등록
*/
public class UserApiHandler2 implements HttpHandler {

    private static final List<User> userList = new ArrayList<>();
    // >> 실제로는 DB에 저장하지만 메모리 리스트로 대체.
    //    즉, 서버를 껐다가 다시 실행하면 내용이 전부 사라진다

    // 다음에 부여할 ID
    private static int nextId = 1;

    // static 초기화 블록
    // 클래스가 메모리에 처음 올라갈 때 딱 한 번만 실행되는 코드 묶음
    // 직접 호출하지 않고 JVM이 자동으로 실행
    static {
        addUser(new User("홍길동", "a@naver.com"));
        addUser(new User("김철수", "c@naver.com"));
    }

    private static synchronized int addUser(User user) {
        user.setId(nextId);
        nextId++;
        userList.add(user);
        return user.getId();
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        try {
            // /api/users 경로 + Method - GET, POST
            // 즉, 경로가 같아도 메서드가 다르면 하는 일이 달라짐
            // 그래서 핸들러 내에서 메서드로 한 번 더 구분
            String method = exchange.getRequestMethod();

            if (method.equals("GET")) {
                handleGet(exchange);

            } else if (method.equals("POST")) {
                handlePost(exchange);

            } else {
                // 405 응답 - Allow 헤더로 가능한 메서드를 고지
                exchange.getResponseHeaders().set("Allow", "GET / POST");
                // System.err.println("지원하지 않는 Method 입니다");
                SimpleHttpServer2.sendResponse(exchange, 405,
                        SimpleHttpServer2.TYPE_TEXT, "지원하지 않는 Method 입니다");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            exchange.close();
        }

    }

    private ArrayList<User> copyUserList() {
        return new ArrayList<>(userList);
        // >> 목록을 복사해서 돌려준다
    }
    // 원본을 그대로 넘기면 Gson이 JSON으로 변경하는 중에 다른 스레드가 POST로 add 요청을 한다면 예외가 발생한다
    // 즉, 순회 도중 ArrayList 크기가 바뀌면 예외를 던진다


    // GET 요청 - 사용자 목록 조회
    // List<User>를 그대로 넘기면 Gson이 JSON 배열로 변경
    private void handleGet(HttpExchange exchange) throws IOException {
        SimpleHttpServer2.sendJson(exchange, 200, copyUserList());
    }

    // POST 요청 - 새 사용자 추가
    // 요청 본문(HTTP BODY)이 존재함
    private void handlePost(HttpExchange exchange) throws IOException {
        // 1. HTTP 요청 본문(바디) 읽기
        String requestBody = SimpleHttpServer2.readRequestBody(exchange);
        System.out.println("POST 요청 [/api/users] 받은 본문 확인" + requestBody);

        // 2. JSON 문자열을 User 객체로 변환
        User user;
        try {
            user = new Gson().fromJson(requestBody, User.class);
        } catch (JsonSyntaxException e) {
            SimpleHttpServer2.sendResponse(exchange, 400,
                    SimpleHttpServer2.TYPE_TEXT, "JSON 형식이 옳바르지 않습니다");
            return;
        }

        // 3. 검증
        if (user == null || user.getName() == null || user.getName().isBlank()) {
            SimpleHttpServer2.sendResponse(exchange, 400,
                    SimpleHttpServer2.TYPE_TEXT, "name 은 필수 항목입니다");
            return;
        }

        if (user.getEmail() == null) {
            user.setEmail("");
        }

        // 4. 저장 처리
        // id 값은 고정값이 아니므로 저장 결과를 다시 돌려줌
        int newId = addUser(user);

        // 5. 등록 성공을 201 Created로 응답
        SimpleHttpServer2.sendJson(exchange, 201, user);
    }

}
