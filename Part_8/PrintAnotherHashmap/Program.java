package Part_8.PrintAnotherHashmap;

import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
		HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    public static void printValues(HashMap<String,Book> hashmap) {
        for (Book b: hashmap.values()) {
            System.out.println(b);
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for (Book b: hashmap.values()) {
            if (b.getName().contains(text)) {
                System.out.println(b);
            }
        }
    }

    public static void printKeys(HashMap<String,String> hashmap) {
        for (String k: hashmap.keySet()) {
            System.out.println(k);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String k: hashmap.keySet()) {
            if (k.contains(text)) {
                System.out.println(k);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String k: hashmap.keySet()) {
            if (k.contains(text)) {
                System.out.println(hashmap.get(k));
            }
        }
    }
}
