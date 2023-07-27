package Part_4.Film;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Film film = new Film("Interstellar", 13);

        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");
        int my_age = Integer.valueOf(reader.nextLine());

        System.out.println();
        if (my_age >= film.ageRating()) {
            System.out.println("You may watch the film " + film.name());
        } else {
            System.out.println("You may NOT watch the film " + film.name());
        }
    }
}
