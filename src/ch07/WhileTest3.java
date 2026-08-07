package ch07;

import java.util.Scanner;

public class WhileTest3 {
    public static void main(String[] args) {

        // 1 ~ 10의 총합 계산
        int i = 1;
        int sum1 = 0;

        while (i <= 10) {
            sum1 += i;
            i++;
        }
        System.out.println("sum1 : " + sum1);

        System.out.println("---------------------------");

        // 끝 값을 스캐너를 통해 받아서 연산 코드를 작성
        Scanner sc = new Scanner(System.in);
        System.out.print("마지막 값을 입력하시오 : ");

        int start = 1;
        int end = sc.nextInt();
        int sum2 = 0;

        while (start <= end) {
            sum2 += start;
            start++;
        }
        System.out.println("sum2 : " + sum2);

    }
}
