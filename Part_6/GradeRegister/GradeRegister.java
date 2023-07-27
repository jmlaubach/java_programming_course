package Part_6.GradeRegister;

import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received: this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfGrades() {
        if (grades.isEmpty()) {
            return -1;
        }

        int gradeSum = 0;
        int gradeCount = 0;

        for (Integer g: grades) {
            gradeSum += g;
            gradeCount++;
        }

        double gradeAverage = (double) gradeSum / (double) gradeCount;
        return gradeAverage;
    }

    public double averageOfPoints() {
        if (points.isEmpty()) {
            return -1;
        }

        int pointSum = 0;
        int pointCount = 0;

        for (Integer p: points) {
            pointSum += p;
            pointCount++;
        }

        double pointAverage = (double) pointSum / (double) pointCount;
        return pointAverage;
    }

    public static int pointsToGrades(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
