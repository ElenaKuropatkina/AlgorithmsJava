package Lesson5.Backpack;

import java.util.ArrayList;

public class TestBackpack {
    public static void main(String[] args) {

        Backpack backpack = new Backpack(2500);

        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Телефон", 300,35000));
        items.add(new Item("Ноутбук", 2000, 50000));
        items.add(new Item("Ключи", 100, 500));
        items.add(new Item("Книга", 500, 600));
        items.add(new Item("Кошелек", 200, 6000));

        backpack.enumerationAllOfSets(items);
        ArrayList<Item> result = backpack.getBestSetOfItems();
        for (Item item : result) {
            item.print();
        }
    }
}
