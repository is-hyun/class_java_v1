package _http.ch07.practice;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.time.LocalDateTime;

public class TimeHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
            Time now = new Time(LocalDateTime.now().withNano(0).toString());
            // 나노초 이하 생략
            SimpleHttpServer3.sendJson(exchange, 200, now);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            exchange.close();
        }
    }
}
