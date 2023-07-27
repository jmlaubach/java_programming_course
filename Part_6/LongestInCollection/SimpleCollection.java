package Part_6.LongestInCollection;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> items;

    public SimpleCollection(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void add(String item) {
        this.items.add(item);
    }

    public String longest() {
        if (this.items.isEmpty()) {
            return null;
        }

        String longest = (this.items.get(0));

        for (String i: items) {
            if (longest.length() < i.length()) {
                longest = i;
            }
        }
        return longest;
    }

    public String toString() {
        String printOutput = "The collection " + this.name;

        if (this.items.isEmpty()) {
            return printOutput + " is empty.";
        }

        String items = "";

        for (String i: this.items) {
            items = items + i + "\n";
        }

        if (this.items.size() == 1) {
            return printOutput + " has " + this.items.size() + " element:\n" + items;
        } else {
            return printOutput + " has " + this.items.size() + " elements:\n" + items;
        }
    }
}
