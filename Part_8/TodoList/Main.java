package Part_8.TodoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TodoList todoList = new TodoList();

        Interface ui = new Interface(scanner, todoList);

        ui.start();
    }
}
