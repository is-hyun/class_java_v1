package useful.ch10;

public class Worker extends Thread{

    String name;

    public Worker(String name) {
        this.name = name;
    }

    // 약속된 run() 추상 메서드 내부에서
    // 작업자(스레드)에게 시킬 작업 정의
    @Override
    public void run() {
        for (int i = 0 ; i < 50; i++) {
            System.out.println("worker : " + name + " : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
