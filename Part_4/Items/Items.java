package Part_4.Items;

import java.time.ZonedDateTime;

public class Items {
    private String item;
    private ZonedDateTime date;

    public Items (String item) {
        this.item = item;
        this.date = java.time.ZonedDateTime.now();
    }

    public void createItem(String name) {
        this.item = name;
        this.date = java.time.ZonedDateTime.now();
    }

    public String toString() {
        return this.item + " (created at: " + this.date + ")";
    }
}
