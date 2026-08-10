package useful.ch15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordBook {
    public static void main(String[] args) {

        Map<String, String> words = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        words.put("apple", "사과");
        words.put("banana", "바나나");
        words.put("cherry", "체리");

        while (true) {
            System.out.println("\n==== 영/한 단어장 ====");
            System.out.println("1. 단어 추가 | 2. 단어 검색 | 3. 전체 출력 | 4. 종료");
            System.out.print("선택 : ");
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                System.out.println("추가할 영단어를 입력하세요");
                String eng = sc.nextLine();
                System.out.println("영단어의 뜻을 입력하세요");
                String kor = sc.nextLine();

                words.put(eng,kor);
            } else if (choice.equals("2")) {
                // 방어적 코드
                if (words.size() == 0) {
                    System.out.println("조회할 단어가 없습니다");
                }

                System.out.println("조회할 영단어를 입력하세요");
                String search = sc.nextLine();
                if (words.containsKey(search)) {
                    System.out.println(search + " : " + words.get(search));
                } else {
                    System.out.println("검색 결과가 없습니다.");
                }
            } else if (choice.equals("3")) {
                System.out.println("--- 전체 출력 ---");
                System.out.println(words);
            } else if (choice.equals("4")) {
                System.out.println("종료합니다");
                break;
            } else {
                System.out.println("번호를 잘못 입력했습니다");
            }

        }

    }
}
