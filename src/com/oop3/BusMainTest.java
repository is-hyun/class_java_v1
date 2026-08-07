package com.oop3;

public class BusMainTest {
    public static void main(String[] args) {

        Bus b1 = new Bus();
        b1.busNumber = 29;
        b1.name = "김일남";
        b1.timeGap = 12;

        b1.drive();
        b1.stop();
        System.out.println();
        b1.info();

    }
}
