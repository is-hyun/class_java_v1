package com.oop15;

public class CarMainTest {
    public static void main(String[] args) {

        Car c1 = new Car("BMW");
        c1.start();
        System.out.println("---------");
        c1.stop();

        // 밖에서는 Engine 객체에 접근할 수 있는 방법이 없습니다.
        // 따라서, 합성 관계라고 할 수 있음.

        // ? main에서 엔진 객체를 생성할 수는 있지만 접근해서 메서드를 실행하거나 할 수는 없다?
        Engine e1 = new Engine("vs");
        e1.stop();

        // 할 수 있는데

    }
}
