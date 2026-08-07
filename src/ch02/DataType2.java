package ch02;

/*
 * 문자 데이터 타입
 * char 자료형 크기는 2바이트입니다.
 */
public class DataType2 {
    // 메인 함수
    public static void main(String[] args) {

        // 기본 자료형 - 문자 타입(사실은 정수형으로 저장되어 있다)
        // 문자를 저장할 때 사용한다.
        // 단, 하나의 문자만을 저장할 수 있다.
        char charBox = '가';
        // char charBox2 = '가나'; 2바이트 초과로 인한 오류 <-- [][][][][][][][] [][][][][][][][]
        System.out.println(charBox);

        System.out.println('A');
        System.out.println('B');
        System.out.println('C');

        System.out.println("---------------------");
        char alphabetA = 'A'; // [][][][] <-- 65 저장
        System.out.println((int)alphabetA); // 65 출력
        System.out.println((int)'K');       // 75 출력
        // char alphabetB = "B"; // char 타입은 '문자' / String 타입은 "문자열" 사용

        // Think) 문자도 사실 정수형이라고 했으나 왜 화면에는 문자 형태로 출력이 되는가
        // Answer) 문자표가 이미 컴퓨터 내부에 저장되어 있다 (아스키 코드)

    } // end of main
} // end of class
