package com.oop16;

public class FruitMainTest {
    public static void main(String[] args) {

        // 하나의 객체를 다양한 타입으로 바라볼 수 있다
        Fruit fruit1 = new Banana(); // 업캐스팅
        Fruit fruit2 = new Peach(); // 업캐스팅

        fruit1.showInfo();
        System.out.println("------------------");
        fruit2.showInfo();

        // 바나나의 원산지 정보
        // fruit1.getOrigin();  >> 컴파일 시점은 Fruit이라 호출 불가
        // 다운캐스팅 >> 컴파일러의 시선을 Banana로 이동

        String result = ((Banana) fruit1).getOrigin();
        System.out.println("바나나 원산지 : " + result);

        // !but - 컴파일은 통과하지만 실제 객체가 다르면 ClassCastingException 발생 가능

    }
}