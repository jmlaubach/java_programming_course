package Part_7.GradeStatistics;

import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;

    public Grades() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double average() {
        int count = 0;
        int sum = 0;
        for (Integer g: this.grades) {
            sum += g;
            count++;
        }

        return ((double) sum / (double) count);
    }

    public double passingAverage() {
        int count = 0;
        int sum = 0;
        for (Integer g: this.grades) {
            if (g >= 50) {
                sum += g;
                count++;
            } 
        }

        if (count == 0 && sum == 0) {
            return -1;
        } else {
            return ((double) sum / (double) count);
        }
    }

    public double passingPercentage() {        
        int passingCount = 0;
        for (Integer g: this.grades) {
            if (g >= 50) {
                passingCount++;
            }
        }

        return 100 * ((double) passingCount / this.grades.size());
    }

    public int gradesToPoints(int grade) {
        int points = 0;
        if (grade < 50) {
            points = 0;
        } else if (grade < 60) {
            points = 1;
        } else if (grade < 70) {
            points = 2;
        } else if (grade < 80) {
            points = 3;
        } else if (grade < 90) {
            points = 4;
        } else {
            points = 5;
        }

        return points;
    }

    public int numberOfPoints(int points) {
        int pointCount = 0;
        for (Integer g: this.grades) {
            if (gradesToPoints(g) == points) {
                pointCount++;
            }
        }
        return pointCount;
    }
}
