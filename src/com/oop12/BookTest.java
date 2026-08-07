package com.oop12;

public class BookTest {
    public static void main(String[] args) {

        Book[] books = new Book[10];

        books[0] = new Book("플러터UI실전", "김근호", 300);
        books[1] = new Book("무궁화꽃이피었습니다","김진명",500);
        books[2] = new Book("흐르는강물처럼","파울로코엘료",250);
        books[3] = new Book("리딩으로리드하라","이지성",450);
        books[4] = new Book("사피엔스","유발하라리",850);

        books[9] = new Book("홍길동전","허균",350);
        // ! 객체에 대한 배열에는 각 인덱스에 객체에 대한 주소값이 들어간다

        // 객체 안에 접근해서 정보 가져오기
         String title1 = books[0].getTitle();
         String author1 = books[1].getAuthor();
         int total1 = books[0].getTotalPage();

        // ------------------------------------------------

//        for (int i = 0; i < books.length; i++) {
//            System.out.println(books[i].getTitle());
//        }

        // NullPointerException
        // >> 객체를 생성하지 않거나 가리키는 주소가 없을 때 발생하는 오류
        // 즉, null 값을 만나서 생긴 오류

        // 방어적 코드를 포함해서 수정
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
            }
        }
    }
}
