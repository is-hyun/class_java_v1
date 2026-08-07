package useful.ch12;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class OldWay {
    public static void main(String[] args) {

        // Date - JDK 1 버전에 만들어진 클래스
        // 1. 현재 시간 출력
        Date now = new Date();
        System.out.println("현재 시각 : " + now);

        // 출력 형식의 가시성이 떨어짐 >> 가공해서 사용


        // 2. 특정 날짜 만들기
        Date date = new Date(2025, 4, 12);
        System.out.println("2025.04.12 설정 : " + date);

        // 연도가 3925년으로 출력 | 월은 5월(May) 출력
        // Date의 연도는 1900를 기본값으로 더하기 때문에 2025를 입력하면 더해서 출력
        // Date의 월은 1월 = 0 부터 시작함.
        // year - 125 입력 | month - 3 입력
        Date date2 = new Date(125,3,12);
        System.out.println("2025.04.12 설정 : " + date2);

        // Date의 문제점 때문에 JDK 1.1 부터 Calendar 클래스 사용

        System.out.println("--------------------------");

        Calendar cal = Calendar.getInstance(); // 싱글톤 패턴이 구현되어 있어 메서드로 호출
        cal.set(2025,4,25);
        System.out.println("Calendar 20250412 : " + cal.getTime());

        // Calendar는 연도는 입력한 값으로 바로 출력되지만 month는 Date처럼 0부터 시작

        // 8버전부터 java.time 패키지를 제공
        LocalDate localDate = LocalDate.of(2025,4,12);
        System.out.println("LocalDate 20250412 : " + localDate );
        // 연/월/일 이 입력한 그대로 출력

    }

}
