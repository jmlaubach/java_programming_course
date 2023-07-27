package Part_6.CargoHold;

import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> hold;
    private int maxWeight;


    public Hold(int maxWeight) {
        this.hold = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalHoldWeight() {
        int totalWeight = 0;

        for (Suitcase s: this.hold) {
            totalWeight += s.totalWeight();
        }

        return totalWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((totalHoldWeight() + suitcase.totalWeight()) < this.maxWeight) {
            this.hold.add(suitcase);
        };
    }

    public void printSuitcases() {
        for (Suitcase s: this.hold) {
            s.printItems();
        }
    }

    public String toString() {
        if (this.hold.size() == 1) {
            return this.hold.size() + " suitcase (" + totalHoldWeight() + " kg)";
        } else if (this.hold.size() == 0) {
            return "no suitcases (" + totalHoldWeight() + " kg)";
        } else {
            return this.hold.size() + " suitcases (" + totalHoldWeight() + " kg)";
        }
    }
}
