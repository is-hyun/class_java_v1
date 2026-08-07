package useful.ch10;

public class WorkerMain {
    public static void main(String[] args) {

        System.out.println("----main 스레드 시작----");
        System.out.println(Thread.currentThread());

        // 필요에 따라 작업자(스레드)를 만들 수 있다
        Worker worker1 = new Worker("작업자1");

        // 약속
        // 스레드에게 일을 시키기 위해 Thread 내부의 start()를 반드시 호출
        // run() 내부의 정의된 로직 실행
        worker1.start();

    }
}
