package Part_12.Pipe;

import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.values.add(value);
    }

    public T takeFromPipe() {
        if (this.values.size() == 0) {
            return null;
        }

        T oldest = this.values.get(0);
        this.values.remove(0);
        return oldest;
    }

    public boolean isInPipe() {
        return this.values.size() > 0;
    }
}
