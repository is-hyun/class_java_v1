package useful.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * 나이 목록에서 18세 이상만 고르는 코드
 * 2가지 방법으로 작성
 * */

public class StreamDemo1 {
    public static void main(String[] args) {

        // int[] arr = {1, 2, 3}
        // List<Integer> ages = new ArrayList<>();
        // ages.add(50);
        // ages.add(20);
        // ages.add(7);

        List<Integer> ages = Arrays.asList(20, 11, 18, 24, 33, 40, 2);

        // 방법 1
        List<Integer> adults = new ArrayList<>();
        for (int age : ages) {
            if (age >= 18) {
                adults.add(age);
            }
        }
        System.out.println("for문 : " + adults);

        // 방법 2 - Stream 방식
        List<Integer> adults2 = ages.stream().filter(age -> age >= 18).toList();

        System.out.println("Stream : " + adults2);
    }
}
