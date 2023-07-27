package Part_7.BigYear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BirdList birdBook = new BirdList();

        Interface ui = new Interface(scanner, birdBook);

        ui.start();
    }
}
