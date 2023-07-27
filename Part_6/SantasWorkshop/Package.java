package Part_6.SantasWorkshop;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> giftPackage;

    public Package() {
        this.giftPackage = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.giftPackage.add(gift);
    }

    public int totalWeight() {
        int total = 0;

        for (Gift gift: giftPackage) {
            total += gift.getWeight();
        }

        return total;
    }
}
