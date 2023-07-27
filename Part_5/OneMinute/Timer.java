package Part_5.OneMinute;

public class Timer {
    private ClockHand seconds;
    private ClockHand hundredthseconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthseconds = new ClockHand(100);
    }

    public void advance() {
        this.hundredthseconds.advance();

        if (this.hundredthseconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + hundredthseconds;
    }
}
