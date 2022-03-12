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

    public int check_quantity() {
        return quantity;
    }

    public void trash(int quantity) {
        if(this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            this.quantity = 0;
        }
    }

    public void add_quantity(int quantity) {
        if(this.quantity + quantity <= MAX_STACK) {
            this.quantity += quantity;
        } else {
            this.quantity = MAX_STACK;
        }
    }
}
