package src.item.armor.handgear;

import src.item.armor.Armor;

public abstract class HandGear extends Armor {
    
    protected int DEXTERITY_INCREASE;

    public HandGear() {
        super();
    }

    public int get_dexterity_increase() {
        return DEXTERITY_INCREASE;
    }
}
