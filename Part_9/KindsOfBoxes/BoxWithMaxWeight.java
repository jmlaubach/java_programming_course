package Part_9.KindsOfBoxes;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public boolean isInBox(Item item) {
        for (Item i: this.items) {
            if (i.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public void add(Item item) {
        int totalWeight = 0;
        
        for (Item i: this.items) {
            totalWeight += i.getWeight();
        }

        if (item.getWeight() + totalWeight <= this.capacity) {
            this.items.add(item);
        }
    }
}
