package ch06;

public class IfTest3 {
    public static void main(String[] args) {

        // 만약 ... 이라면 --> if else if else  주어진 조건이 여러 개일 때 많이 사용
        // if (조건식) {...} else if (조건식) {...} else if ( ) { } ... else {...}

        int age = 27;

        if (age <= 7) {
            System.out.println("미취학아동");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        System.out.println("프로그램 종료");

    }
}
