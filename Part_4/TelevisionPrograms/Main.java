package Part_4.TelevisionPrograms;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<TelevisionPrograms> programs = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String name = reader.nextLine();

            if (name.equals("")) {
                break;
            }

            System.out.print("Duration: ");
            int time = Integer.valueOf(reader.nextLine());

            programs.add(new TelevisionPrograms(name, time));
        }

        System.out.println();
        System.out.print("Program's maximum duration? ");
        int maximum = Integer.valueOf(reader.nextLine());

        for (TelevisionPrograms program: programs) {
            if (program.getDuration() <= maximum) {
                System.out.println(program);
            }
        }
    }
}
