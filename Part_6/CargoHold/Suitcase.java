package Part_6.CargoHold;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item i: this.items) {
            totalWeight += i.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item returnItem = this.items.get(0);

        for (Item i: this.items) {
            if (returnItem.getWeight() < i.getWeight()) {
                returnItem = i;
            }
        }

        return returnItem;
    }

    public void addItem(Item item) {
        if ((totalWeight() + item.getWeight()) < this.maxWeight) {
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item i: this.items) {
            System.out.println(i.getName() + " (" + i.getWeight() + " kg)");
        }
    }

    public String toString() {
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + totalWeight() + " kg)";
        } else if (this.items.size() == 0) {
            return "no items (" + totalWeight() + " kg)";
        } else {
            return this.items.size() + " items (" + totalWeight() + " kg)";
        }
    }
}
