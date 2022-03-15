package src.item.armor.shoes;

import src.item.Scrappable;

public class EnchantedShoes extends Shoes implements Scrappable {

    public EnchantedShoes() {
        super();
        MARKET_VALUE = 3000;
        SPEED_INCREASE = 85;
        AGILITY_INCREASE = 65;
    }

    public int get_scraps(int quantity) {
        if(this.quantity >= quantity) {
            trash(quantity);
            return quantity * 100;
        }
        return 0;
    }
}
