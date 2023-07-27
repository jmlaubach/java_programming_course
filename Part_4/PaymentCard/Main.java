package Part_4.PaymentCard;

public class Main {
    public static void main(String[] args) {
        PaymentCard paul_card = new PaymentCard(20);
        PaymentCard matt_card = new PaymentCard(30);

        paul_card.eatHeartily();
        matt_card.eatAffordably();

        System.out.println("Paul's card: " + paul_card);
        System.out.println("Matt's card: " + matt_card);

        paul_card.addMoney(20);
        matt_card.eatHeartily();

        System.out.println("Paul's card: " + paul_card);
        System.out.println("Matt's card: " + matt_card);

        paul_card.eatAffordably();
        paul_card.eatAffordably();
        matt_card.addMoney(50);

        System.out.println("Paul's card: " + paul_card);
        System.out.println("Matt's card: " + matt_card);
    }
}
