package Part_9.KindsOfBoxes;

import java.util.ArrayList;

public class OneItemBox extends Box{
    private ArrayList<Item> items;

    public OneItemBox(){
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
        if (this.items.size() == 0) {
            this.items.add(item);
        }
    }
}
