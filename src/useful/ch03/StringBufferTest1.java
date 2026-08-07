package useful.ch03;

public class StringBufferTest1 {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("World");

        // 1. StringBuffer 사용
        StringBuffer buffer1 = new StringBuffer(str1);
        // = StringBuffer buffer1 = new StringBuffer("Hello");

        System.out.println(System.identityHashCode(buffer1)); // 189568618

        // 2. 문자열 더하기
        buffer1.append(str2);
        System.out.println(buffer1); // HelloWorld
        System.out.println(System.identityHashCode(buffer1)); // 189568618 >> 주소값 변경 안됨

        // 3. StringBuffer --> String 형변환
        String str3 = buffer1.toString();

        // 결론
        // StringBuffer를 사용하면 새 객체 생성 없이 내부 상태값을 변경하기 때문에 메모리 낭비를 방지
        // 즉, 문자열 사용이 많은 로직에서는 StringBuffer 사용을 권장함

    }
}
