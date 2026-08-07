package ch08;

import java.util.Scanner;

public class BreakTest2 {
    public static void main(String[] args) {

        // 1 ~ 100까지의 반복문 for
        // 3의 배수만 출력
        // 50 이상이면 반복문을 종료

        for (int i = 1; i <= 100; i++) {
            if (i >= 50) {
                break;
            }
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        // 스캐너 활용
        Scanner sc = new Scanner(System.in);

        System.out.print("배수를 입력해 주세요 : ");
        int userNum = sc.nextInt();

        if (userNum < 1 || userNum > 200) {
            System.out.println("1부터 200 사이의 값을 입력해 주세요.");
            return;
        }

        System.out.println("1 ~ 200 사이의 " + userNum + "의 배수를 큰 순서대로 10개 나열합니다.");

        int count = 0;
        for (int i = 200; i > 0; i--) {


            if (count == 10) {
                break;
            }

            if (i % userNum == 0) {
                System.out.println(i);
                count++;
            }
        }
        if (count < 10) {
            System.out.println("해당하는 배수가 10개 미만입니다. (총 " + count + "개)");

        }


    }
}

