package ch06;

public class IfTest2 {
    public static void main(String[] args) {

        // 만약 ... 이라면 --> if else
        // if (조건식) {...} else {...}

        int age = 20;

        if(age >= 19) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("아직 미성년자입니다.");
        }

        System.out.println("프로그램 종료");

    }
}
