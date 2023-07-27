package Part_6.SimpleCollection;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> alphabet;

    public SimpleCollection(String name) {
        this.name = name;
        this.alphabet = new ArrayList<>();
    }

    public void add(String letter) {
        this.alphabet.add(letter);
    }

    public String toString() {
        String printOutput = "The collection " + this.name;

        if (this.alphabet.isEmpty()) {
            return printOutput + " is empty.";
        }

        String letterInAlphabet = "";

        for (String letter: this.alphabet) {
            letterInAlphabet = letterInAlphabet + letter + "\n";
        }

        if (this.alphabet.size() == 1) {
            return printOutput + " has " + this.alphabet.size() + " element:\n" + letterInAlphabet;
        } else {
            return printOutput + " has " + this.alphabet.size() + " elements:\n" + letterInAlphabet;
        }
    }
}
