package useful.ch14;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        // 순서가 없고 중복 값을 저장하지 않음
        Set<String> set = new HashSet<>();

        // 추가
        set.add("철수");
        set.add("영희");
        set.add("철수");
        //System.out.println(set);
        System.out.println(set.toString());
        System.out.println(set.size());
        // >> 중복된 값은 덮어쓰기 됨
    }
}
