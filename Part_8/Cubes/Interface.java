package Part_8.Cubes;

import java.util.Scanner;

public class Interface {
    private Scanner scanner;
    private Cube cube;
    
    public Interface(Scanner scanner, Cube cube) {
        this.scanner = scanner;
        this.cube = cube;
    }

    public void start() {
        while (true) {
            String numToCube = scanner.nextLine();
            
            if (numToCube.equals("end")) {
                break;
            } else {
                int intNumToCube = Integer.valueOf(numToCube);
                this.cube.setNumber(intNumToCube);
                System.out.println(this.cube.cubeNumber());
            }
        }
    }
}
