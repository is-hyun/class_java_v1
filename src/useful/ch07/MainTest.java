package useful.ch07;

public class MainTest {
    public static void main(String[] args) {

        Water water = new Water();
        Plastic plastic = new Plastic();

        GenericPrinter printer = new GenericPrinter();
        // printer.setMaterial(water); water은 상속 받지 않아 Material 타입이 아님

        printer.setMaterial(plastic);
        System.out.println(printer.getMaterial());


    }
}
