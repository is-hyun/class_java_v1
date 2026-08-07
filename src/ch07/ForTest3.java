package ch07;

public class ForTest3 {
    public static void main(String[] args) {

        // 1부터 100까지 수의 총 합을 구하시오
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("sum : " + sum);

        // 반복문의 증감식을 2씩 증가
        for (int i = 0; i < 10; i +=2) {
            System.out.println("2씩 증가 + " + i);
        }

        // 문제 - 10 9 8 7 6 5 4 3 2 1 출력
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("-------------");
        // 이중 for문

        // 0 1 2
        // 0 1 2
        // 0 1 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("-------------");

        // *
        // ***
        // *****
        // *******
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("-------------");

        // *******
        // *****
        // ***
        // *
        for (int i = 4; i > 0; i--) {
            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print('*');
            }
            System.out.println();
        }


    }
}
