package _http.ch07;

/*
 * GET 요청 처리
 * === 만드는 규칙 ===
 * 1. HttpHandler 인터페이스를 구현
 * 2. handler(HttpExchange) 메서드 하나를 재정의
 * 3. main에서 createContext로 경로를 짝지어 등록
 */

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class HomeHandler2 implements HttpHandler {

    private static final String HOME_PAGE = """
            <!doctype html>
            <html lang="ko">
              <head>
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <title>나의 HTTP 서버</title>
              </head>
              <body>
                <h1>내가 자바로 만든 순수 HTTP 서버</h1>
                <ul>
                  <li><a href="/health">서버 상태 확인</a></li>
                  <li><a href="/api/users">사용자 목록(JSON)</a></li>
                </ul>
              </body>
            </html>
            
            """;


    @Override
    public void handle(HttpExchange exchange) throws IOException {

        try {
            // "/" 경로를 처리하는 핸들러
            // !. 주의사항
            // "/"로 등록한 핸들러는 다른 핸들러가 맡지 않은 모든 경로를 받음
            // 따라서 정확히 "/" 인지 직접 확인하고, 만약 아니라면 404를 반환해야함

            String path = exchange.getRequestURI().getPath();

            if (!path.equals("/")) {
                SimpleHttpServer2.sendResponse(exchange, 404, SimpleHttpServer2.TYPE_TEXT, "404 Not Found : " + path);
                return;
            }

            // Content-Type을 text/html로 보내야 브라우저가 HTML로 해석한다
            SimpleHttpServer2.sendResponse(exchange, 200, SimpleHttpServer2.TYPE_TEXT, HOME_PAGE);
            // SimpleHttpServer2.sendResponse(exchange, 200, "text/plain", HOME_PAGE);
            // >> text/plain - 태그가 문자로 보인다

        } finally {
            exchange.close();
        }
    }
}
