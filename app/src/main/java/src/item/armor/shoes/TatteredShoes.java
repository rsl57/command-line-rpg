package src.item.armor.shoes;

import src.item.Scrappable;

public class TatteredShoes extends Shoes implements Scrappable {
    
    public TatteredShoes() {
        super();
        MARKET_VALUE = 80;
        SPEED_INCREASE = 20;
        AGILITY_INCREASE = 10;
    }

    public int get_scraps(int quantity) {
        if(this.quantity >= quantity) {
            trash(quantity);
            return quantity * 5;
        }
        return 0;
    }
}
