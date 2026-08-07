package exercise;

import java.util.Scanner;

public class Exercise7 {

    // 함수 1
    static void greet(String name) {
        System.out.println("안녕하세요, " + name + "님!");
    }

    // 함수 2
    static int square(int num) {
        int result = num * num;
        return result;
    }

    // 함수 3
    static String signOfNumber(int a) {
        String result;
        if (a < 0) {
            result = "negative";
        } else if (a > 0) {
            result = "positive";
        } else {
            result = "zero";
        }
        return result;
    }

    // 함수 4
    static boolean checkAdult(int age) {
        boolean result = false;
        if (age >= 18) {
            result = true;
        }
        return result;
    }

    // 함수 5
    static int findMax(int num1, int num2) {
        int maxNum = (num1 > num2 ? num1 : num2);
        return maxNum;
    }


    public static void main(String[] args) {
        // 함수 1
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        greet(sc.nextLine());
        System.out.println("--------------------");

        // 함수 2
        System.out.print("제곱할 값을 입력하세요 : ");
        System.out.println("제곱값 : " + square(sc.nextInt()));
        System.out.println("--------------------");

        // 함수 3
        System.out.print("부호를 판별할 숫자를 입력하세요 : ");
        System.out.println("결과 : " + signOfNumber(sc.nextInt()));
        System.out.println("--------------------");

        // 함수 4
        System.out.print("나이를 입력하세요 : ");
        System.out.println("18세 이상 확인 : " + checkAdult(sc.nextInt()));
        System.out.println("--------------------");

        // 함수 5
        System.out.print("비교할 두 수를 입력하세요 : ");
        System.out.println("더 큰 수 : " + findMax(sc.nextInt(), sc.nextInt()));

    }

}
