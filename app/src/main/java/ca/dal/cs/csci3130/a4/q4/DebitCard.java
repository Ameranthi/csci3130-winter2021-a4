package ca.dal.cs.csci3130.a4.q4;

public class DebitCard implements IDebitCard {
    @Override
    public boolean pay(String paymentType, int amount) {
        System.out.println("Paid by " + paymentType + ": " + amount);
        return true;
    }

    @Override
    public void payDebit(int amount) {

    }

    @Override
    public void payCredit(int amount) {

    }
}
