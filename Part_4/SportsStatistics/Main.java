package Part_4.SportsStatistics;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("File: ");
        String file_name = input.nextLine();
        System.out.println("Team name: ");
        String team_name = input.nextLine();

        SportsStatistics f = new SportsStatistics(file_name);

        f.readFileContents(file_name);
    }
}
