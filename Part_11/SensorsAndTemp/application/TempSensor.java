package Part_11.SensorsAndTemp.application;

import java.util.Random;

public class TempSensor implements Sensor{
    private boolean isOn;

    public TempSensor() {
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn() {
        this.isOn = true;
    }

    public void setOff() {
        this.isOn = false;
    }

    public int read() {
        Random rand = new Random();

        if (isOn() == false) {
            throw new IllegalStateException("Cannot read sensor. Sensor is off.");
        }
        return rand.nextInt(31);
    }
}
