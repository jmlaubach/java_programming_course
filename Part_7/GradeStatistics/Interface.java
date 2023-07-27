package Part_7.GradeStatistics;

import java.util.Scanner;

public class Interface {
    private Scanner scanner;
    private Grades grades;

    public Interface(Scanner scanner, Grades grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start() {
        System.out.println("Enter point totals. -1 stops:");

        while (true) {
            int grade = Integer.valueOf(scanner.nextLine());

            if (grade == -1) {
                break;
            } else if (grade < -1) {
                continue;
            } else if (grade > 100) {
                continue;
            } else {
                this.grades.addGrade(grade);
            }
        }

        System.out.print("Point average (all): " + this.grades.average());

        System.out.println("");

        if (this.grades.passingAverage() == -1) {
            System.out.print("Point average (passing): -");
        } else {
            System.out.print("Point average (passing): " + this.grades.passingAverage());
        }

        System.out.println("");

        System.out.print("Pass percentage: " + this.grades.passingPercentage());

        System.out.println("");

        printPointDistribution();
    }

    public void printPointDistribution() {
        int counter = 5;
        System.out.println("Grade distribution: ");
        while (counter >= 0) {
            int pointTotal = this.grades.numberOfPoints(counter);
            System.out.print(counter + ": ");
            printStars(pointTotal);
            System.out.println("");
            counter--;
        }
    }

    public void printStars(int points) {
        for (int i = 1; i <= points; i++) {
            System.out.print("*");
        }
    }
}
