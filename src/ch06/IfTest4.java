package ch06;

import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {

        // 키보드 입력 도구
        Scanner scanner = new Scanner(System.in);
        System.out.print("성적을 입력하세요: "); // 같은 줄에 입력받기 위해 print 사용

        int score = scanner.nextInt();
        System.out.println("score : " + score);

        // 예제. 조건문을 사용해서 입력 받은 값에 따라 학점을 출력하는 프로그래밍을 만들어보다
        // 문제
        // 90점 이상 - A
        // 80점 이상 - B
        // 70점 이상 - C
        // 60점 이하 - D
        // 60점 미만 - F
        // 사용자가 값을 잘못 입력하는 경우를 위해 방어적 코드를 잘 작성해야 함
        // 입력값의 범위를 1 ~ 100 으로 지정


        if (score < 0 || score > 100) {
            System.out.println("잘못된 입력입니다. 프로그램을 다시 실행해주세요."); // 방어적 코드
            return; // 실행의 제어권 반납
        }

        /*
        // 1번 방식
        if (score >= 90) {
            System.out.println("학점은 A 입니다.");
        } else if (score >= 80) {
            System.out.println("학점은 B 입니다.");
        } else if (score >= 70) {
            System.out.println("학점은 C 입니다.");
        } else if (score >= 60) {
            System.out.println("학점은 D 입니다.");
        } else {
            System.out.println("학점은 F 입니다.");
        }
        */

        // 2번 방식
        char result = 'F';
        if (score >= 90) {
            result = 'A';
        } else if (score >= 80) {
            result = 'B';
        } else if (score >= 70) {
            result = 'C';
        } else if (score >= 60) {
            result = 'D';
        } else {
            result = 'F';
        }

        System.out.println("당신의 학점은 " + result + " 입니다.");

    }
}
