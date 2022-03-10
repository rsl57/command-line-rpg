package src.item;

public abstract class Armor extends Item {
    
    public Armor() {
        EQUIPABLE = true;
        CONSUMABLE = false;
        MAX_STACK = 1;
    }
}
