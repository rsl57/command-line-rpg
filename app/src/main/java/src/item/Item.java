package src.item;

public abstract class Item {

    protected boolean EQUIPABLE;
    protected boolean CONSUMABLE;
    protected int MAX_STACK;
    protected int quantity;
    

    public boolean is_equipable() {
        return EQUIPABLE;
    }

    public boolean is_consumable() {
        return CONSUMABLE;
    }
}
