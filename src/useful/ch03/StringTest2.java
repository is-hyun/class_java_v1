package useful.ch03;

public class StringTest2 {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("World");
        Dog dog = new Dog();

        System.out.println(dog); // 기본적으로 참조 변수를 직접 출력하면 주소값 출력
        System.out.println(str1); // String은 주소 대신 문자열 출력

        // String 실제 주소
        System.out.println(System.identityHashCode(str1)); // 해시코드

        // 문자열 불변 - 한 번 생성된 문자열은 불변. 변경이 일어나면 새 문자열이 생성되는 구조

        str1 = str1 + "world";
        System.out.println("str + world : " + str1);
        System.out.println(System.identityHashCode(str1)); // 해시코드값 변경

        
    }
}

class Dog {
    String name;
}
