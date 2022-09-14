package jalau.at18.kingoftokyo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CompleteCardTest {
    @Test
    public void shouldHaveACardName() {
        CompleteCard card = new CompleteCard(DiscardCards.ENERGIZE);
        assertNotNull(card.getName());
    }

    @Test
    public void shouldHaveADescription() {
        CompleteCard card = new CompleteCard(DiscardCards.ENERGIZE);
        assertNotNull(card.getDescription());
    }
}
