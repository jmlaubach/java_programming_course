package Part_11.FirstPackages.mooc;

import Part_11.FirstPackages.mooc.logic.ApplicationLogic;
import Part_11.FirstPackages.mooc.ui.TextInterface;
import Part_11.FirstPackages.mooc.ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
