package Part_1;

import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scanner.nextLine());

        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift >= 5000 && gift < 25000) {
            System.out.println("Tax: " + (100 + (gift - 5000) * 0.08));
        } else if (gift >= 25000 && gift < 55000) {
            System.out.println("Tax: " + (1700 + (gift - 25000) * 0.1));
        } else if (gift >= 55000 && gift < 200000) {
            System.out.println("Tax: " + (4700 + (gift - 55000) * 0.12));
        } else if (gift >= 200000 && gift < 1000000) {
            System.out.println("Tax: " + (22100 + (gift - 200000) * 0.15));
        } else {
            System.out.println("Tax: " + (142000 + (gift - 1000000) * 0.17));
        } 
    }
}
/*
 * When a gift is given by a close relative or a family member, 
 * the amount of gift tax is determined by the following table (source vero.fi):

Value of gift	Tax at the lower limit	Tax rate(%) for exceeding part
5 000 — 25 000	      100	            8
25 000 — 55 000	      1 700	            10
55 000 — 200 000	  4 700	            12
200 000 — 1 000 000	  22 100	        15
1 000 000 —	          142 100	        17

For example 6000€ gift implies 180€ of gift tax (100 + (6000-5000) * 0.08), and 75000€ 
gift implies 7100€ of gift tax (4700 + (75000-55000) * 0.12).

Write a program that calculates the gift tax for a gift from a close relative or a family member. 
This is how the program should work:

Sample output
Value of the gift?
3500
No tax!
 */
