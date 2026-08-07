package com.oop13;

public class Notification {

    public void send(String message) {
        System.out.println("일반 알림 : [" + message + "]");
    }

    public void send(String message, int count) {
        System.out.println("반복 알림 전송 ···");
        for (int i = 0; i < count; i++) {
            send(message);
        }
    }

    public void send(String receiver, String message) {
        System.out.println("[" + receiver + "] 님의 메시지 : " + message);
    }


    public static void main(String[] args) {

        Notification n1 = new Notification();

        n1.send("폭염 주의보가 발령됐습니다.");
        n1.send("안녕하세요", 3);
        n1.send("선생님","오늘은 휴교입니다.");

    }

}
