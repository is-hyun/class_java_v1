package ch07;

public class WhileTest2 {
    public static void main(String[] args) {

        // 특정 조건이 생길 때 반복문을 종료시킬 수 있음.
        boolean flag = true;
        int start = 0;
        final int END = 50;

        /*
        while (flag) {
            if (start == END) {
                System.out.println("프로그램을 종료합니다.");
                flag = false; // start 값이 50인 경우 flag 변수에 접근해 false로 값을 변경
            }
            System.out.println("start : " + start);
            start++;
        }
        */

        while (flag) {
            start++;
            System.out.println("start : " + start);
            if (start == END) {
                System.out.println("프로그램을 종료합니다.");
                flag = false; // start 값이 50인 경우 flag 변수에 접근해 false로 값을 변경
            }
        }
    }
}
