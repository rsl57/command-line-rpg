package src.item.armor.helmet;

import src.item.armor.Armor;

public abstract class Helmet extends Armor {

    protected int INTELLIGENCE_INCREASE;
    protected int HEALTH_INCREASE;

    public Helmet() {
        super();
    }

    public int get_intelligence_increase() {
        return INTELLIGENCE_INCREASE;
    }

    public int get_health_increase() {
        return HEALTH_INCREASE;
    }
}
