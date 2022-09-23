package jalau.at18.kingoftokyo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DeckCardsTest {

    @Test
    public void deskShouldHaveCards() {
        DeckCards cardsDeck = new DeckCards();
        assertEquals(11, cardsDeck.getDeck().size());
    }

    @Test
    public void deskShouldReturnARandomCard() {
        DeckCards cardsDeck = new DeckCards();
        assertNotNull(cardsDeck.getRandomCard());
    }

    @Test
    public void deskRemoveACardOfDeck() {
        DeckCards cardsDeck = new DeckCards();
        assertEquals(11, cardsDeck.getDeck().size());
        cardsDeck.removeCard(new CompleteCard(DiscardCards.ENERGIZE));
        assertEquals(10, cardsDeck.getDeck().size());
        cardsDeck.removeCard(new CompleteCard(DiscardCards.ENERGIZE));
        assertEquals(10, cardsDeck.getDeck().size());
        cardsDeck.removeCard(new CompleteCard(DiscardCards.APARTMENT_BULIDING));
        assertEquals(9, cardsDeck.getDeck().size());
    }
}