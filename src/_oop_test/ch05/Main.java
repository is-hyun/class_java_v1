package _oop_test.ch05;

public class Main {
    public static void main(String[] args) {

        ItemService is = new ItemService();
        is.obtainItem("체인 메일", "UNCOMMON");
        is.obtainItem("은빛 롱소드", "RARE");
        is.obtainItem("드래곤 하트 링", "LEGENDARY");

        is.printInventory();

    }
}
