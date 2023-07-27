package Part_6.Dictionary;

import java.util.Scanner;
import java.util.HashMap;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void endChoice() {
        System.out.println("Bye bye!");
    }

    public void addChoice() {
        System.out.print("Word: ");
        String word = scanner.nextLine();

        System.out.print("Translation: ");
        String translation = scanner.nextLine();

        dictionary.add(word, translation);
    }

    public void searchChoice() {
        System.out.print("To be translated: ");
        String search = scanner.nextLine();

        if (dictionary.translate(search) != null) {
            System.out.println("Translation: " + dictionary.translate(search));
        } else {
            System.out.println("Word " + search + " was not found");
        }
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                endChoice();
                break;
            } else if (command.equals("add")) {
                addChoice();
            } else if (command.equals("search")) {
                searchChoice();
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
