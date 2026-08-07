package ch05;

public class Operation2 {
    public static void main(String[] args) {
        System.out.println(5 + 3);
        System.out.println(5 - 3);
        System.out.println(5 * 3);
        System.out.println(5 / 3);
        System.out.println(5 / (double)3);
        System.out.println(5 % 3);

        System.out.println("--------");
        // 문제
        // 1. (12 + 3) / 3 을 출력하시오. 단, 결과값을 변수에 담아서 출력
        double result = (12 + 3) / 3;
        System.out.println("(12 + 3) / 3 = " + result);

        // 2. (25 % 3) 값을 출력하라
        int result2 = (25 % 3);
        System.out.println("(25 % 3) = " + result2);
        // 나머지 연산자는 해당하는 값이 홀수인지 짝수인지 판별할 때 유용하다
        // 어떤 수를 2로 나눴을 때 나머지가 0이면 짝수, 1이면 홀수라고 판별가능

        // 3. 7896456 값이 홀수인지 짝수인지 화면에 1 또는 0으로 표시하는 코드를 출력하세요
        int num = 7896456;
        int r3 = num % 2;
        System.out.println("[0:짝수 | 1:홀수] : " + r3); // 0 출력 --> 짝수


    }
}
