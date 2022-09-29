package jalau.at18.architects.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.architects.model.cards.Card;


public class RedCardForDeckTest {
    @Test
    public void shouldReturnRedCard() {
        RedCardForDeck redCardForDeck = new RedCardForDeck(2);
        Card redCard= redCardForDeck.getCard();
        assertEquals("Red", redCard.color());
    }
    @Test
    public void shouldReturnStatusOfConflictBar() {
        RedCardForDeck redCardForDeck = new RedCardForDeck(2);
        Card redCard = redCardForDeck.getCard();
        Card redCard1 = redCardForDeck.getCard();
        Card redCard2 = redCardForDeck.getCard();
        Card redCard3 = redCardForDeck.getCard();
        Card redCard4 = redCardForDeck.getCard();
        Card redCard5 = redCardForDeck.getCard();
        Card redCard6 = redCardForDeck.getCard();
        Card redCard7 = redCardForDeck.getCard();
        Card redCard8 = redCardForDeck.getCard();
        Card redCard9 = redCardForDeck.getCard();
        Card redCard10 = redCardForDeck.getCard();
        assertTrue(redCardForDeck.updateView());
        assertNotNull(redCardForDeck.updateWarToken());
    }
}
