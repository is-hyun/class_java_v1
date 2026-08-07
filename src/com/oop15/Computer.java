package com.oop15;

public class Computer {

    private String modelName;

    private Cpu i7 = new Cpu("intel 7");

    public Computer(String modelName) {
        this.modelName = modelName;

        this.i7 = i7;
    }

    void start() {
        System.out.println(modelName + " : Power On");
        i7.start();
    }
    void stop() {
        System.out.println(modelName + " : Power Off");
        i7.stop();
    }

    public void showInfo() {
        System.out.println(modelName + "의 스펙");
        System.out.println("CPU : " + i7);
    }

}
