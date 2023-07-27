package Part_12.Die;

import java.util.Random;

public class Die {
    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        this.numberOfFaces = numberOfFaces;
    }

    public int throwDie() {
        int dieRoll = this.random.nextInt(numberOfFaces) + 1;

        return dieRoll;
    }
}
