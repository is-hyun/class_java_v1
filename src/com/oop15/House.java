package com.oop15;

public class House {

    private String address;

    // 합성 관계 : House 내부적으로 Room 객체들을 소유
    private Room livingRoom;
    private Room bedRoom;

    public House(String address) {
        this.address = address;

        // 합성 조건 1.
        this.livingRoom = new Room("거실");
        this.bedRoom = new Room("침실");
    }

    // 합성 조건 2. getter 없음

    public void showInfo() {
        System.out.println(address + "에 위치한 집");
        livingRoom.use();
        bedRoom.use();
    }

}
