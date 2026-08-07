package useful.ch09;

public class OuterClass3 {

    public void display() {

        // 3. 지역 내부 클래스
        class LocalInnerClass {
            void printMessage() {
                System.out.println("지역 내부 클래스 메서드");
            }
        } // end of local class

    } // end of method


    // main
    public static void main(String[] args) {

        // 지역 내부 클래스는 메서드 실행 시에만 존재하고 메서드 지역 변수처럼 동작
        // 외부에서 접근 불가능하며, 메서드 내에서 일회성 작업을 수행하는 객체 생성 시 사용
        OuterClass3 outer3 = new OuterClass3();
        outer3.display();

    }

} // end of outer
