package Part_10.UniqueLastNames;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Interface ui = new Interface(scanner);

        ui.start();
    }
}
