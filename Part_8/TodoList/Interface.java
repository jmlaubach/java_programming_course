package Part_8.TodoList;

import java.util.Scanner;

public class Interface {
    private Scanner scanner;
    private TodoList list;

    public Interface(Scanner scanner, TodoList list) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("Task: ");
                String task = scanner.nextLine();

                list.add(task);
            } else if (command.equals("completed")) {
                System.out.print("Which task was completed? ");
                int taskNumber = Integer.valueOf(scanner.nextLine());

                list.remove(taskNumber);
            } else if (command.equals("list")) {
                this.list.print();
            } else {
                System.out.println("That is not a command. Try again.");
            }
        }
    }
}
