package Part_6.Stack;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take() {
        int stackSize = this.stack.size() - 1;
        String lastString = this.stack.get(stackSize);

        this.stack.remove(stackSize);

        return lastString;
    }
}
