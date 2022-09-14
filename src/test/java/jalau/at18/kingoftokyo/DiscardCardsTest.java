package jalau.at18.kingoftokyo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DiscardCardsTest {

    @Test
    public void cardShouldHaveAEffects() {
        assertEquals(3, DiscardCards.ENERGIZE.getEffect().length);
    }

    @Test
    public void cardShouldReturnTheEffects() {
        int[] expected = {0, 0, 9 };
        assertArrayEquals(expected, DiscardCards.ENERGIZE.getEffect());
    }

    @Test
    public void cardShouldHaveACost() {
        assertEquals(8, DiscardCards.ENERGIZE.getCost());
    }
}