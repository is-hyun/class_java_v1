package useful.ch04;

public class ThrowsHandling {
    public static void main(String[] args) {

        Calc calc = new Calc();
        try {
            calc.divide(100, 0);  // ArithmeticException (0으로 나누는 오류)
        } catch (Exception e) {
            System.out.println("어떤 수를 0 으로 나눌 수 없습니다");
        }

    }
}

// Calc 클래스
class Calc {

    // throws
    // 예외처리를 사용자가 직접 다룰 수 있도록 던질 수 있다
    // 메서드 선언부에서 사용
    // 강제성이 발생됨 (사용하는 측에서 반드시 처리를 해야되는 강제성 생성됨)
    public int divide(int n1, int n2) throws Exception {
        System.out.println("나누기 동작");
        return n1 / n2;
    }

}
