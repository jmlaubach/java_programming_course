package Part_8.AverageOfPositives;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Average average = new Average();

        Interface ui = new Interface(scanner, average);

        ui.start();
    }
}
