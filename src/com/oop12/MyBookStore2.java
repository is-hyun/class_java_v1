package com.oop12;

import java.util.Scanner;

public class MyBookStore2 {

    // 현재 저장된 실제 데이터 개수를 추적하는 공유 변수
    static int lastIndexNum = 0;

    // 저장 기능(C)
    public static void save(Scanner sc, Book[] books) {
        System.out.println("------- 저장하기 호출 -------");

        if (lastIndexNum >= books.length) { // 방어적 코드
            System.out.println("저장 공간이 가득 찼습니다");
            return;
        }

        System.out.println("책 제목을 입력하세요");
        String title = sc.nextLine();
        System.out.println("저자를 입력하세요");
        String author = sc.nextLine();

        Book book = new Book(title, author);
        books[lastIndexNum] = book;
        lastIndexNum++;
    }

    // 전체 조회 기능(R)
    public static void readAll(Book[] books) {
        System.out.println("------- 전체조회 호출 -------");

        if (lastIndexNum == 0) {
            System.out.println("저장된 책이 없습니다.");
            return;
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) { // 방어적
                System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
            }
        }
    }

    // 선택 조회 기능
    public static void searchTitle(Scanner sc, Book[] books) {
        System.out.println("------- 선택조회 호출 -------");

        if (lastIndexNum == 0) {
            System.out.println("저장된 책이 없습니다.");
            return;
        }

        System.out.println("조회할 책 제목을 입력하세요");
        String targetTitle = sc.nextLine();

        boolean isFine = false;
        for (int i =0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getTitle().equals(targetTitle.trim())) {
                    // trim() : 문자열의 앞뒤 공백 제거
                    //          중간 공백은 제거하지 않음
                    System.out.println("검색 결과 >> ");
                    books[i].showInfo();
                    isFine = true;
                    break;
                }
            }
        }
        if (!isFine){
            System.out.println("검색한 책을 찾을 수 없습니다.");
        }
    }

    // 전체 삭제 기능(D)
    public static void deleteAll(Book[] books) {
        System.out.println("------- 전체삭제 호출 -------");

        if (lastIndexNum == 0) {
            System.out.println("삭제할 책이 없습니다.");
            return;
        }

        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }

        lastIndexNum = 0; // 초기화
    }

    // 선택 삭제 기능
    public static void deleteByTitle(Scanner sc, Book[] books) {
        System.out.println("------- 선택삭제 호출 -------");

        if (lastIndexNum == 0) {
            System.out.println("삭제할 책이 없습니다.");
            return;
        }

        System.out.println("삭제할 책 제목을 입력하세요");
        String targetTitle = sc.nextLine().trim();

        int targetIndex = -1; // -1 못 찾았음을 의미하는 약속
        // 1.
        for (int i =0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(targetTitle)) {
                targetIndex = i;
                break;
            }
        }

        // 2. 못 찾았으면 종료
        if (targetIndex == -1) {
            System.out.println("검색한 책을 찾을 수 없습니다.");
            return;
        }

        // 3. 삭제할 자리 뒤의 요소들을 한 칸씩 앞으로 당겨서 덮어쓰기
        for (int i = targetIndex; i < lastIndexNum - 1; i++) {
            books[i] = books[i + 1];
        }

        // 4. 맨 뒤 칸을 비우고 실제 개수를 하나 줄인다.
        books[lastIndexNum - 1] = null;
        lastIndexNum--;

    }


    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[7];

        // 샘플 데이터 만들어두기
        books[0] = new Book("플러터UI실전", "김근호");
        books[1] = new Book("무궁화꽃이피었습니다", "김진명");
        books[2] = new Book("흐르는강물처럼", "파울로코엘료");
        books[3] = new Book("리딩으로리드하라", "이지성");
        books[4] = new Book("사피엔스", "유발하라리");

        lastIndexNum = 5;

        boolean flag = true;

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String DELETE_BY_TITLE = "5";
        final String END = "6";

        while (flag) {
            System.out.println("\n-------- 메뉴 선택 --------");
            System.out.println("1. 저장 | 2. 전체조회 | 3. 선택조회 | 4. 전체삭제 | 5. 선택삭제 | 6. 종료");
            String selectedNum = sc.nextLine();

            if (selectedNum.equals(SAVE)) {
                save(sc, books);
            } else if (selectedNum.equals(SEARCH_ALL)) {
                readAll(books);
            } else if (selectedNum.equals(SEARCH_BY_TITLE)) {
                searchTitle(sc, books);
            } else if (selectedNum.equals(DELETE_ALL)) {
                deleteAll(books);
            } else if (selectedNum.equals(DELETE_BY_TITLE)) {
                deleteByTitle(sc, books);
            } else if (selectedNum.equals(END)) {
                System.out.println("------- 종료 -------");
                // break;
                flag = false;
            } else {
                System.out.println("------- 잘못된 입력입니다. -------");
            }
        }

    }

    // + 선택 삭제 기능
}
