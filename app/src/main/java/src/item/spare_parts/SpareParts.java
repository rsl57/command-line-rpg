package src.item.spare_parts;

import src.item.Item;

public abstract class SpareParts extends Item {
    
    public SpareParts() {
        EQUIPABLE = false;
        CONSUMABLE = false;
        MAX_STACK = 200;
        quantity = 0;
    }
}
