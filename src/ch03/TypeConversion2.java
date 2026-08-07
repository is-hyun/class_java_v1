package ch03;

/*
* 형변환이란?
* 데이터의 타입을 다른 타입으로 변경하는 것
* 자동 형변환 / 강제 형변환
* */
public class TypeConversion2 {
    public static void main(String[] args) {
        // 자동 형변환 코드 작성해보기
        int intA = 1024;
        double doubleA = intA;

        // 강제 형변환 코드 작성해보기
        final double doubleB = 12.85987;
        int intB = (int) doubleB;

        // 결과 출력
        System.out.println("자동 형변환 : " + doubleA);
        System.out.println("강제 형변환 : " + intB);

    }
}
