package ch02;

public class DataType4 {
    public static void main(String[] args) {
        // 기본 자료형 (논리 자료형)
        // 사실을 관찰하고 결과값이 참/거짓임을 판별할 때 사용한다.
        // 크기는 1바이트이다. [][][][][][][][]
        // 사실상 1비트만 있어도 참/거짓 데이터를 다룰 수 있다.
        // 하지만 비트라는 단위는 컴퓨터가 연산하기에는 작은 크기라 비트로 연산을 하게 되면 되려 연산이 느려진다.
        // 최소 컴퓨터 연산의 단위는 1바이트

        boolean isMarried = false;
        System.out.println(isMarried);
        isMarried = true;
        System.out.println(isMarried);

        boolean isOk;
        isOk = true;
        System.out.println(isOk);

        // 값을 바로 출력
        System.out.println(true);
        System.out.println(false);


    } // end of main
} // end of class
