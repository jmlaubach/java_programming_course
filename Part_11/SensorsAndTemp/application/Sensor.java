package Part_11.SensorsAndTemp.application;

public interface Sensor {
    boolean isOn();

    void setOn();

    void setOff();

    int read();
}
