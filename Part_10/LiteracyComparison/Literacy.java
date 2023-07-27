package Part_10.LiteracyComparison;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Literacy {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> lines = new ArrayList<>();

        String file = "literacy.csv";

        try {
            Files.lines(Paths.get("Part_10/LiteracyComparison/" + file))
                .map(row -> row.split(","))
                .filter(parts -> parts.length >= 6)
                .sorted((p1, p2) -> {
                    return p1[5].compareTo(p2[5]);
                })
                .forEach(p -> System.out.println(p[3] + " ( " + p[4] + "), " + String.format(p[2].trim().split(" ")[0]) + ", " + p[5]));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
