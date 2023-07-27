package Part_9.Warehouse;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changeList;

    public ChangeHistory() {
        this.changeList = new ArrayList<>();
    }

    public void add(double status) {
        this.changeList.add(status);
    }

    public void clear() {
        this.changeList.clear();
    }

    public double maxValue() {
        if (this.changeList.size() == 0) {
            return 0;
        }

        double largest = 0.0;

        for (Double x: changeList) {
            if (x > largest) {
                largest = x;
            }
        }
        return largest;
    }

    public double minValue() {
        if (this.changeList.size() == 0) {
            return 0;
        }

        double smallest = maxValue();

        for (Double x: changeList) {
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest;
    }

    public double average() {
        if (this.changeList.size() == 0) {
            return 0;
        }

        int historyCount = 0;
        double sum = 0.0;

        for (Double x: changeList) {
            sum += x;
            historyCount++;
        }

        return sum / (double) historyCount;
    }

    public String toString() {
        return this.changeList.toString();
    }
}
