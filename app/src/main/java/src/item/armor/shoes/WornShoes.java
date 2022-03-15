package src.item.armor.shoes;

import src.item.Scrappable;

public class WornShoes extends Shoes implements Scrappable {
    
    public WornShoes() {
        super();
        MARKET_VALUE = 200;
        SPEED_INCREASE = 30;
        AGILITY_INCREASE = 20;
    }

    public int get_scraps(int quantity) {
        if(this.quantity >= quantity) {
            trash(quantity);
            return quantity * 12;
        }
        return 0;
    }
}
