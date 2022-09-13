package jalau.at18.kingoftokyo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CompletCardTest {
    @Test
    public void shouldHaveACardName() {
        CompleteCard card = new CompleteCard(DiscardCards.ENERGIZE);
        assertNotNull(card.getName());
    }

    @Test
    public void shouldHaveADescription() {
        CompleteCard card = new CompleteCard(DiscardCards.ENERGIZE);
        assertNotNull(card.setDescription());
    }
}
