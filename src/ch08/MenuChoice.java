package ch08;

import java.util.Scanner;

public class MenuChoice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        while (true) {
            System.out.println("\n메뉴 선택");
            System.out.println("1. 등록 | 2. 조회 | 3. 수정 | 4. 삭제 | 0. 종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("등록을 선택했습니다.");
            } else if (choice == 2) {
                System.out.println("조회를 선택했습니다.");
            } else if (choice == 3) {
                System.out.println("수정을 선택했습니다.");
            } else if (choice == 4) {
                System.out.println("삭제를 선택했습니다.");
            } else if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
        */

        // 상수 활용
        // C R U D
        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int CLOSE = 0;

        while (true) {
            System.out.println("\n메뉴 선택");
            System.out.println("1. 등록 | 2. 조회 | 3. 수정 | 4. 삭제 | 0. 종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();

            if (choice == CREATE) {
                System.out.println("등록을 선택했습니다.");
            } else if (choice == READ) {
                System.out.println("조회를 선택했습니다.");
            } else if (choice == UPDATE) {
                System.out.println("수정을 선택했습니다.");
            } else if (choice == DELETE) {
                System.out.println("삭제를 선택했습니다.");
            } else if (choice == CLOSE) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }


    }
}

