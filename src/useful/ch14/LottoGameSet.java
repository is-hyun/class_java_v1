package useful.ch14;

import java.util.*;

public class LottoGameSet {
    public static void main(String[] args) {

        Set<Integer> lotto = new HashSet<>();
        Random random = new Random();
        int count = 0;

        while (lotto.size() < 6) {
            int num = random.nextInt(45) + 1;
            lotto.add(num);
            count++;
        }

        System.out.println("이번주 로또 번호 : " + lotto);
        System.out.println("while문 총 실행 횟수 : " + count);

        System.out.println("------------------------------");

        // ArrayList 생성자 인자로 Set 계열을 사용해 List 계열 객체 생성
        List<Integer> sortedLotto = new ArrayList<>(lotto);

        // 오름차순 정렬
        Collections.sort(sortedLotto);
        System.out.println("오름차순 정렬 : " + sortedLotto);

    }
}
