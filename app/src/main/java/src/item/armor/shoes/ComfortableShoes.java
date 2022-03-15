package src.item.armor.shoes;

import src.item.Scrappable;

public class ComfortableShoes extends Shoes implements Scrappable {
    
    public ComfortableShoes() {
        super();
        MARKET_VALUE = 1200;
        SPEED_INCREASE = 65;
        AGILITY_INCREASE = 50;
    }

    public int get_scraps(int quantity) {
        if(this.quantity >= quantity) {
            trash(quantity);
            return quantity * 50;
        }
        return 0;
    }
}
