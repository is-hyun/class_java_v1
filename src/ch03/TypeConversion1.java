package ch03;

/*
* 형변환이란?
* 데이터의 타입을 다른 타입으로 변경하는 것
* 자동 형변환 / 강제 형변환
* */
public class TypeConversion1 {
    public static void main(String[] args) {
        int intDataBox = 100; // 리터럴(100)
        double doubleDateBox;

        // 1. 자동 형변환 예시
        // 8바이트 = 4바이트
        doubleDateBox = intDataBox; // 자동 형변환
        System.out.println(doubleDateBox); // 100.0 출력

        // 2. 강제 형변환 예시
        // 4바이트 = 8바이트
        final double PI = 3.14159;
        // int intBox = PI; // 자동 형변환 불가
        int intBox = (int) PI; // 강제 형변환
        System.out.println(intBox); // 3 --> 소수점 이하 수 삭제

        // 연습
        double interestRate;
        int discount;
        interestRate = 15.5;

        discount = (int) interestRate;
        System.out.println(discount); // 15 출력

    }
}
