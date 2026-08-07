package useful.ch12;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Step6 {
    public static void main(String[] args) {

        LocalDate birth = LocalDate.of(2003, 10, 24);
        LocalDateTime today = LocalDateTime.of(2025,5,13,14,30);
        LocalDate chrismas = LocalDate.of(2025,12,25);

        Period age = Period.between(birth, today.toLocalDate());
        long day = ChronoUnit.DAYS.between(birth, today);

        System.out.println("생일 요일 : " + birth.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREA));
        System.out.println("만 나이 : " + age.getYears() + "세");
        System.out.println("살아온 날 : " + day + "일");

        long chrisDday = ChronoUnit.DAYS.between(today.toLocalDate(),chrismas);
        System.out.println("크리스마스까지 : " + chrisDday + "일");

        DateTimeFormatter fomat = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분");
        System.out.println(today.format(fomat));

    }
}
