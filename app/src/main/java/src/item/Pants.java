package src.item;

public abstract class Pants extends Armor {
    
    protected int AGILITY_INCREASE;
    protected int HEALTH_INCREASE;

    public Pants() {
        super();
    }

    public int get_agility_increase() {
        return AGILITY_INCREASE;
    }

    public int get_health_increase() {
        return HEALTH_INCREASE;
    }
}
