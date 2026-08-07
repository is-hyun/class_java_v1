package useful.ch01;

//import java.lang.String;
//import java.lang.*;   << 자동으로 생성되기 때문에 작성할 필요 없음

// Object 클래스는 모든 클래스의 최상위 클래스
// extend Object를 선언하지 않아도 자동 생성
public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "[ "+ title + ", " + author +" ]";
    }
    // info() 대신 사용 가능

    public static void main(String[] args) {

        Book book = new Book("데미안", "헤르만 헤세");
        Book book2 = book;
        Book boo3 = new Book("데미안", "헤르만 헤세");

        System.out.println(book == book2);
        System.out.println(book.equals(book2));
        System.out.println(book);

        System.out.println("--------------");
        System.out.println("로깅 1 - 책의 제목 : " + book.title);

        // 논리적으로 같은 객체라고 판별하고 싶을 때 equals() 메서드를 재정의해서 활용 가능
        // 단, equals() 재정의 시 반드시 해시코드도 함께 정의

    }
}
