package src.item;

public abstract class Item {
    
    final protected int MAX_STACK;
    protected int quantity;
    protected boolean equipable;
    protected boolean consumable;

    public boolean is_equipable() {
        return equipable;
    }

    public boolean is_consumable() {
        return consumable;
    }
}
