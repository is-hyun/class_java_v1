package com.oop14;

public class Cal {

    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int multi(int n1, int n2) {
        return n1 * n2;
    }

} // end of class

// 하나의 자바 파일에 하나의 클래스만 작성하는 게 일반적
// 여러 개의 클래스를 선언할 수는 있다. 다만 권장하지 않음
// ! 주의 : 하나의 자바 파일에 public 클래스는 오직 하나만 사용 가능

class ChildCal extends Cal{

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    // 부모 클래스의 메서드를 재정의 가능(오버라이드)
    @Override  // @어노테이션 : 컴파일러에게 알려주는 주석
    public int multi(int n1, int n2) {
        System.out.println("ChildCal에 multi() 호출");
        if (n1 == 0 || n2 == 0) {
            System.out.println("0을 입력하지 마세요");
        }
        return n1 * n2;
    }

} // end of class
