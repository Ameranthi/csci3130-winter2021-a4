package ca.dal.cs.csci3130.a4.q4;

public interface ISmartCard {
    public void payDebit(int amount);
    public void payCredit(int amount);
}
