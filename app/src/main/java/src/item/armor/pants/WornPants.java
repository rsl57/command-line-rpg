package src.item.armor.pants;

import src.item.Scrappable;

public class WornPants extends Pants implements Scrappable {
    
    public WornPants() {
        super();
        MARKET_VALUE = 225;
        AGILITY_INCREASE = 30;
        HEALTH_INCREASE = 20;
    }

    public int get_scraps(int quantity) {
        if(this.quantity >= quantity) {
            trash(quantity);
            return quantity * 12;
        }
        return 0;
    }
}
