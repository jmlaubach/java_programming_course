package Part_9.KindsOfBoxes;

import java.util.ArrayList;

public class MisplacingBox {
    private ArrayList<Item> items;

    public MisplacingBox() {
        this.items = new ArrayList<>();
    }

    public boolean isInBox(Item item) {
        return false;
    }

    public void add(Item item) {
        this.items.add(item);
    }
}
