package Part_10.ReadingFilesPerLine;

import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> rows = new ArrayList<>(null);

        String fileName = "file.txt";

        try {
            Files.lines(Paths.get("Part_10/ReadingFilesPerLine/" + fileName)).forEach(row -> rows.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
