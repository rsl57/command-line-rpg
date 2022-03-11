package src.item;

public abstract class Weapon extends Item {

    public Weapon() {
        EQUIPABLE = true;
        CONSUMABLE = false;
        MAX_STACK = 1;
    }
}
