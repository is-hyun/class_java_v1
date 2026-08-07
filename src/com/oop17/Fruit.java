package com.oop17;

public class Fruit {

    protected String name;
    protected int price;

    public void showInfo() {
        System.out.println("상품명 : " + name);
        System.out.println("가격 : " + price);
    }

    // 부모가 기본 동작을 정의
    // 즉, 자식이 재정의하지 않으면 기본값으로 실행
    public void sale() {
        System.out.println("이 상품은 할인 대상이 아닙니다");
    }

}
