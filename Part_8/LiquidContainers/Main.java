package Part_8.LiquidContainers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Container containerOne = new Container();
        Container containerTwo = new Container();

        Interface ui = new Interface(scanner, containerOne, containerTwo);

        ui.start();
    }
}
