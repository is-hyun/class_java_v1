package useful.ch17;

import com.oop14.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Stream 없이 구현
        // 1. 결과를 담을 빈 리스트 생성
        List<Integer> results = new ArrayList<>();
        System.out.println(results.isEmpty());

        // 2. 하나씩 꺼내서 처리
        for (int n : numbers) {
            // 3. 조건 검사 (filter)
            if (n % 2 == 0) {
                // 4. 계산한 값 리스트에 저장 (map, toList)
                results.add(n * n);
            }
        }
        System.out.println("for문 : " + results);

        System.out.println("-------------------------");

        // Stream
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();

        System.out.println(result.toString());

    }
}
