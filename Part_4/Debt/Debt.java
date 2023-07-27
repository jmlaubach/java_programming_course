package Part_4.Debt;

public class Debt {
    private double balance;
    private double interestRate;

    public Debt (double interestRate, double balance) {
        this.interestRate = interestRate;
        this.balance = balance;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        this.balance = (this.balance * this.interestRate);
    }
}
