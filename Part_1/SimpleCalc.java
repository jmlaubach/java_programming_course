package Part_1;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        double num1_dub = Double.valueOf(num1);
        double num2_dub = Double.valueOf(num2);

        int add = num1 + num2;
        int minus = num1 - num2;
        double mult = num1_dub * num2_dub;
        double divide = num1_dub / num2_dub;
        System.out.println(num1 + " + " + num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + minus);
        System.out.println(num1 + " * " + num2 + " = " + mult);
        System.out.println(num1 + " / " + num2 + " = " + divide);
    }
}