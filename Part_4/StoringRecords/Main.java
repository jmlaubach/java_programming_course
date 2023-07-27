package Part_4.StoringRecords;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the name of the file you would like to read: ");
        String file_name = reader.nextLine();

        StoringRecords f = new StoringRecords(file_name);

        f.readRecordsFromFile(file_name);
    }
}
