package Part_8.DictionaryOfManyTranslations;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.translations.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> t = this.translations.get(word);

        t.add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (this.translations.containsKey(word)) {
            return this.translations.get(word);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String word) {
        this.translations.get(word).remove(word);
    }
}
