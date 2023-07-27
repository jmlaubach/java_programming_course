package Part_4.PrintingAFile;

import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingAFile {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        try (Scanner scanner = new Scanner(Paths.get("Part_4/PrintingAFile/data.txt"))) {

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                
                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
