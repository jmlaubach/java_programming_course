package Part_6.TodoList;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TodoList taskList = new TodoList();

        UserInterface ui = new UserInterface(scanner, taskList);
        ui.start();
    }
}
