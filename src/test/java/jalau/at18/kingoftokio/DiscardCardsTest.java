package jalau.at18.kingoftokio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assume.assumeNotNull;

import org.junit.Test;

import jalau.at18.kingoftokyo.DiscardCards;

public class DiscardCardsTest {

    @Test
    public void cardShouldHaveAEffect() {
        assertEquals(3, DiscardCards.ENERGIZER.getEffect().length);
    }
}