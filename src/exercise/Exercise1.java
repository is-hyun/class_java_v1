package exercise;

public class Exercise1 {
    // 메인 함수
    public static void main(String[] args) {
        // 연습 문제

        // 1. 데이터 10, 100, 200 을 변수 선언과 동시에 초기화를 하고 화면에 출력해 보세요.
        int num1 = 10;
        int num2 = 100;
        int num3 = 100;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // 2. int ageBox 상자에 20을 담아 보세요
        int ageBox = 20;
        System.out.println(ageBox);

        // 2.1 ageBox 상자의 값을 30으로 변경하고 기존에 담겨 있던 데이터를 다른 곳으로 옮겨 보세요
        int oldBox = ageBox;
        ageBox = 30;
        System.out.println(oldBox);
        System.out.println(ageBox);

        // 3. int a = 1; int b = 3; 선언하고 a와 b에 담겨 있는 값을 서로 스위칭 해보세요
        int a  = 1;
        int b = 3;

        int temp = a;
        a = b;
        b = temp;

    } // end of main
} // end of class
