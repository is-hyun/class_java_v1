package useful.ch12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Step1 {
    public static void main(String[] args) {

        // 실행 시점의 날짜 및 시간
        LocalDate today = LocalDate.now(); // 날짜
        LocalDateTime now = LocalDateTime.now(); // 날짜와 시간

        System.out.println("오늘 날짜ㅣ" + today);
        System.out.println("현재 시각 | " + now);

        System.out.println("------------------------------");

        // 원하는 날짜를 직접 설정
        LocalDate birth = LocalDate.of(2003,10,24);
        System.out.println("생년월일 | " + birth);
        System.out.println("출생요일 | " + birth.getDayOfWeek());

        // 요일 한글 표기
        System.out.println("출생요일 | " + birth.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));

    }
}
