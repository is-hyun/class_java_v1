package com.oop12;

import java.util.Scanner;

public class MyPhone {

    static int lastIndex = 0;
    static final String CHANGE_NAME = "1";
    static final String CHANGE_NUM = "2";

    // 1. 저장
    public static void save(Scanner sc, Phone[] phones) {
        System.out.println(">> 저장");

        // 방어적 코드
        if (lastIndex >= phones.length) {
            System.out.println("저장 공간 부족");
            return;
        }

        System.out.println("이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("번호를 입력하세요 (예. 010-OOOO-OOOO)");
        String number = sc.nextLine();

        Phone newPhone = new Phone(name, number);
        phones[lastIndex] = newPhone;
        lastIndex++;
    }

    // 2. 전체 조회
    public static void searchAll(Phone[] phones) {
        System.out.println(">> 전체 조회");

        // 방어적 코드
        if (lastIndex == 0) {
            System.out.println("저장된 번호가 없습니다");
            return;
        }

//        for (int i = 0; i < lastIndex; i++) {
//            System.out.println(phones[i].getName() + ", " + phones[i].getNumber());
//        }

        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null) { // 빈 공간 당겨오기 기능에 오류가 생길 걸 대비한 방어적 코드
                System.out.println(phones[i].getName() + ", " + phones[i].getNumber());
            }
        }

    }

    // 3. 이름 검색
    public static void serchName(Scanner sc, Phone[] phones) {
        System.out.println(">> 검색");

        if (lastIndex == 0) {
            System.out.println("저장된 번호가 없습니다.");
            return;
        }

        System.out.println("검색할 이름을 입력하세요");
        String targetName = sc.nextLine().trim();

        int targetIndex = -1;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null && phones[i].getName().equals(targetName)) {
                targetIndex = i;
                System.out.println(">> 검색 결과");
                phones[i].showInfo();
                break;
            }
        }
        if (targetIndex == -1) {
            System.out.println("해당하는 이름이 존재하지 않습니다");
            return;
        }
    }

    // 4. 수정
    public static void update(Scanner sc, Phone[] phones) {
        System.out.println(">> 수정");

        if (lastIndex == 0) {
            System.out.println("저장된 번호가 없습니다.");
            return;
        }

        System.out.println("이름을 검색하세요");
        String oldname = sc.nextLine();

        int targetIndex = -1;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null && phones[i].getName().equals(oldname)) {
                System.out.println(">> 현재 정보");
                phones[i].showInfo();
                targetIndex = i;

                // 이름 변경 / 번호 변경 선택하기
//                final String CHANGE_NAME = "1";
//                final String CHANGE_NUM = "2";

                System.out.println("\n1. 이름 변경 | 2. 번호 변경");
                String op = sc.nextLine().trim();
                if (op.equals(CHANGE_NAME)) {
                    System.out.println("변경할 이름을 입력하세요");
                    String newName = sc.nextLine();
                    phones[i] = new Phone(newName, phones[i].getNumber());
                    break;
                } else if (op.equals(CHANGE_NUM)) {
                    System.out.println("변경할 번호를 입력하세요");
                    String newNumber = sc.nextLine();
                    phones[i] = new Phone(phones[i].getName(), newNumber);
                    break;
                } else {
                    System.out.println("잘못된 번호를 입력하였습니다.");
                    break;
                }

            }
        }

        if (targetIndex == -1) {
            System.out.println("해당하는 이름이 존재하지 않습니다");
            return;
        }

    }

    // 5. 삭제
    public static void delete(Scanner sc, Phone[] phones) {
        System.out.println(">> 삭제");

        if (lastIndex == 0) {
            System.out.println("삭제할 번호가 없습니다.");
            return;
        }

        System.out.println("이름으로 검색하세요");
        String targetTitle = sc.nextLine().trim();

        int targetIndex = -1; // -1 못 찾았음을 의미하는 약속
        // 1.
        for (int i =0; i < phones.length; i++) {
            if (phones[i] != null && phones[i].getName().equals(targetTitle)) {
                targetIndex = i;
                break;
            }
        }

        // 2. 못 찾았으면 종료
        if (targetIndex == -1) {
            System.out.println("해당하는 이름이 존재하지 않습니다");
            return;
        }

        // 3. 삭제할 자리 뒤의 요소들을 한 칸씩 앞으로 당겨서 덮어쓰기
        for (int i = targetIndex; i < lastIndex - 1; i++) {
            phones[i] = phones[i + 1];
        }

        // 4. 맨 뒤 칸을 비우고 실제 개수를 하나 줄인다.
        phones[lastIndex - 1] = null;
        lastIndex--;

    }


    // -----------------------------------------------------------------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Phone[] phones = new Phone[100];

        // 샘플 데이터 3개
        phones[0] = new Phone("김철수", "010-1234-5678");
        phones[1] = new Phone("김영희", "010-2345-6789");
        phones[2] = new Phone("홍길동", "010-3456-7890");

        lastIndex = 3;

        //
        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_NAME = "3";
        final String UPDATE = "4";
        final String DELETE = "5";
        final String END = "6";

        while (true) {
            System.out.println("\n옵션 선택");
            System.out.println("1. 저장 | 2. 전체조회 | 3. 검색 | 4. 수정 | 5. 삭제 | 6. 종료");
            String option = sc.nextLine();

            if (option.equals(SAVE)) {
                save(sc, phones);
            } else if (option.equals(SEARCH_ALL)) {
                searchAll(phones);
            } else if (option.equals(SEARCH_NAME)) {
                serchName(sc, phones);
            } else if (option.equals(UPDATE)) {
                update(sc,phones);
            } else if (option.equals(DELETE)) {
                delete(sc, phones);
            } else if (option.equals(END)) {
                System.out.println("----- 종료 -----");
                break;
            } else {
                System.out.println("----- 잘못된 입력입니다 -----");
            }
        }

    }
}
