package ch07;

public class WhileTest1 {
    public static void main(String[] args) {

        /* 무한 루프를 조심하자.
        int i = 1;
        while (i <= 10) {
            System.out.println("i 값 : " + i);
            // 조건식에 대한 추가 처리가 없다면 무한 반복한다.
        }

        */

        int i = 1;
        while (i <= 10) {
            System.out.println("i 값 : " + i);
            i++; // i 값을 변경해 반복 횟수를 제한
        }
        System.out.println("---------------");

        // 1부터 10까지의 합 구하기
        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("sum 합계 : " + +sum);

    }
}
