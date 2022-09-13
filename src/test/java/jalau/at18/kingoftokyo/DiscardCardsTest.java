package jalau.at18.kingoftokyo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DiscardCardsTest {

    @Test
    public void cardShouldHaveAEffect() {
        assertEquals(3, DiscardCards.ENERGIZE.getEffect().length);
    }
    @Test
    public void cardShouldHaveACost() {
        assertNotNull(DiscardCards.ENERGIZE.getCost());
    }
}