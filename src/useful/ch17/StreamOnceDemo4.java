package useful.ch17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOnceDemo4 {
    public static void main(String[] args) {

        List<Integer> nubers = Arrays.asList(1, 2, 3);
        Stream<Integer> stream = nubers.stream();

        System.out.println("첫 번째 사용 : " + stream.count());
        // System.out.println("두 번째 사용 : " + stream.count());  // >> 예외 발생

        // 스트림은 일회성이다
        // 다시 사용하고 싶으면 새로 생성해야 함
        System.out.println("두 번째 사용(새로 생성) : " + nubers.stream().count());

    }
}
