package Part_8.StorageFacility;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.facility.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> items = this.facility.get(unit);

        items.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.facility.containsKey(storageUnit)) {
            return this.facility.get(storageUnit);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String storageUnit, String item) {
        int itemIndex = (this.facility.get(storageUnit).indexOf(item));
        this.facility.get(storageUnit).remove(itemIndex);

        if (this.facility.get(storageUnit).size() == 0) {
            this.facility.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitList = new ArrayList<>();

        for (String unit: facility.keySet()) {
            if (this.facility.get(unit).size() == 0) {
                continue;
            } else {
                unitList.add(unit);
            }
        }

        return unitList;
    }
}
