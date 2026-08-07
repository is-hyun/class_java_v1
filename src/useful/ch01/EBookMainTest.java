package useful.ch01;

public class EBookMainTest {
    public static void main(String[] args) {

        EBook eBook1 = new EBook(1,"홍길동전","허균");
        EBook eBook2 = new EBook(1,"홍길동전","허균");
        EBook eBook3 = new EBook(2,"춘향전","작자미상");
//        Dog dog1 = new Dog();

//        // 1.
//        eBook1.equals(eBook1); // true
//        // 2.
//        eBook1.equals(dog1); // false
//        // 3-1. 책 제목이 같으면 같은 책으로 판별
//        boolean result3 = eBook1.equals(eBook3);
//        System.out.println("result3 : " + result3); // true

        System.out.println("eBook1 : " + eBook1);
        System.out.println("eBook2 : " + eBook2);
        System.out.println("eBook3 : " + eBook3); // toString
        System.out.println("-----------------------------");
        System.out.println("eBook1 == eBook2 : " + (eBook1 == eBook2)); // >> false(참조 비교)
        System.out.println("eBook1.equals(eBook2) : " + (eBook1.equals(eBook2))); // >> true (논리적 동등성 비교)
        System.out.println("eBook1.equals(eBook3) : " + (eBook1.equals(eBook3))); // >> false (논리적 동등성 비교)


        System.out.println("eBook1.hashCode() : " + eBook1.hashCode());
        System.out.println("eBook2.hashCode() : " + eBook2.hashCode()); // eBook1과 동일 (필드값 일치)
        System.out.println("eBook3.hashCode() : " + eBook3.hashCode());



    }
}

class Dog {
    String name;
}