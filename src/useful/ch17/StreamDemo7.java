package useful.ch17;

import java.util.Arrays;
import java.util.List;

// reduce - 최종연산
public class StreamDemo7 {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum = num.stream()
                .reduce(0, (a,b) -> a + b);

        System.out.println(sum);

    }
}
