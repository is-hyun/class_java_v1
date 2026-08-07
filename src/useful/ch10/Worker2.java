package useful.ch10;

public class Worker2 implements Runnable{

    // run() - 위임 시키고자 하는 일을 명시
    @Override
    public void run() {
        int i;
        for (i = 1; i <= 200; i++) {
            System.out.print(i + "\t");
        }
    }
}
