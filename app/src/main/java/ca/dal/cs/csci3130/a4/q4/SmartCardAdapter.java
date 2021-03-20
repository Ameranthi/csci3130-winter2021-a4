package ca.dal.cs.csci3130.a4.q4;

public class SmartCardAdapter implements IAdaptor {

    ISmartCard smartCard;

    public SmartCardAdapter(String cardType) {
        if (cardType.equalsIgnoreCase(CardConstants.CREDIT_PAYMENT)) {
            smartCard = (ISmartCard) new MasterCard();
        } else if (cardType.equalsIgnoreCase(CardConstants.DEBIT_PAYMENT)) {
            smartCard = (ISmartCard) new DebitCard();
        }
    }

    public boolean pay(String paymentType, int amount) {

        if (paymentType.equalsIgnoreCase(CardConstants.DEBIT_PAYMENT)) {
            smartCard.payDebit(amount);
            return true;
        } else if (paymentType.equalsIgnoreCase(CardConstants.CREDIT_PAYMENT)) {
            smartCard.payCredit(amount);
            return true;
        }

        return false;
    }
}
