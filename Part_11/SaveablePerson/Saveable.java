package Part_11.SaveablePerson;

public interface Saveable {
    public void save();

    public void delete();

    public void load(String address);
}
