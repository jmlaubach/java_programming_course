package Part_7.GradeStatistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Grades grades = new Grades();

        Interface ui = new Interface(scanner, grades);

        ui.start();
    }
}
