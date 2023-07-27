package Part_8.AverageOfPositives;

import java.util.Scanner;

public class Interface {
    private Scanner scanner;
    private Average average;

    public Interface (Scanner scanner, Average average) {
        this.scanner = scanner;
        this.average = average;
    }

    public void start() {
        int sum = 0;
        int count = 0;
        while (true) {
            int currentNum = Integer.valueOf(scanner.nextLine());
            if (currentNum == 0) {
                break;
            }

            sum += currentNum;
            count++;
        }

        System.out.println(this.average.average(sum, count));
    }
}
