package Part_8.VehicleRegistry;

public class LicensePlate {

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    public String getliNumber() {
        return this.liNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof LicensePlate)) return false;

        LicensePlate that = (LicensePlate) o;

        if (this.liNumber.equals(that.liNumber) &&
            this.country.equals(that.country)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.liNumber.hashCode();
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
}
