package Part_11.SensorsAndTemp.application;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
    }

    public boolean isOn() {
        for (Sensor s: sensors) {
            if (s.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    public void setOn() {
        for (Sensor s: sensors) {
            s.setOn();
        }
    }

    public void setOff() {
        for (Sensor s: sensors) {
            s.setOff();
        }
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public List<Integer> readings() {
        List<Integer> sensorValues = new ArrayList<>();

        for (Sensor s: sensors) {
            sensorValues.add(s.read());
        }

        return sensorValues;
    }

    public int read() {
        Random rand = new Random();
        int sum = 0;
        int total = 0;

        if (sensors.size() == 0) {
            throw new IllegalStateException("Cannot compute sensor average. No sensors in list.");
        }

        for (Sensor s: sensors) {
            if (s.isOn() == false) {
                throw new IllegalStateException("Cannot compute sensor average. One or more sensors are off.");
            }
            total += s.read();
            sum++;
        }
        return total / sum;
    }
}
