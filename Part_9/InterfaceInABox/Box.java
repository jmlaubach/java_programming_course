package Part_9.InterfaceInABox;

import java.util.ArrayList;

public class Box implements Packable{
    private double maxWeight;
    private ArrayList<Packable> packables;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.packables = new ArrayList<>();
    }

    public void add(Packable item) {
        this.packables.add(item);
    }

    public double weight() {
        double weightSum = 0;

        for (Packable p: this.packables) {
            weightSum += p.weight();
        }
        return weightSum; 
    }

    public String toString() {
        return "Box: " + this.packables.size() + " items, total weight " + weight() + " kg";
    }
}
