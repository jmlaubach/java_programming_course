package Part_8.Abbreviations;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbr, String expl) {
        this.abbreviations.put(abbr, expl);
    }

    public boolean hasAbbreviation(String abbr) {
        return this.abbreviations.containsKey(abbr);
    }

    public String findExplanationFor(String abbr) {
        return this.abbreviations.get(abbr);
    }
}
