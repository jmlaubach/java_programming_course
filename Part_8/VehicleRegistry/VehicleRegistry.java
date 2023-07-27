package Part_8.VehicleRegistry;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.containsKey(licensePlate)) {
            return false;
        } else{
            this.registry.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            return null;
        } else {
            return this.registry.get(licensePlate);
        }
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate p: registry.keySet()) {
            p.getliNumber();
        }
    }

    public void printOwners() {
        for (LicensePlate p: registry.keySet()) {
            System.out.println(get(p));
        }
    }
}
