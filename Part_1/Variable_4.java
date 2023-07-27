package Part_1;

import java.util.Scanner;

public class Variable_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something");
        boolean bool = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or False?: " + bool);
    }
}
