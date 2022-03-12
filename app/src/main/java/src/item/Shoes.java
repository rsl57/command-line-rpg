package src.item;

public abstract class Shoes extends Armor {
    
    protected int SPEED_INCREASE;
    protected int AGILITY_INCREASE;

    public Shoes() {
        super();
    }

    public int get_speed_increase() {
        return SPEED_INCREASE;
    }

    public int get_agility_increase() {
        return AGILITY_INCREASE;
    }
}
