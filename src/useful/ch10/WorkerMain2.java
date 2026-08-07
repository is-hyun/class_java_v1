package useful.ch10;

public class WorkerMain2 {
    public static void main(String[] args) {

        System.out.println("---- main 스레드 시작 ----");

        Worker2 worker2 = new Worker2();
        // tip. 스레드를 동작 시키려면 무조건 Thread의 start() 호출
        // worker2.start();  << Worker2 내부에 start() 없음

        // Thread t = new Thread(worker2);
        // t.start();
        new Thread(worker2).start();

        System.out.println("---- main 스레드 종료 ----");

    }
}
