package useful.ch12;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Step5 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.of(2026,8,7,10,17);
        System.out.println(now); // >> 2026-08-07T10:17

        // 원하는 형식으로 포멧을 지정
        DateTimeFormatter kor = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"); // DD : day of year
        System.out.println(now.format(kor)); // >> 2026년 08월 219일

        DateTimeFormatter clock = DateTimeFormatter.ofPattern("a hh시 mm분", Locale.KOREA); // ??? 언어 설정 안해도 나오는 이유
        System.out.println(now.format(clock));

        DateTimeFormatter log = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(log));



    }
}
