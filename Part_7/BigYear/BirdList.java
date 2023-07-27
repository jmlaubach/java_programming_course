package Part_7.BigYear;

import java.util.ArrayList;

public class BirdList {
    private ArrayList<Bird> birdBook;

    public BirdList() {
        this.birdBook = new ArrayList<>();
    }

    public Bird getBird(String birdName) {
        for (Bird b: this.birdBook) {
            if (b.getName().equals(birdName)) {
                return b;
            } 
        }

        return null;
    }

    public int getSize() {
        return this.birdBook.size();
    }

    public void addBird(Bird bird) {
        this.birdBook.add(bird);
    }

    public void printBirds() {
        for (Bird b: this.birdBook) {
            System.out.println(b);
        }
    }
}
