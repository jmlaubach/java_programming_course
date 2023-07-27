package Part_4.NumbersFromFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        System.out.println("Name of the file to search:");
        String file_name = scanner.nextLine();
        System.out.println("Lower bound?");
        int lower = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound?");
        int upper = Integer.valueOf(scanner.nextLine());

        try (Scanner reader = new Scanner(Paths.get("Part_4/NumbersFromFile/" + file_name))) {

            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                int number = Integer.valueOf(row);

                if (number >= lower && number <= upper) {
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file_name + " failed.");
        }

        System.out.println("Numbers: " + count);
    }
}
