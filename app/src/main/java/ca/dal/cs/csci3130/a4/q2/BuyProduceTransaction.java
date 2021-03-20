package ca.dal.cs.csci3130.a4.q2;


public class BuyProduceTransaction implements Transaction {

    int points2Buy;
    final int MINIMUM_POINTS = 500;

    public BuyProduceTransaction(int points2Buy) {
        this.points2Buy = points2Buy;
    }

    @Override
    public void performTransaction(ILoyaltyCard card) {
        if(card.getCurrentPoints()>=MINIMUM_POINTS) {
            //grab the current points
            int currentPoints = card.getCurrentPoints();
            // new balance after points being deducted
            int newBalance = currentPoints - this.points2Buy;
            //set the new balance
            card.setCurrentPoints(newBalance);
        }
    }


}
