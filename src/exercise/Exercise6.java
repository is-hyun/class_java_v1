package exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        // 입력한 숫자까지의 모든 짝수의 합
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int maxNumber = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= maxNumber; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("1부터 " + maxNumber + "까지의 짝수 합은 " + sum + "입니다.");
        scanner.close();

    }
}
