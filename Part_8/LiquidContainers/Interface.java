package Part_8.LiquidContainers;

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
            System.out.println("First: " + this.containerOne);
            System.out.println("Second: " + this.containerTwo);

            String request = scanner.nextLine();
            String[] parts = request.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                if (this.containerOne.getVolume() + amount > 100) {
                    this.containerOne.setVolume(100);
                } else {
                    this.containerOne.add(amount);
                }
            } else if (command.equals("move")) {
                if (amount < 0) {
                    this.containerOne.remove(0);
                    this.containerTwo.add(0);
                } else if (this.containerOne.amount)
                this.containerOne.remove(amount);
                this.containerTwo.add(amount);
            } else if (command.equals("remove")) {
                if (this.containerTwo.getVolume() - amount < 0) {
                    this.containerTwo.setVolume(0);
                } else {
                    this.containerOne.remove(amount);
                }
            } else {
                System.out.println("That is not a command. Try again.");
            }
        }
    }
}
