package Part_11.FlightControl.ui;

import java.util.Scanner;
import Part_11.FlightControl.domain.Flight;
import Part_11.FlightControl.domain.Plane;
import Part_11.FlightControl.logic.FlightControl;

public class Interface {
    
    private FlightControl flightControl;
    private Scanner scanner;

    public Interface(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void start() {
        assetControl();
        System.out.println("");
        flightControl();
        System.out.println("");
    }

    public void assetControl() {
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");

            String choice = this.scanner.nextLine();

            if (choice.equals("x")) {
                break;
            }

            if (choice.equals("1")) {
                addPlaneUI();
            }

            if (choice.equals("2")) {
                addFlightUI();
            }
        }
    }

    public void addPlaneUI() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.valueOf(scanner.nextLine());

        Plane p = new Plane(id, capacity);

        this.flightControl.addPlane(p);
    }

    public void addFlightUI() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.print("Give the departure airport id: ");
        String departure = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String target = scanner.nextLine();

        for (Plane p: flightControl.getPlanes()) {
            if (p.getID().equals(id)) {
                Flight newFlight = new Flight(p, departure, target);
                this.flightControl.addFlight(newFlight);
                break;
            }
        }
    }

    public void flightControl() {
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");

            String choice = this.scanner.nextLine();

            if (choice.equals("x")) {
                break;
            }

            if (choice.equals("1")) {
                printPlanesUI();
            }

            if (choice.equals("2")) {
                printFlightsUI();
            }

            if (choice.equals("3")) {
                printPlaneDetailUI();
            }
        }
    }

    public void printPlanesUI() {
        for (Plane p: flightControl.getPlanes()) {
            p.print();
        }
        System.out.println("");
    }

    public void printFlightsUI() {
        for (Flight f: flightControl.getFlights()) {
            f.print();
        }
        System.out.println("");
    }

    public void printPlaneDetailUI() {
        System.out.print("Give the airplane id: ");
        String planeID = scanner.nextLine();

        for (Plane p: flightControl.getPlanes()) {
            if (p.getID().equals(planeID)) {
                p.print();
            }
        }
        System.out.println("");
    }
}
