package Part_4.InTheFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class InTheFile {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        
        System.out.println("Name of the file to search:");
        String file_name = word.nextLine();
        System.out.println("Name to search for:");
        String name = word.nextLine();

        try (Scanner reader = new Scanner(Paths.get("Part_4/InTheFile/" + file_name))) {
            String row = reader.nextLine();
            if (row.equals(name)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file_name + " failed.");
        }
    }
}
