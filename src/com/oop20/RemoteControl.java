package com.oop20;

// 인터페이스
public interface RemoteControl {

    // 1. 인터페이스 안에 선언된 필드는 자동으로 public static final이 붙습니다. 즉, 상수
    // int MAX_VOLUME = 10;
    public static final int MAX_VOLUME = 10;

    // 2. 인터페이스 안에 선언되는 메서드는 자바 8.ver default를 제외하고 전부 추상 메서드로 설계되어야 함
    // void turnOn();
    public abstract void turnOn();

    public abstract void turnOff();

    void setVolume(int volume);

}
