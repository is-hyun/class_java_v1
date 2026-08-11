package useful.ch16;

// 자바 API에서 제공해주는 함수형 인터페이스 외에
// 직접 설계하고 싶다면 함수형 인터페이스를 만들어야 함

//@FunctionalInterface >> 인터페이스 내에 추상메서드가 하나만 존재하도록 강제
@FunctionalInterface
interface MathOperation {
    int operate(int x, int y);
    // void run();

}

public class Demo3 {
    public static void main(String[] args) {

        // 함수용 인터페이스 타입에 람다식 사용 가능
        MathOperation add = (int x, int y) -> {return x + y;};
        MathOperation sub = (int x, int y) -> {return x - y;};
        MathOperation multi = (int x, int y) -> {return x * y;};
        MathOperation div = (int x, int y) -> {return x / y;};

        // ! 주의 - 호출 시 참조 변수가 아닌 인터페이스에서 정의된 메서드를 호출해야 함
        System.out.println("10 + 10 = " + add.operate(10, 10));
        System.out.println("10 - 10 = " + sub.operate(10, 10));
        System.out.println("10 * 10 = " + multi.operate(10, 10));
        System.out.println("10 / 10 = " + div.operate(10, 10));

    }
}
