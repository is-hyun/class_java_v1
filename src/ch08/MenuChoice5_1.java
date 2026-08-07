package ch08;

import java.util.Scanner;

public class MenuChoice5_1 {
    public static void main(String[] args) {

        // CRUD
        // name 변수를 사용해 CRUD 구현
        Scanner sc = new Scanner(System.in);

        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int CLOSE = 0;
        String name = "";

        boolean isName = false;

        while (true) {
            System.out.println("\n메뉴 선택");
            System.out.println("1. 등록 | 2. 조회 | 3. 수정 | 4. 삭제 | 0. 종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();

            if (name != "") {
                isName = true;
            }

            sc.nextLine(); // 계행문자 소비

            if (choice == CREATE) {
                // name 변수에 스캐너를 사용해 이름을 등록하는 기능 구현
                if (!isName) {
                    System.out.println("등록을 선택했습니다.");
                    System.out.print("이름 : ");
                    name = sc.nextLine();
                } else {
                    System.out.println("이미 등록되어 있습니다.");
                }
            } else if (choice == READ) {
                // name을 출력하는 기능 구현
                if (isName) {
                    System.out.println("조회를 선택했습니다.");
                    System.out.println("이름 : " + name);
                } else {
                    System.out.println("조회할 이름이 없습니다.");
                }
            } else if (choice == UPDATE) {
                // name을 수정하는 기능 구현
                if (isName) {
                    System.out.println("수정을 선택했습니다.");
                    System.out.println("기존 이름 : " + name);
                    System.out.print("수정할 이름 : ");
                    name = sc.nextLine();
                } else {
                    System.out.println("등록된 이름이 없어 수정할 수 없습니다.");
                }
            } else if (choice == DELETE) {
                // name을 삭제하는 기능 구현
                if (isName) {
                    System.out.println("삭제를 선택했습니다.");
                    name = "";
                } else {
                    System.out.println("삭제할 이름이 없습니다.");
                }
            } else if (choice == CLOSE) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }

        sc.close();
    }
}

