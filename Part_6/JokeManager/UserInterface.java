package Part_6.JokeManager;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokes;

    public UserInterface(Scanner scanner, JokeManager jokes) {
        this.scanner = scanner;
        this.jokes = jokes;
    }

    public void start() {     
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - Add a joke");
            System.out.println("2 - Draw a joke");
            System.out.println("3 - List jokes");
            System.out.println("X - Stop");

            String input = scanner.nextLine();

            if (input.equals("X")) {
                break;
            } else if (input.equals("1")) {
                add();
            } else if (input.equals("2")) {
                System.out.println(jokes.drawJokes());
            } else if (input.equals("3")) {
                list();
            } else {
                System.out.println("That is not an option. Pick again.");
            }
        }

    }

    public void add() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        jokes.addJoke(joke);
    }

    public void list() {
        System.out.println("Printing the jokes:");

        jokes.printJokes();
    }
}
