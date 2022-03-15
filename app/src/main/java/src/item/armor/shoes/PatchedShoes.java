package src.item.armor.shoes;

import src.item.Scrappable;

public class PatchedShoes extends Shoes implements Scrappable {
    
    public PatchedShoes() {
        super();
        MARKET_VALUE = 500;
        SPEED_INCREASE = 45;
        AGILITY_INCREASE = 35;
    }

    public int get_scraps(int quantity) {
        if(this.quantity >= quantity) {
            trash(quantity);
            return quantity * 25;
        }
        return 0;
    }
}
