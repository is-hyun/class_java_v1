package useful.ch09;

public class OuterClass2 {

    private static int num = 10;

    // 2. 정적 내부 클래스
    static class InnerClass {
        public void display() {
            System.out.println("num : " + num);
        }
    }

    // main
    public static void main(String[] args) {
        // 외부 객체 생성 없이도 호출 가능
        OuterClass2.InnerClass inner2 = new OuterClass2.InnerClass();
        inner2.display();
    }

}
