package useful.ch16;

import java.util.concurrent.TransferQueue;

public class Demo1 {
    public static void main(String[] args) {

        // 1. 람다 표현식
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("작업자가 해야 할 일 정의");
            }
        }).start();

        // 위 코드를 람다식으로 사용
        new Thread(() -> System.out.println("여기도 작업자가 해야 할 일 정의")). start();

        new Thread(() -> System.out.println("작업자가 해야 할 일 정의 3")).start();

        int x = 10;
        var y = 100;

    }
}
