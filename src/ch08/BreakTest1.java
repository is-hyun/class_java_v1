package ch08;

public class BreakTest1 {
    public static void main(String[] args) {

        // break : 실행 중간에 멈추는 구문
        // i가 7일 때 중간에 멈추기
        for (int i = 0; i < 10; i++) {
            System.out.println("i : " + i);
            if (i == 7) {
                break; // 7까지 출력되고 더 이상 반복문이 실행되지 않음
            }
        }

        System.out.println("------------------");

        // 100 ~ 200까지 화면에 출력. 단, 151에서 반복문을 종료.

        int i = 99;
        while (i <= 200) {
            i++;
            System.out.println(i);
            if (i == 151) {
                break;
            }
        }

    }
}

