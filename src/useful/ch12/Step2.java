package useful.ch12;

import java.time.LocalDate;

public class Step2 {
    public static void main(String[] args){

        LocalDate today = LocalDate.of(2026, 8, 7);

        System.out.println("100일 후 : " + today.plusDays(100));
        System.out.println("한 달 후 : " + today.plusMonths(1));
        System.out.println("일 년 전 : " + today.minusYears(1));

    }
}
