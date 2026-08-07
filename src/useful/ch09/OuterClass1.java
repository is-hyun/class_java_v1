package useful.ch09;

/*
 * 내부 클래스
 * 한 클래스 내부에 선언된 클래스
 * 내부 클래스를 선언하면 보통 외부 클래스와 연관이 있으며
 * 다른 곳에서 거의 사용할 일이 없을 때 사용한다
 *
 * 내부 클래스의 종류 4가지
 * */

public class OuterClass1 {

    private int num = 10;

    // 클래스 안에 클래스 선언
    // 1. 멤버 내부 클래스
    class InnerClass {
        public void display() {
            System.out.println("num : " + num);
        }
    } // end of Inner


    // main
    public static void main(String[] args) {

        // 내부 클래스가 일반 멤버 클래스로 설계된 경우
        // 외부 클래스가 먼저 객체로 생성되어야 내부 클래스 생성 가능
        OuterClass1 outer = new OuterClass1();
        // 외부클래스.내부클래스 내부클래스 참조 변수 = 외부클래스참조변수.new 내부클래스생성자
        OuterClass1.InnerClass inner1 = outer.new InnerClass();
        inner1.display();
    }
} // end of Outer
