package Part_3;

import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfAList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        double sum = 0;

        while(true) {
            Double num = Double.valueOf(reader.nextLine());
            if (num == -1) {
                break;
            } else {
                list.add(num);
            }
        }

        for (Double i: list) {
            sum += i;
        }

        System.out.println("Average: " + (sum / list.size()));
    }
}
