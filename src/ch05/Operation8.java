package ch05;

/*
 * 조건 연산자(삼항 연산자)
 * 조건식 ? 결과1 : 결과2
 * 조건식의 결과값이 true이면 결과 1 반환 아니라면 결과 2를 반환
 */

public class Operation8 {
    public static void main(String[] args) {
        int number = 7; // 7이라는 값이 홀수인지 짝수인지 판별
        // 조건식 ?
        // 1 == 0  --> F
        char result1 = (number % 2 ==0) ? '짝' : '홀'; // 조건식이 false -> 결과 2에 해당하는 홀 반환
        System.out.println(result1);

        boolean isOk = (5 > 3) ? true : false;
        System.out.println("isOk : " + isOk);

        // 두 수(정수) 중에 더 큰 수를 max라는 변수에 담아라.
        int max = (10 > 1) ? 10 : 1;
        System.out.println("max : " + max); // 사실상 조건 등호가 바뀌면 문제 취지에 맞지 않음

        int n1 = 100;
        int n2 = 300;
        int max2;

        // n1과 n2 값을 비교해서 더 큰 수를 max2 변수에 담는 코드를 작성하시오. (삼항연산자 사용)
        max2 = (n1 > n2) ? n1 : n2;
        System.out.println(max2); // Think. 두 수가 값은 경우는 어떻게 해결하나 --> 삼항 연산자의 중첩 사용이 가능

    }

}
