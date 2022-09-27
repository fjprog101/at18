package jalau.at18.kingoftokyo.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.kingoftokyo.model.DiscardCards;

public class DiscardCardsTest {

    @Test
    public void cardShouldHaveAEffects() {
        assertEquals(4, DiscardCards.ENERGIZE.getEffect().length);
    }

    @Test
    public void cardShouldReturnTheEffects() {
        int[] expected = {0, 0, 0, 9};
        assertArrayEquals(expected, DiscardCards.ENERGIZE.getEffect());
    }

    @Test
    public void cardShouldHaveACost() {
        assertEquals(8, DiscardCards.ENERGIZE.getCost());
    }
}