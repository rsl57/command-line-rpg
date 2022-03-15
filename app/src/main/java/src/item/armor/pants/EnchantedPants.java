package src.item.armor.pants;

import src.item.Scrappable;

public class EnchantedPants extends Pants implements Scrappable {
    
    public EnchantedPants() {
        super();
        MARKET_VALUE = 3400;
        AGILITY_INCREASE = 85;
        HEALTH_INCREASE = 65;
    }

    public int get_scraps(int quantity) {
        if(this.quantity >= quantity) {
            trash(quantity);
            return quantity * 100;
        }
        return 0;
    }
}
