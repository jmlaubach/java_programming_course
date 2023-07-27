package Part_5.Counter;

public class Counter {
    private int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return startValue;
    }

    public void increase() {
        this.startValue++;
    }

    public void increase(int increaseAmount) {
        this.startValue += increaseAmount;
    }

    public void decrease() {
        this.startValue--;
    }

    public void decrease(int decreaseAmount) {
        this.startValue -= decreaseAmount;
    }
}
