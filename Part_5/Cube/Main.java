package Part_5.Cube;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Integer edgeLenth = Integer.valueOf(reader.nextLine());

        Cube cube = new Cube(edgeLenth);

        System.out.println(cube);
    }
}
