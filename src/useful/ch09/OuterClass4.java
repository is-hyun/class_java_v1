package useful.ch09;

public class OuterClass4 {

    Runnable runnable; // 인터페이스

    // 생성자
    public OuterClass4() {
        // 4. 익명 내부 클래스
        // 익명 내부 클래스를 사용하여 인터페이스나 추상 클래스를 실제 객체처럼 생성 가능

        // !!! 익명 구현 내부 클래스 (정식 명칭 X)
        // runnable = new Runnable(); >> 객체 생성 불가능
        new Runnable() {
            @Override
            public void run() {
                System.out.println("동작 정의");
            }
        };

    }

    // main
    public static void main(String[] args) {
        new OuterClass4(); // 참조변수(이름)이 없는 익명 클래스

    }

}
