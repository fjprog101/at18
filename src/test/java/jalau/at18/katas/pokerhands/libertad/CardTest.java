package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CardTest {

    @Test
    public void shouldHaveSuitAndValue() {
        Card card = new Card(CardValue.TWO, 'C');
        assertEquals(CardValue.TWO, card.getValue());
        assertEquals('C', card.getSuit());

        Card jackOfHearts = new Card(CardValue.JACK, 'H');
        assertEquals(CardValue.JACK, jackOfHearts.getValue());
        assertEquals('H', jackOfHearts.getSuit());
    }

    @Test
    public void shouldEquals() {
        Card card = new Card(CardValue.TWO, 'C');
        assertTrue(card.equals(new Card(CardValue.TWO, 'C')));
    }

    @Test
    public void shouldNotEquals() {
        Card card = new Card(CardValue.TWO, 'C');
        assertFalse(card.equals(new Card(CardValue.THREE, 'C')));
        assertFalse(card.equals(new Card(CardValue.TWO, 'D')));
        assertFalse(card.equals(new Card(CardValue.FOUR, 'S')));
    }
}
