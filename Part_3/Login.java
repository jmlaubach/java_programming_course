package Part_3;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String[] usernames = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};

        System.out.print("Enter username: ");
        String username = reader.nextLine();
        System.out.print("Enter password: ");
        String password = reader.nextLine();

        if (username.equals(usernames[0])) {
            if (password.equals(passwords[0])) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        } else {
            if (username.equals(usernames[1]) && password.equals(passwords[1])) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        }
    }
}
