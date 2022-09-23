package jalau.at18.architects.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DeckTest {
    @Test
    public void getAnyCard() {
        Deck deck = new Deck();
        assertNotNull(deck.getRamdomCard());
    }
}
