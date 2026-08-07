package com.oop15;

public class HouseMainTest {
    public static void main(String[] args) {

        House house = new House("부산");
        house.showInfo();

        house = null;
        //GC 대상은 House, Room 둘 다 해당


    }

}
