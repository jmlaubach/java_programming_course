package Part_12.Numbers;

import java.util.Random;
import java.util.ArrayList;

public class RandGenerator {
    private ArrayList<Integer> numbers;

    public RandGenerator() {
        this.numbers = new ArrayList<>();
    }

    public void generateNumbers(int numOfNumbers) {
        for (int i = 0; i < numOfNumbers; i++) {
            Random r = new Random();
            int randNum = r.nextInt(10);
            this.numbers.add(randNum);
        }
    }

    public String toString() {
        String s = "";
        for (Integer i: this.numbers) {
            s += i + "\n";
        }

        return s;
    }
}
