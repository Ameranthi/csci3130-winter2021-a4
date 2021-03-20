package ca.dal.cs.csci3130.a4.q2;

public class CashInTransaction implements Transaction {
    int point2Cash;
    final int MINIMUM_POINTS = 500;

    public CashInTransaction(int point2Cash) {
        this.point2Cash = point2Cash;
    }

    public void performTransaction(ILoyaltyCard card) {

        if(card.getCurrentPoints()>=MINIMUM_POINTS){
            //grab the current points
            int currentPoints = card.getCurrentPoints();
            // new balance after points being deducted
            int newBalance = currentPoints - this.point2Cash;
            //set the new balance
            card.setCurrentPoints(newBalance);
        }
    }
}
