package Part_5.Apartment;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int apmtMainCost = (this.squares * this.pricePerSquare);
        int apmtComparedCost = (compared.squares * compared.pricePerSquare);
        int costDifference = (apmtMainCost - apmtComparedCost);
        if (costDifference < 0) {
            return (costDifference * -1);
        } else {
            return costDifference;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int apmtMainCost = (this.squares * this.pricePerSquare);
        int apmtComparedCost = (compared.squares * compared.pricePerSquare);
        if (apmtMainCost > apmtComparedCost) {
            return true;
        }
        return false;
    }
}
