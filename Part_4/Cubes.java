package Part_4;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            String num = reader.nextLine();

            if (num.equals("end")) {
                break;
            }

            Integer to_num = Integer.valueOf(num);

            System.out.println(to_num * to_num * to_num);
        }
    }
}
