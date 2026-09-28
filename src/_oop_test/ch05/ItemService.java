package _oop_test.ch05;

import java.util.List;

public class ItemService {

    private ItemDAO itemDAO = new MemoryItemDAO();

    public void obtainItem(String name, String grade) {
        Item item = new Item(name, grade);
        itemDAO.insert(item);
    }

    public void printInventory() {
        System.out.println("=== 인벤토리 아이템 목록 ===");
        List<Item> items = itemDAO.findAll();
        for (Item item : items) {
            System.out.println("ITEM : " + item.getName() + " [" + item.getGrade() + "]");
        }
    }
}
