package _http.ch07.bf;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

/*
 * 순수 자바로 만드는 HTTP 서버
 * === 등장 클래스 ===
 * HttpServer : 포트를 열고 연결을 받는 것을 담당
 * HttpHandler : 특정 경로의 처리 로직을 담당
 * HttpExchange : 요청 하나의 내용과 응답에 대한 처리를 담당
 */
public class SimpleHttpServer {

    private static final int PORT = 8080;
    private static final int THREAD_POOL_SIZE = 10; // * 미리 생성해 두는 스레드 개수

    static final String TYPE_HTML = "text/html; charset=UTF-8";
    static final String TYPE_TEXT = "text/plain; charset=UTF-8";
    static final String TYPE_JSON = "application/json; charset=UTF-8";

    public static void main(String[] args) throws IOException {

        // 1. HTTP 서버 객체 생성
        /*
         * 지금까지 사용하던 ServerSocket(8080)과 같은 역할은 한다
         * 둘 다 해당 포트로 들어오는 연결을 받겠다고 운영체제에 등록하는 역할을 한다
         * 차이는 받는 바이트를 해석하는 주체에 있다
         *
         * 첫 번째 인자 : InetSocketAddress = 주소 + 포트
         * new InetSocketAddress("127.0.0.1", 8080) 정해진 주소로 들어온 요청만 받고, 외부에서의 요청은 받지 않는다
         *
         * 두 번째 인자 : 블로킹, 대기 큐 크기
         * 서버가 아직 처리하지 못한 연결이 대기하는 자리 수
         * 0이나 음수를 부여하면 현재 코드에서는 내부적으로 50으로 바꿔서 임의 처리한다
         */
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);

        // 2. 경로와 담당 핸들러 연결
        /*
         * /signup 과 같은 약속된 경로가 들어오면 특정 메서드(핸들러)나 객체를 실행하도록 미리 정의해야 함
         * 등록 순서는 상관 없다. 요청이 들어오면 가장 길게 일치하는 경로가 자동 선택된다.
         * (예. /api/users 요청이 들어오면 "/"와 "/api/users" 둘 다 해당되지만 더 긴 쪽이 선택된다.)
         */
//        server.createContext("/", null);
        server.createContext("/health", new HealthHandler());
        // 접근 경로 예시
        // - http://localhost:8080/health  >> OK 응답

        // 3. 요청을 처리할 스레드 풀 지정
        // http 서버는 멀티 스레드 프로그램이므로 미리 생성할 스레드를 지정한다
        server.setExecutor(Executors.newFixedThreadPool(THREAD_POOL_SIZE));

        // 4. 서버 시작
        /*
         * main은 여기서 끝나고, 서버는 별도 스레드에서 계속 실행
         * main이 끝나도 프로그램이 끝나지 않는 이유는 HttpServer가 만든 스레드가 아직 살아있기 때문이다
         * 멈출 때는 종료 버튼을 눌러 종료한다
         */
        server.start();
        System.out.println("=== HTTP 서버 시작 ===");
    } // main

}