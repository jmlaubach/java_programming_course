package Part_8.TodoList;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void remove(int number) {
        this.list.remove(number - 1);
    }

    public void print() {
        int listItemCount = 1;

        for (String i: this.list) {
            System.out.println(listItemCount + ": " + i);
            listItemCount++;
        }
    }
}
