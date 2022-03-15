package src.item.armor.pants;

import src.item.Scrappable;

public class ComfortablePants extends Pants implements Scrappable {
    
    public ComfortablePants() {
        super();
        MARKET_VALUE = 1400;
        AGILITY_INCREASE = 65;
        HEALTH_INCREASE = 50;
    }

    public int get_scraps(int quantity) {
        if(this.quantity >= quantity) {
            trash(quantity);
            return quantity * 50;
        }
        return 0;
    }
}
