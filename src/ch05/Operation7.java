package ch05;

/*
 * 빠른 평가란?
 * 논리 연산에서 첫 번째 조건이 결과를 결정하는 경우
 * 두 번째 조건을 평가하지 않는 것
 */

public class Operation7 {
    public static void main(String[] args) {

        int number = 5;
        int index = 0;

        // 논리곱(&&)을 사용한 빠른 평가 확인
        // 첫 번째 조건이 이미 false이기 때문에 논리곱에서는 두 번째 조건은 아예 평가되지 않음 --> 빠른 평가
        // boolean result = ((number = number + 10) < 10) && ((index = index + 2 ) < 10);
        boolean result = ((number += 10) < 10) && ((index += 2 ) < 10); // 복합 대입 연산자로 간략화
        System.out.println("논리 곱 결과 : " + result);
        System.out.println("number : " + number);
        System.out.println("index : " + index);

        System.out.println("--------------------------------");

        // 논리합(||)을 이용한 빠른 평가 확인
        // number 는 위에서 이미 연산 했기 때문에 현재 15
        // index 는 빠른 평가로 진행해서 현재 0
        boolean result2 = ((number = number + 10) < 10) || ((index = index + 2 ) < 10);
        System.out.println("논리 합 결과1 : " + result2);
        System.out.println("number : " + number);
        System.out.println("index : " + index); // 빠른 평가가 진행되지 않아 index 값 변화

        boolean result3 = ((number = number + 10) > 10) || ((index = index + 2 ) < 10);
        System.out.println("논리 합 결과2 : " + result3);
        System.out.println("number : " + number);
        System.out.println("index : " + index); // 빠른 평가로 index 값 변화 없음

        System.out.println("--------------------------------------");
        // 문제 1.
        // 빠른 평가 수식을 스스로 만들어 보고 결과를 확인하는 코드 작성
        int num1 = 10;
        int num2 = 20;

        boolean test1 = ((num1 *= 2) == 30) && ((num2 /= 10) == 2);
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2); // num2 값에 변화 없음 --> 빠른 평가
        System.out.println("test1 : " + test1);

        boolean test2 = ((num1 *= 2) == 40) || ((num2 /= 10) == 3);
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2); // num2 값에 변화 없음 --> 빠른 평가
        System.out.println("test2 : " + test2);

    }

}
