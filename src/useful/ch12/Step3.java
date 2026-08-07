package useful.ch12;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;

public class Step3 {
    public static void main(String[] args) {

        // Period - 나이와 D-day 구하기
        LocalDate birth = LocalDate.of(2003, 10, 24);
        LocalDate today = LocalDate.of(2026, 8, 7);

        // Period 클래스 - 연/월/일 의 세 int를 묶어서 담아두는 클래스
        Period age = Period.between(birth, today);

        System.out.println("나이 : " + age.getYears() + "세");
        System.out.println("태어난 지 정확히 " + age.getYears() + "년 " + age.getMonths() + "개월 " + age.getDays() + "일 지났습니다.");

        // Period를 바로 출력하지 않음
        //System.out.println(age); // >> P22Y9M14D
        // 사람이 읽는 형식으로 출력되지 않음
    }
}
