package src.item;

public abstract class Item {

    final protected boolean EQUIPABLE;
    final protected boolean CONSUMABLE;
    final protected int MAX_STACK;
    protected int quantity;
    

    public boolean is_equipable() {
        return EQUIPABLE;
    }

    public boolean is_consumable() {
        return CONSUMABLE;
    }
}
