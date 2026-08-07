package com.oop10;

public class NumberPrinter {

    int id;
    // int waitNumber;
    // 인스턴스(객체)들이 공유 가능한 메모리 영역(static)
    static int waitNumber = 1;

    public NumberPrinter(int id) {
        this.id = id;
        waitNumber = 1;
    }

    // 번호표 출력 기능
    public void printWaitNumber() {
        System.out.println(id + "번 기기의 대기 순번은 " + waitNumber + "번 입니다.");
        waitNumber++;

    }

}
