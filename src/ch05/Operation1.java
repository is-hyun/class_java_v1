package ch05;

/*
 * 부호 연산자
 * 단항 연산자, 변수의 부호를 변경한다
 * 단, 변수 안에 들어가 있는 값의 부호를 변경하려면 대입 연산자와 함께 사용해야 한다.
 */
public class Operation1 {
    public static void main(String[] args) {

        int intData = 100;
        System.out.println(+intData);
        System.out.println(-intData);
        System.out.println("--------------");

        // Think) 실제 intData라는 변수 안의 값은 코드 실행 후 변경이 되었는가
        // Answer) 변경되지 않았다.
        System.out.println("intData : " + intData); // 100 출력
        // 즉, 부호 연산자는 실제 변수의 값에 영향을 주지 못함.
        // 실제로 변경하기 위해선 대입 연산자를 함께 사용해야 함.

        intData = -intData; // 대입 연산자와 부호 연산자를 함께 사용해 새로 대입
        System.out.println("새로 대입한 결과 : " + intData); // -100으로 값이 변경됨을 확인

    }
}
