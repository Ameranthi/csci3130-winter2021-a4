package ca.dal.cs.csci3130.a4.q4;

public interface IDebitCard extends ISmartCard{

    public boolean pay(String paymentType, int amount);
}
