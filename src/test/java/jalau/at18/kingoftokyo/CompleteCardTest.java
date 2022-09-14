package jalau.at18.kingoftokyo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CompleteCardTest {
    @Test
    public void shouldHaveACardName() {
        CompleteCard card = new CompleteCard(DiscardCards.ENERGIZE);
        assertEquals("ENERGIZE", card.getName());
    }

    @Test
    public void shouldHaveADescription() {
        CompleteCard card = new CompleteCard(DiscardCards.ENERGIZE);
        String expectedDescription = "LifePoints: 0, Score: 0, Energy: 9";
        assertNotNull(expectedDescription,card.getDescription());
    }
}
