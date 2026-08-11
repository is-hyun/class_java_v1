package useful.ch16;

public class Demo4 {
    public static void main(String[] args) {

        // 단계적으로 줄여쓰기

        // 1. 매개변수 타입 생략 가능
        MathOperation add = (int x, int y) -> {return x + y;};

        // 2. 중괄호와 리턴 타입 생략
        MathOperation sub = (int x, int y) -> x - y;

        // ! 여러 줄이 필요한 경우에는 반드시 중괄호와 리턴 사용
        MathOperation div = (int x, int y) -> {
            if (y==0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return x / y;
        };

        System.out.println(add.operate(10, 10));
        System.out.println(sub.operate(10, 10));
        System.out.println(div.operate(10, 10));

    }
}
