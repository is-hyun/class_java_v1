package useful.ch12;

import java.time.Duration;
import java.time.LocalTime;

public class Step7 {
    public static void main(String[] args) {

        int sum = 0;

        LocalTime start = LocalTime.now();  // 시작 시간

        for (int i = 1; i <= 100_000_000; i++) {
            sum += i;
        }

        LocalTime end = LocalTime.now(); // 종료 시간

        Duration time = Duration.between(start, end);
        System.out.println("소요시간 : " + time.toMillis() + " 밀리초");

    }
}
