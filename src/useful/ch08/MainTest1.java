package useful.ch08;

public class MainTest1 {
    public static void main(String[] args) {

        // 1. 박싱과 언박싱 직접 호출
        int num = 3;
        Integer num2 = Integer.valueOf(3);  // 박싱 : int -> Integer 객체
        int num3 = num2.intValue();            // 언박싱 : Integer -> int

        System.out.println(num2);
        System.out.println(num3);

        // 자바 5.ver 부터 자동 박싱/언박싱 제공

        // 2. 자동 박싱 / 자동 언박싱
        Integer num4 = 17;  // 자동 박싱 - 컴파일러가 Integer.valuof(17) 호출
        int num5 = num4;    // 자동 언박싱 - 컴파일러가 num4.intVaule() 호출

        System.out.println(num4);
        System.out.println(num5);

    }
}
