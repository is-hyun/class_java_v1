package _oop_test.ch05;

import java.util.ArrayList;
import java.util.List;

public class MemoryItemDAO implements ItemDAO {

    private List<Item> inventory = new ArrayList<>();

    @Override
    public void insert(Item item) {
        inventory.add(item);
        System.out.println("[" + item.getName() + "] 아이템을 인벤토리에 넣었습니다.");
    }

    @Override
    public List<Item> findAll() {
        return inventory;
    }
}
