package Lesson5.Backpack;

import java.util.ArrayList;

public class Backpack {

    private ArrayList<Item> bestItems;
    private int maxWeight;
    private int maxPrice;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int calcTotalWeight(ArrayList<Item> items) {
        int sum = 0;
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }

    public int calcTotalPrice(ArrayList<Item> items) {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void checkSetOfItems(ArrayList<Item> items) {
        if (bestItems == null) {
            if (calcTotalWeight(items) < maxWeight) {
                bestItems = items;
                maxPrice = calcTotalPrice(items);
            }
        } else {
            if (calcTotalWeight(items) <= maxWeight && calcTotalPrice(items) > maxPrice) {
                bestItems = items;
                maxPrice = calcTotalPrice(items);
            }
        }
    }


    public void enumerationAllOfSets(ArrayList<Item> items) {
        if (items.size() > 0)
            checkSetOfItems(items);
        for (int i = 0; i < items.size(); i++) {
            ArrayList<Item> newSet = new ArrayList<Item>(items);
            newSet.remove(i);
            enumerationAllOfSets(newSet);
        }
    }

    public ArrayList<Item> getBestSetOfItems() {
        return bestItems;
    }
}
