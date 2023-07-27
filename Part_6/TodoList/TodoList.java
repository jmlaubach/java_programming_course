package Part_6.TodoList;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todolist;

    public TodoList() {
        this.todolist = new ArrayList<>();
    }

    public void add(String task) {
        this.todolist.add(task);
    }

    public void remove(int number) {
        todolist.remove(number - 1);
    }

    public void print() {
        int itemNumber = 1;
        for (String item: todolist) {
            System.out.println(itemNumber + ": " + item);
            itemNumber++;
        }
    }
}
