package src.item.armor.shoes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoeTest {

    @Test
    void testForTatteredShoes() {
        TatteredShoes shoe = new TatteredShoes();
        assertEquals(shoe.get_speed_increase(), 20);
        assertEquals(shoe.get_agility_increase(), 10);

        assertTrue(shoe.is_equipable());
        assertFalse(shoe.is_consumable());

        assertEquals(shoe.check_quantity(), 1);
        shoe.trash(1);
        assertEquals(shoe.check_quantity(), 0);
    }

    @Test
    void testForWornShoes() {
        WornShoes shoe = new WornShoes();
        assertEquals(shoe.get_speed_increase(), 30);
        assertEquals(shoe.get_agility_increase(), 20);

        assertTrue(shoe.is_equipable());
        assertFalse(shoe.is_consumable());

        assertEquals(shoe.check_quantity(), 1);
        shoe.trash(1);
        assertEquals(shoe.check_quantity(), 0);
    }

    @Test
    void testForPatchedShoes() {
        PatchedShoes shoe = new PatchedShoes();
        assertEquals(shoe.get_speed_increase(), 45);
        assertEquals(shoe.get_agility_increase(), 35);

        assertTrue(shoe.is_equipable());
        assertFalse(shoe.is_consumable());

        assertEquals(shoe.check_quantity(), 1);
        shoe.trash(1);
        assertEquals(shoe.check_quantity(), 0);
    }

    @Test
    void testForComfortableShoes() {
        ComfortableShoes shoe = new ComfortableShoes();
        assertEquals(shoe.get_speed_increase(), 65);
        assertEquals(shoe.get_agility_increase(), 50);

        assertTrue(shoe.is_equipable());
        assertFalse(shoe.is_consumable());

        assertEquals(shoe.check_quantity(), 1);
        shoe.trash(1);
        assertEquals(shoe.check_quantity(), 0);
    }

    @Test
    void testForEnchantedShoes() {
        EnchantedShoes shoe = new EnchantedShoes();
        assertEquals(shoe.get_speed_increase(), 85);
        assertEquals(shoe.get_agility_increase(), 65);

        assertTrue(shoe.is_equipable());
        assertFalse(shoe.is_consumable());

        assertEquals(shoe.check_quantity(), 1);
        shoe.trash(1);
        assertEquals(shoe.check_quantity(), 0);
    }
}
