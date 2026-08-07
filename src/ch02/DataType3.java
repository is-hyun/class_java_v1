package ch02;

public class DataType3 {
    public static void main(String[] args) {
        // 기본 자료형 (실수형)
        // 1.0, 0.124 ...
        // float, double 두가지 타입이 존재. 각각 4바이트/8바이트 크기.
        // 실수형의 기본 타입은 double

        // float floatBox1 = 0.5; 4바이트의 float 변수에 8바이트 크기의 값을 대입하는 오류
        // 접미사를 사용해서 자바(컴파일러)에게 0.5의 타입이 double이 아니라 float임을 명시
        float floatBox1 = 0.5f; // 접미사 f 사용
        float floatBox2 = 0.5f;

        double doubleBox1 = 0.123;
        double doubleBox2 = 0.5;

        // Think) 실수형 자료에서 8바이트 단위를 기본 연산으로 사용하는 이유는
        // Answer) 소수점에 대한 정확성을 확보하기 위해

    }
}
