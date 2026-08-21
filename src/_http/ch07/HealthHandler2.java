package _http.ch07;

import _http.ch07.SimpleHttpServer2;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class HealthHandler2 implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
            SimpleHttpServer2.sendResponse(exchange, 200, SimpleHttpServer2.TYPE_HTML, "OK");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            exchange.close();
        }
    }
}
