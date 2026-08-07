package com.oop7;

import java.util.Scanner;

public class GoingToSchool {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int EAT = 1;
        final int BUS = 2;
        final int SUBWAY = 3;
        final int MY_INFO = 4;
        final int END = 5;

        System.out.print("학생 이름을 입력하세요 : ");
        String name = sc.nextLine();

        // 객체 생성 (등장 인물 준비)
        Student student = new Student(name, 5_000);
        Rice rice = new Rice("김치볶음밥", 3000);
        Bus bus123 = new Bus(133, 1_000);
        Subway line1 = new Subway(1, 1_400);

        while (true) {
            System.out.println("\n메뉴 선택");
            System.out.println("1. 밥 먹기 | 2. 버스 타기 | 3. 지하철 타기 | 4. 상태 | 5. 종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();

            if (choice == EAT) {
                student.eatRice(rice);
            } else if (choice == BUS) {
                student.takeBus(bus123);
            } else if (choice == SUBWAY) {
                student.takeSub(line1);
            } else if (choice == MY_INFO) {
                student.info();
            } else if (choice == END) {
                System.out.println("종료합니다.");
                break;
            }
        }

    }
}
