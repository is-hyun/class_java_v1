package useful.ch13;

import java.util.ArrayList;
import java.util.List;

public class MyStore {
    public static void main(String[] args) {

        // 방법 1 : ArrayList 타입 선언
        ArrayList<String> list1 = new ArrayList<>();

        // 방법 2 : List 타입으로 선언
        List<String> list2 = new ArrayList<>();

        // 추가
        // arry[0]
        list1.add("사과");
        list1.add(1,"포도");
        System.out.println(list1);

        // 조회
        list1.get(0);
        list1.size(); // 실제 값이 대입되어 있는 요소의 개수
        list1.contains("사과"); // 포함 여부 반환 -> T/F
        list1.indexOf("사과"); // 위치 반환 -> 없으면 -1 반환

        // 삭제
        list1.remove("사과");
        list1.remove(0);
        list1.clear(); // 전체 삭제

        // 확인
        list1.isEmpty(); // 비어있는지 판단 -> T/F

        System.out.println("-------------------------");



    }
}
