package src.item.spare_parts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArmorScrapsTest {
    
    @Test
    void testForChestplatePieces() {
        ChestplatePieces scraps = new ChestplatePieces();

        assertFalse(scraps.is_equipable());
        assertFalse(scraps.is_consumable());

        assertTrue(scraps.is_sellable());
        assertEquals(scraps.get_price(), 25);

        assertEquals(scraps.check_quantity(), 0);
        scraps.add_quantity(64);
        assertEquals(scraps.check_quantity(), 64);
        scraps.add_quantity(190);
        assertEquals(scraps.check_quantity(), 64);
    }

    @Test
    void testForHandgearScraps() {
        HandgearScraps scraps = new HandgearScraps();

        assertFalse(scraps.is_equipable());
        assertFalse(scraps.is_consumable());

        assertTrue(scraps.is_sellable());
        assertEquals(scraps.get_price(), 10);

        assertEquals(scraps.check_quantity(), 0);
        scraps.add_quantity(64);
        assertEquals(scraps.check_quantity(), 64);
        scraps.add_quantity(190);
        assertEquals(scraps.check_quantity(), 64);
    }

    @Test
    void testForHelmetPieces() {
        HelmetPieces scraps = new HelmetPieces();

        assertFalse(scraps.is_equipable());
        assertFalse(scraps.is_consumable());

        assertTrue(scraps.is_sellable());
        assertEquals(scraps.get_price(), 20);

        assertEquals(scraps.check_quantity(), 0);
        scraps.add_quantity(64);
        assertEquals(scraps.check_quantity(), 64);
        scraps.add_quantity(190);
        assertEquals(scraps.check_quantity(), 64);
    }

    @Test
    void testForPantScraps() {
        PantScraps scraps = new PantScraps();

        assertFalse(scraps.is_equipable());
        assertFalse(scraps.is_consumable());

        assertTrue(scraps.is_sellable());
        assertEquals(scraps.get_price(), 20);

        assertEquals(scraps.check_quantity(), 0);
        scraps.add_quantity(64);
        assertEquals(scraps.check_quantity(), 64);
        scraps.add_quantity(190);
        assertEquals(scraps.check_quantity(), 64);
    }

    @Test
    void testForShoeScraps() {
        ShoeScraps scraps = new ShoeScraps();

        assertFalse(scraps.is_equipable());
        assertFalse(scraps.is_consumable());

        assertTrue(scraps.is_sellable());
        assertEquals(scraps.get_price(), 15);

        assertEquals(scraps.check_quantity(), 0);
        scraps.add_quantity(64);
        assertEquals(scraps.check_quantity(), 64);
        scraps.add_quantity(190);
        assertEquals(scraps.check_quantity(), 64);
    }
}
