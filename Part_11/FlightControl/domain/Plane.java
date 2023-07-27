package Part_11.FlightControl.domain;

public class Plane {
    private String id;
    private int capacity;

    public Plane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String getID() {
        return this.id;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void print() {
        System.out.println(getID() + " (" + getCapacity() + " capacity)");
    }
}
