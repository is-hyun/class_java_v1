package useful.ch15;

import java.util.HashMap;
import java.util.Map;

public class ScoreHashMap {
    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();

        // 추가 (put)
        scores.put("철수", 90);
        scores.put("영희", 85);
        scores.put("민준", 92);
        scores.put("철수", 100);
        // 중복 키를 추가하면 값은 덮어쓰기 됨
        // >> 업데이트 기능 구현 가능

        // 조회 (get)
        System.out.println(scores.get("철수")); // 키가 있으면 value 반환
        System.out.println(scores.get("없는 키")); // >> null 반환

        // 포함 여부
        System.out.println(scores.containsKey("철수")); // 키가 존재 여부 확인 -> T/F
        System.out.println(scores.containsValue(85)); // 값이 존재 여부 확인

        // 삭제
        //scores.remove("철수"); // 키 값이 일치하는 경우 삭제
        int removedResult = scores.remove("철수"); // 키에 해당하는 value 반환 후 삭제
        System.out.println(removedResult);
        //scores.remove("철수", 21); // 키-값이 전부 일치하는 경우만 삭제
        System.out.println(scores);

        // 크기 확인
        System.out.println(scores.size());

        // 전체 순회
        for (String k : scores.keySet()) {
            System.out.println(k + " : " + scores.get(k)); // 키에 해당하는 값 반환
        }

    }
}
