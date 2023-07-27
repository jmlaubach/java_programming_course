package Part_4.StoringRecords;

import java.util.Scanner;
import java.nio.file.Paths;

public class StoringRecords {

    private String file_name;

    public StoringRecords(String file_name) {
        this.file_name = file_name;
    }

    public void readRecordsFromFile(String file_name) {
        try (Scanner reader = new Scanner(Paths.get("Part_4/StoringRecords/records.txt"))) {

            while (reader.hasNextLine()) {
                String row = reader.nextLine();

                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("A file with that name does not exist in the specified location.");
        }
    }
}
