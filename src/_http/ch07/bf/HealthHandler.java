package _http.ch07.bf;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/*
 * 핸들러(Handler) : 처리 담당. 프로그래밍에서 어떤 일이 발생했을 때 실행될 코드를 가리킬 때 사용.
 */

public class HealthHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        try {
            // 1. 보낼 내용을 준비
            String bodyText = "OK";

            // 2. 문자열을 바이트 배열로 변경
            byte[] bodyBytes = bodyText.getBytes(StandardCharsets.UTF_8);

            // 3. 응답의 종류를 헤더에 명시 ( 응답 HTTP 메시지 )
            exchange.getResponseHeaders().set("Content-Type", SimpleHttpServer.TYPE_TEXT);

            // 4. 상태 코드와 본문 길이를 지정하며 헤더를 실제로 내보내기
            exchange.sendResponseHeaders(200, bodyBytes.length);

            // 5. 헤더를 내보낸 후에 본문 통로가 열림
            // getResponseBody()는 OutputStream 타입으로 문자열 대신 바이트를 사용
            try (OutputStream out = exchange.getResponseBody()) {
                out.write(bodyBytes);
            }

        } finally {
            exchange.close();
        }

    }
}
