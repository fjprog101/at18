package jalau.at18.kingoftokyo;

import static org.junit.Assert.assertEquals;

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
        assertEquals(expectedDescription,card.getDescription());
        CompleteCard card2 = new CompleteCard(DiscardCards.COMMUTER_TRAIN);
        String expectedDescription2 = "LifePoints: 0, Score: 2, Energy: 0";
        assertEquals(expectedDescription2,card2.getDescription());
    }

    @Test
    public void shouldHaveADiscardCard() {
        CompleteCard card = new CompleteCard(DiscardCards.COMMUTER_TRAIN);
        assertEquals(DiscardCards.COMMUTER_TRAIN,card.getCard());
        assertEquals(4,card.getCard().getCost());
    }
}
