package src.item;

public abstract class Chestplate extends Armor {
    
    protected int STRENGTH_INCREASE;
    protected int HEALTH_INCREASE;

    public Chestplate() {
        super();
    }

    public int get_strength_increase() {
        return STRENGTH_INCREASE;
    }

    public int get_health_increase() {
        return HEALTH_INCREASE;
    }
}
