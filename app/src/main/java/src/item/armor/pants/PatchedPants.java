package src.item.armor.pants;

import src.item.Scrappable;

public class PatchedPants extends Pants implements Scrappable {
    
    public PatchedPants() {
        super();
        MARKET_VALUE = 550;
        AGILITY_INCREASE = 45;
        HEALTH_INCREASE = 35;
    }

    public int get_scraps(int quantity) {
        if(this.quantity >= quantity) {
            trash(quantity);
            return quantity * 25;
        }
        return 0;
    }
}
