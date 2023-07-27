package Part_9.Herds;

import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable organism: this.herd) {
            organism.move(dx, dy);
        }
    }

    public String toString() {
        String value = "";

		for (Movable organism: herd) {
			value += organism.toString();
			value += "\n";
		}
		return value;
    }
}
