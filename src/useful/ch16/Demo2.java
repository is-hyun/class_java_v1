package useful.ch16;

class Calculator {

    public int add(int x, int y) {
        return x + y;
    }


    public int subtract(int x, int y) {
        return x - y;
    }
}

public class Demo2 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("10 + 5 = " + calculator.add(10,5));
        System.out.println("10 - 5 = " + calculator.subtract(10,5));

    }
}
