package Part_8.Cubes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cube cube = new Cube();

        Interface ui = new Interface(scanner, cube);

        ui.start();
    }
}
