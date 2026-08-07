package ch06;

import java.util.Scanner;

public class IfTest3_1 {
    public static void main(String[] args) {

        // 키보드 입력을 통해 값을 입력받을 수 있는 도구
        Scanner sc = new Scanner(System.in);

        System.out.println("사용자의 키보드 입력값을 기다리고 있어요...");
        // 스캐너를 통해 정수를 입력받음
        int age = sc.nextInt();

        if (age <= 7) {
            System.out.println("미취학아동");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        System.out.println("프로그램 종료");

    }
}
