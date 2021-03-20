package ca.dal.cs.csci3130.a4.q4;

public class SmartCard implements IAdaptor{
    SmartCardAdapter adapter;

    public SmartCard(SmartCardAdapter adapter) {
    }

    @Override
    public boolean pay(String paymentType, int amount) {
        boolean paid = false;

        //inbuilt support to pay with MasterCard
        if(paymentType.equalsIgnoreCase(CardConstants.CREDIT_PAYMENT)){
            System.out.println("Paid by Mastercard: " + amount);
            paid = true;

            //adaptor providing support to pay with other card type
        } else if (paymentType.equalsIgnoreCase(CardConstants.DEBIT_PAYMENT)){
            adapter = new SmartCardAdapter(paymentType);
            adapter.pay(paymentType, amount);
            paid = true;
        }
        return paid;
    }

}
