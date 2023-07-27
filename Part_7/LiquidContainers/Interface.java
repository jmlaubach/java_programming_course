package Part_7.LiquidContainers;

import java.util.Scanner;

public class Interface {
    private Scanner scanner;
    private Container containerOne;
    private Container containerTwo;

    public Interface(Scanner scanner, Container containerOne, Container containerTwo) {
        this.scanner = scanner;
        this.containerOne = containerOne;
        this.containerTwo = containerTwo;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + containerOne.contains() + "/100");
            System.out.println("Second: " + containerTwo.contains() + "/100");
            String request = scanner.nextLine();

            String[] parts = request.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);


            if (command.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                containerOne.add(amount);
            } else if (command.equals("move")) {
                containerOne.move(amount, containerTwo);
            } else if (command.equals("remove")) {
                containerTwo.remove(amount);
            } else {
                System.out.println("That is not a command, try again.");
            }
        }
    }
}
