package Part_10.PrintingUserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while(true) {
            String i = scanner.nextLine();
            if (i.equals("")) {
                break;
            }

            inputs.add(i);
        }

        inputs.stream().forEach(item -> System.out.println(item));
    }
}
