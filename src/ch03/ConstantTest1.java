package ch03;

public class ConstantTest1 {
    public static void main(String[] args) {
        int num = 10;
        num = 101;

        // 상수 사용해보기
        // final 키워드를 사용하고 변수명에 이름을 작성할 때 대문자 _(언더바)를 사용하는게 권장사항이다.
        final int MAX_NUM = 100; // final : 한 번 값이 정해지면 다시 변경할 수 없다 (상수)
        // MAX_NUM = 1;

        // 원주율을 상수로 선언해보자.
        final double PI = 3.14159;
        final int RADIUS = 5;

        // 원주율 응용 문제
        // 1. 원의 둘레를 계산해보자
        // 원의 둘레(A) : 2 * pi * r
        double A = 2 * PI * RADIUS;
        System.out.println("원의 둘레 : " + A);

        // 2. 원의 면적을 계산해보자
        // 원의 면적(B) : pi * r^2
        double B = PI * RADIUS * RADIUS;
        System.out.println("원의 면적 : " + B);

    }
}
