package src.item.armor.pants;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PantsTest {
    
    @Test
    void testForTatteredPants() {
        TatteredPants pants = new TatteredPants();

        assertEquals(pants.get_agility_increase(), 20);
        assertEquals(pants.get_health_increase(), 10);

        assertTrue(pants.is_equipable());
        assertFalse(pants.is_consumable());
        assertFalse(pants.can_add(1));

        assertTrue(pants.is_sellable());
        assertEquals(pants.get_price(), 105);

        assertNotEquals(pants.get_scraps(2), 10);
        assertEquals(pants.get_scraps(1), 5);
        pants.add_quantity(1);

        assertEquals(pants.check_quantity(), 1);
        pants.add_quantity(1);
        assertEquals(pants.check_quantity(), 1);
        pants.trash(1);
        assertEquals(pants.check_quantity(), 0);
    }

    @Test
    void testForWornPants() {
        WornPants pants = new WornPants();

        assertEquals(pants.get_agility_increase(), 30);
        assertEquals(pants.get_health_increase(), 20);

        assertTrue(pants.is_equipable());
        assertFalse(pants.is_consumable());
        assertFalse(pants.can_add(1));

        assertTrue(pants.is_sellable());
        assertEquals(pants.get_price(), 225);

        assertNotEquals(pants.get_scraps(2), 24);
        assertEquals(pants.get_scraps(1), 12);
        pants.add_quantity(1);

        assertEquals(pants.check_quantity(), 1);
        pants.add_quantity(1);
        assertEquals(pants.check_quantity(), 1);
        pants.trash(1);
        assertEquals(pants.check_quantity(), 0);
    }

    @Test
    void testForPatchedPants() {
        PatchedPants pants = new PatchedPants();

        assertEquals(pants.get_agility_increase(), 45);
        assertEquals(pants.get_health_increase(), 35);

        assertTrue(pants.is_equipable());
        assertFalse(pants.is_consumable());
        assertFalse(pants.can_add(1));

        assertTrue(pants.is_sellable());
        assertEquals(pants.get_price(), 550);

        assertNotEquals(pants.get_scraps(2), 50);
        assertEquals(pants.get_scraps(1), 25);
        pants.add_quantity(1);

        assertEquals(pants.check_quantity(), 1);
        pants.add_quantity(1);
        assertEquals(pants.check_quantity(), 1);
        pants.trash(1);
        assertEquals(pants.check_quantity(), 0);
    }

    @Test
    void testForComfortablePants() {
        ComfortablePants pants = new ComfortablePants();

        assertEquals(pants.get_agility_increase(), 65);
        assertEquals(pants.get_health_increase(), 50);

        assertTrue(pants.is_equipable());
        assertFalse(pants.is_consumable());
        assertFalse(pants.can_add(1));

        assertTrue(pants.is_sellable());
        assertEquals(pants.get_price(), 1400);

        assertNotEquals(pants.get_scraps(2), 100);
        assertEquals(pants.get_scraps(1), 50);
        pants.add_quantity(1);

        assertEquals(pants.check_quantity(), 1);
        pants.add_quantity(1);
        assertEquals(pants.check_quantity(), 1);
        pants.trash(1);
        assertEquals(pants.check_quantity(), 0);
    }

    @Test
    void testForEnchantedPants() {
        EnchantedPants pants = new EnchantedPants();

        assertEquals(pants.get_agility_increase(), 85);
        assertEquals(pants.get_health_increase(), 65);

        assertTrue(pants.is_equipable());
        assertFalse(pants.is_consumable());
        assertFalse(pants.can_add(1));

        assertTrue(pants.is_sellable());
        assertEquals(pants.get_price(), 3400);

        assertNotEquals(pants.get_scraps(2), 200);
        assertEquals(pants.get_scraps(1), 100);
        pants.add_quantity(1);

        assertEquals(pants.check_quantity(), 1);
        pants.add_quantity(1);
        assertEquals(pants.check_quantity(), 1);
        pants.trash(1);
        assertEquals(pants.check_quantity(), 0);
    }
}
