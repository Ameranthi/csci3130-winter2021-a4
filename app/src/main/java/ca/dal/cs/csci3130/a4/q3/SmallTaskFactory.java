package ca.dal.cs.csci3130.a4.q3;

public class SmallTaskFactory implements ItemFactory {

    @Override
    public Item getItem(String itemType) {
        if (itemType.equalsIgnoreCase(ItemConstants.WALK_A_DOG)){
            return new WalkADog();
        } else if (itemType.equalsIgnoreCase(ItemConstants.MOW_THE_LAWN)) {
            return new MowTheLawn();
        } else if(itemType.equalsIgnoreCase(ItemConstants.PICK_UP_GROCERY)){
            return new PickUpGrocery();
        }
        return null;
    }
}
