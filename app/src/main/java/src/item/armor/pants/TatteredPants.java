package src.item.armor.pants;

import src.item.Scrappable;

public class TatteredPants extends Pants implements Scrappable {
    
    public TatteredPants() {
        super();
        MARKET_VALUE = 105;
        AGILITY_INCREASE = 20;
        HEALTH_INCREASE = 10;
    }

    public int get_scraps(int quantity) {
        if(this.quantity >= quantity) {
            trash(quantity);
            return quantity * 5;
        }
        return 0;
    }
}
