package Part_12.Lottery;

import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        for (int i: this.numbers) {
            if(i == number) {
                return true;
            }
        }

        return false;
    }

    public void randomizeNumbers() {
        // initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the randomization of the numbers by using the method containsNumber() here
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            while(true) {
                int lotoNumber = random.nextInt(40) + 1;
                if(!this.numbers.contains(lotoNumber)) {
                    this.numbers.add(lotoNumber);
                    break;
                }
            }
        }
    }

    public boolean equals(Object other) {
        return false;
    }
}
