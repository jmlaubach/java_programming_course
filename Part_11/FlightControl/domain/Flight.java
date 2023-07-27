package Part_11.FlightControl.domain;

public class Flight {
    private Plane plane;
    private String departureDest;
    private String targetDest;

    public Flight(Plane plane, String departureDest, String targetDest) {
        this.plane = plane;
        this.departureDest = departureDest;
        this.targetDest = targetDest;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getDepartureDest() {
        return this.departureDest;
    }

    public String getTargetDest() {
        return this.targetDest;
    }

    public void print() {
        System.out.println(this.plane.getID() + " (" + this.plane.getCapacity() + " capacity) (" + getDepartureDest() + "-" + getTargetDest() + ")");
    }
}
