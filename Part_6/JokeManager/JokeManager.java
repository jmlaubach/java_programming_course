package Part_6.JokeManager;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJokes() {
        if (jokes.isEmpty()) {
            System.out.println("Jokes are in short supply.");
        }
        Random rand = new Random();

        return jokes.get(rand.nextInt(jokes.size()));

    }

    public void printJokes() {
        for (String j: jokes) {
            System.out.println(j);
        }
    }
}
