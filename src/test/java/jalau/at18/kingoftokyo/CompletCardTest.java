package jalau.at18.kingoftokyo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class CompletCardTest {
    @Test
    public void shouldHaveACardName() {
        CompleteCard card = new CompleteCard(DiscardCards.ENERGIZER);
        assertNotNull(card.getName());
    }

}
