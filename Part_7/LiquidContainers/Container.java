package Part_7.LiquidContainers;

public class Container {
    private int volume;

    public Container() {
        this.volume = 0;
    }

    public int contains() {
        return this.volume;
    }

    public void add(int amount) {
        if (this.volume + amount > 100) {
            this.volume = 100;
        } else if (amount < 0) {
            this.volume += 0;
        } else {
            this.volume += amount;
        }
    }

    public void remove(int amount) {
        if (this.volume - amount < 0) {
            this.volume = 0;
        } else {
            this.volume -= amount;
        }
    }

    public void move(int amount, Container containerTwo) {
        if (amount < 0) {
            this.volume += 0;
            containerTwo.add(0);
        } else if (containerTwo.contains() + amount > 100) {
            containerTwo.add((100 - containerTwo.contains()));
            this.volume -= amount;
        } else if (this.volume - amount < 0) {
            containerTwo.add(this.volume);
            this.volume = 0;
        } else {
            containerTwo.add(amount);
            this.volume -= amount;
        }
    }

    public String toString() {
        return this.volume + "/100";
    }
}
