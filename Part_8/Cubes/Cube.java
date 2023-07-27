package Part_8.Cubes;

public class Cube {
    private int number;

    public Cube() {
        this.number = 0;
    }

    public void setNumber(int numToCube) {
        this.number = numToCube;
    }

    public int cubeNumber() {
        return (this.number * this.number * this.number);
    }
}
