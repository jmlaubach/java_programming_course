package Part_11.FlightControl;

import java.util.Scanner;

import Part_11.FlightControl.logic.FlightControl;
import Part_11.FlightControl.ui.Interface;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FlightControl flightControl = new FlightControl();

        Interface ui = new Interface(flightControl, scanner);

        ui.start();
    }
}
