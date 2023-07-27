package Part_11.FlightControl.logic;

import Part_11.FlightControl.domain.Flight;
import Part_11.FlightControl.domain.Plane;
import java.util.ArrayList;

public class FlightControl {
    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;

    public FlightControl() {
        this.planes = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public ArrayList<Plane> getPlanes() {
        return this.planes;
    }

    public ArrayList<Flight> getFlights() {
        return this.flights;
    }

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }
}
