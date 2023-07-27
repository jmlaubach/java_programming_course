package Part_9.TacoBoxes;

public class CustomTacoBox implements TacoBox{
    private int initialTacos;

    public CustomTacoBox(int initialTacos) {
        this.initialTacos = initialTacos;
    }
    
    public int tacosRemaining() {
        return this.initialTacos;
    }  
    
    public void eat() {
        if (this.initialTacos == 0) {
            return;
        }
        this.initialTacos--;
    }
}
