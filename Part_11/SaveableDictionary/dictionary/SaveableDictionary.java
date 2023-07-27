package Part_11.SaveableDictionary.dictionary;

import java.util.HashMap;
import java.util.Map.Entry;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public void add(String words, String translation) {
        this.dictionary.put(words, translation);
    }

    public String translate(String word) {
        for (String item: this.dictionary.keySet()) {
            if (this.dictionary.get(item).equals(word)) {
                return item;
            } else if (this.dictionary.get(word) != null) {
                return this.dictionary.get(word);
            }
        }

        return null;
    }
}
