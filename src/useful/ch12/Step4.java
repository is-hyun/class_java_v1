package useful.ch12;

import java.time.Duration;
import java.time.LocalTime;

public class Step4 {
    public static void main(String[] args) {

        // LocalDateTime tempNow = LocalDateTime.now();
        // System.out.println(tempNow);

        LocalTime start = LocalTime.of(9,0);
        LocalTime end = LocalTime.of(11,30);

        // 두 시각 사이의 간격을 Duration 객체로 만들 수 있음
        Duration work = Duration.between(start, end);
        System.out.println("총 : " + work.toMinutes() + "분");
        // toMinutes() 메서드 - 시간과 분 전체를 분으로 통합해서 표현

        // to__Part() 메서드 - 원하는 단위(시간/분)에 해당하는 값만 반환
        System.out.println("총 : " + work.toHoursPart() + "시간"); // 시간만 출력
        System.out.println("총 : " + work.toMinutesPart() + "분"); // 분만 출력

    }
}
