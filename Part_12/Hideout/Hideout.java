package Part_12.Hideout;

public class Hideout<T> {
    private T hidden;

    public Hideout() {
    }

    public void putIntoHideout(T toHide) {
        this.hidden = toHide;
    }

    public T takeFromHideout() {
        if (this.hidden == null) {
            return null;
        }

        T taken = this.hidden;
        this.hidden = null;
        return taken;
    }

    public boolean isInHideout() {
        return this.hidden != null;
    }
}