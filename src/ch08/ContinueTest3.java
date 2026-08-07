package ch08;

public class ContinueTest3 {
    public static void main(String[] args) {

        // 369 게임
        // 나머지 연산자와 10을 활용하면 1의 자리 수를 구할 수 있다.

        // 방법 1
        for (int i = 1; i <= 30; i++) {
            if ((i % 10) % 3 == 0) {
                System.out.println("짝!");
                continue;
            }
            System.out.println(i);
        }

        // 방법 2
        for (int i = 1; i <= 30; i++) {
            int last = i % 10;
            if (last % 3 == 0) {
                System.out.println("짝!");
                continue;
            }
            System.out.println(i);
        }

        // 379게임
        for (int i = 1; i <= 30; i++) {
            int last = i % 10; // 1의 자리
            if (last == 3 || last == 7 || last == 9) {
                System.out.println("짝!");
            } else if (i == 30) {
                System.out.println("짝!");
            }
            System.out.println(i);
        }


    }
}
