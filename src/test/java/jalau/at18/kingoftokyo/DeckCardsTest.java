package jalau.at18.kingoftokyo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DeckCardsTest {

    @Test
    public void deskShouldHaveCards() {
        DeckCards deskCards = new DeckCards();
        assertEquals(11, deskCards.getDesk().size());

    }

    @Test
    public void deskShouldReturnARandomCard() {
        DeckCards deskCards = new DeckCards();
        assertNotNull(deskCards.getRandomCard());

    }
}