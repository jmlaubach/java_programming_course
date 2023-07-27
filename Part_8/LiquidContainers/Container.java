package Part_8.LiquidContainers;

public class Container {
    private int volume;

    public Container() {
        this.volume = 0;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int amount) {
        this.volume = amount;
    }

    public void add(int amount) {
        this.volume += amount;
    }

    public void remove(int amount) {
        this.volume -= amount;
    }

    public String toString() {
        return this.volume + "/100";
    }
}
