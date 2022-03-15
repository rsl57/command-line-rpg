package src.item.armor;

import src.item.Item;

public abstract class Armor extends Item {
    
    public Armor() {
        EQUIPABLE = true;
        CONSUMABLE = false;
        MAX_STACK = 1;
    }
}
