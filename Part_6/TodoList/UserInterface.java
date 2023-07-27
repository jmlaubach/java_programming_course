package Part_6.TodoList;

import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(Scanner scanner, TodoList list) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String addedTask = scanner.nextLine();
                list.add(addedTask);
            } else if (command.equals("list")) {
                list.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is remove? ");
                int removedItem = Integer.valueOf(scanner.nextLine());
                list.remove(removedItem);
            } else {
                System.out.println("That is not a command that can be used.");
            }
        }
    }
}
