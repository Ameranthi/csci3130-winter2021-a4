package ca.dal.cs.csci3130.a4.q3;

public class GoodsFactory implements ItemFactory {
    @Override
    public Item getItem(String itemType) {
        if (itemType.equalsIgnoreCase(ItemConstants.BABY_TOY)){
            return new BabyToy();
        } else if (itemType.equalsIgnoreCase(ItemConstants.CLOTHES)) {
            return new Clothes();
        } else if(itemType.equalsIgnoreCase(ItemConstants.COMPUTER_PARTS)){
            return new ComputerParts();
        }

        return null;
    }
}
