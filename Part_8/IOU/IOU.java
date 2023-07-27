package Part_8.IOU;

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> owedPeople;

    public IOU() {
        this.owedPeople = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.owedPeople.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
            return this.owedPeople.getOrDefault(toWhom, 0.0);
    }
}
