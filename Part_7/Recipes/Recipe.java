package Part_7.Recipes;

import java.util.Scanner;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.ArrayList;

public class Recipe {
    private String fileName;

    public Recipe(String fileName) {
        this.fileName = fileName;
    }

    public HashMap<String, HashMap<String, ArrayList<String>>> saveRecipes() {
        HashMap<String, HashMap<String, ArrayList<String>>> recipeBook = new HashMap<>();
        HashMap<String, ArrayList<String>> recipeInfo = new HashMap<>();
        ArrayList<String> ingredients = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("Part_7/Recipes/" + fileName))) {
            String recipeOne = scanner.nextLine();
            String cookTimeOne = scanner.nextLine();
            String row = scanner.nextLine();

            ArrayList<String> ingredients = new ArrayList<>();

            while(!(row.isEmpty())) {
                ingredients.add(row);
                row = scanner.nextLine();
            }

            while(scanner.hasNextLine()) {
                String recipe = scanner.nextLine();
                String cookTime = scanner.nextLine();
                row = scanner.nextLine();

                while(!(row.isEmpty())) {
                    ingredients.add(row);
                    row = scanner.nextLine();
                }
                row = scanner.nextLine();
                if (row.isEmpty()) {
                    break;
                }
            }

            while(!(row.isEmpty())) {
                ingredients.add(row);
                scanner.nextLine();
            }

            System.out.println(ingredients);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
        

    public void listRecipes() {
        System.out.println("Recipes: ");

        try (Scanner scanner = new Scanner(Paths.get("Part_7/Recipes/" + fileName))) {
            String recipeOne = scanner.nextLine();
            String cookTimeOne = scanner.nextLine();
            System.out.println(recipeOne + ", cooking time: " + cookTimeOne);

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();

                if (row.isEmpty()) {
                    String recipeName = scanner.nextLine();
                    String cookTime = scanner.nextLine();
                    System.out.println(recipeName + ", cooking time: " + cookTime);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("");
    }

    public void searchForRecipe(String searchedWord) {
        try (Scanner scanner = new Scanner(Paths.get("Part_7/Recipes/" + fileName))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();

                if (row.isEmpty()) {
                    continue;
                }

                if (row.contains(searchedWord)) {
                    String recipeName = row;
                    String cookTime = scanner.nextLine();

                    System.out.println("");
                    System.out.println("Recipes: ");
                    System.out.println(recipeName + ", cooking time: " + cookTime);
                    System.out.println("");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
