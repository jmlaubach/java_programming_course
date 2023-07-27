package Part_4.RecordsInFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file_name = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get("Part_4/RecordsInFile/records.txt"))) {

            while (reader.hasNextLine()) {
                String row = reader.nextLine();

                String [] entry = row.split(",");
                String name = entry[0];
                int age = Integer.valueOf(entry[1]);

                System.out.println(name + ", age: " + age + " years");
            }

        } catch (Exception e) {
            System.out.println("A file with that name does not exist in the specified location.");
        }
    }
}
