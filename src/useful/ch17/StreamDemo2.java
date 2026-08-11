package useful.ch17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// 스트림 만드는 방법
public class StreamDemo2 {
    public static void main(String[] args) {

        // 1. 컬렉션에서 만들기
        List<String> list = Arrays.asList("사과", "바나나", "포도");
        Stream<String> s1 = list.stream();

        // 2. 배열에서 만들기
        String[] arr = {"사과", "바나나", "포도"};
        Stream<String> s2 = Arrays.stream(arr);

        // 3. 값을 직접 나열해서 만들기
        Stream<String> s3 = Stream.of("사과", "바나나", "포도");

        System.out.println("s1의 개수 : " + s1.count());
        System.out.println("s2의 개수 : " + s2.count());
        System.out.println("s3의 개수 : " + s3.count());

        System.out.println("원본 데이터 : " + list);

    }
}
