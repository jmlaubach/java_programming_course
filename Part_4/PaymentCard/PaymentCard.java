package Part_4.PaymentCard;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if ((this.balance - 2.60) > 0) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if ((this.balance - 4.60) > 0) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double money) {
        boolean check = true;
        while (check) {
            if (money < 0) {
                break;
            } else if ((this.balance + money) <= 150) {
                this.balance += money;
                check = false;
            } else {
                this.balance = 150.00;
                check = false;
            }
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros.";
    }
}
