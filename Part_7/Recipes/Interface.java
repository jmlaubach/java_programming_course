package Part_7.Recipes;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class Interface {
    private Scanner scanner;

    public Interface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        Recipe recipes = new Recipe(fileName);

        System.out.println("");
        System.out.println("Commands: ");
        System.out.println("list - Lists the recipes");
        System.out.println("find name - Searches recipes by name");
        System.out.println("stop - stops the program");
        System.out.println("");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println("");
                recipes.listRecipes();
            }

            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchedWord = scanner.nextLine();
                recipes.searchForRecipe(searchedWord);
            }
        }
    }
}
