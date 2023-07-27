package Part_7.BigYear;

import java.util.Scanner;

public class Interface {
    private Scanner scanner;
    private BirdList birdBook;

    public Interface(Scanner scanner, BirdList birdBook) {
        this.scanner = scanner;
        this.birdBook = birdBook;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String birdName = scanner.nextLine();

                System.out.print("Latin Name: ");
                String latinName = scanner.nextLine();

                Bird bird = new Bird(birdName, latinName);

                this.birdBook.addBird(bird);

            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scanner.nextLine();

                Bird birdChoice = this.birdBook.getBird(bird);

                if (birdChoice == null) {
                    System.out.println("There are no added birds yet with that name.");
                } else {
                    birdChoice.addObservation();
                }

            } else if (command.equals("All")) {
                this.birdBook.printBirds();

            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                
                System.out.println(this.birdBook.getBird(birdName));

            } else {
                System.out.println("That is not a command option. Try again.");

            }
        }
    }
}
