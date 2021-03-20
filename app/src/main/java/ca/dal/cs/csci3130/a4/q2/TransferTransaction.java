package ca.dal.cs.csci3130.a4.q2;

public class TransferTransaction implements Transaction {

    ILoyaltyCard card;

    public TransferTransaction(ILoyaltyCard card) {
        this.card = card;
    }

    @Override
    public void performTransaction(ILoyaltyCard card) {
        //grab the old card's points
        int oldCardPoints = card.getCurrentPoints();

        //add them onto the new card
        int currentBalanceOfNewCard = this.card.getCurrentPoints();
        int newBalanceOfNewCard = currentBalanceOfNewCard + oldCardPoints;

        //set the new balance
        this.card.setCurrentPoints(newBalanceOfNewCard);

        //deduct points from the old card
        card.setCurrentPoints(0);
    }
}
