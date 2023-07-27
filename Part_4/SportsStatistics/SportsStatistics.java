package Part_4.SportsStatistics;

import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class SportsStatistics {
    private String file_name;

    public SportsStatistics(String file) {
        this.file_name = file;
    }

    public static ArrayList<SportsStatistics> readFileContents() {
        ArrayList<String> people = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("Part_4/SportsStatistics/" + this.file_name))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
        
                String[] games = line.split(",");
                String team_1 = games[0];
                int team_1_score = Integer.valueOf(games[2]);
                String team_2 = games[1];
                int team_2_score = Integer.valueOf(games[3]);
        
                people.add(line);
            }
        }
    }

    public int gamesPlayed() {

    }
}
