package ca.dal.cs.csci3130.a4.q4;

public class MasterCard implements ICreditCard {

    @Override
    public boolean payInCredit(int amount) {
        System.out.println("Paid by Mastercard: " + amount);
        return false;
    }

    @Override
    public void payDebit(int amount) {

    }

    @Override
    public void payCredit(int amount) {

    }
}
