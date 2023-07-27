package Part_4.Gauge;

public class Gauge {
    private int value;

    public Gauge () {
        this.value = 0;
    }

    public void increase() {
        this.value++;
    }
    
    public void decrease() {
        this.value--;
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        return this.value == 5;
    }
}
