package useful.ch03;

public class StringTest1 {
    public static void main(String[] args) {

        String s1 = "aaa";
        String s2 = "aaa";
        String s3 = new String("aaa");
        String s4 = new String("aaa");

        // == 참조 비교 : 주소값 비교
        System.out.println("s1 == s2 : " + (s1 == s2)); // true
        // >> 한 번 생성한 문자열은 다시 생성하지 않기 때문에 주소값을 공유

        System.out.println("s3 == s4 : " + (s3 == s4)); // false
        // >> 객체를 생성할 때마다 heap 메모리의 다른 주소에 저장됨

        // Object 클래스의 equals() 메서드
        // 기본 동작은 주소값 비교이지만, String에 대해서는 내부적으로 재정의 되어 있어 문자열 내용을 비교함(논리적 동등성)
        System.out.println("s3.equals(s1) : " + s3.equals(s1)); // true

        // ! 문자열을 논리 비교할 때는 참조 비교 대신 equals()를 사용해야 함


    }
}
