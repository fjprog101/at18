package jalau.at18.katas.pokerhands.joseg;

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
    public void shouldSayIfAnotherCardHasTheSameValue() {
        Card jackHearts1 = new Card(CardValue.JACK, 'H');
        Card jackHearts2 = new Card(CardValue.JACK, 'H');
        assertTrue(jackHearts1.hasSameValueAs(jackHearts2));

        Card aceSpades = new Card(CardValue.ACE, 'S');
        Card aceHearts = new Card(CardValue.ACE, 'H');
        assertTrue(aceSpades.hasSameValueAs(aceHearts));

        Card fiveDiamonds = new Card(CardValue.FIVE, 'D');
        Card fiveClubs = new Card(CardValue.FIVE, 'C');
        assertTrue(fiveDiamonds.hasSameValueAs(fiveClubs));
    }

    @Test
    public void shouldSayIfAnotherCardDoesNotHaveTheSameValue() {
        Card jackHearts = new Card(CardValue.JACK, 'H');
        Card twoHearts = new Card(CardValue.TWO, 'H');
        assertFalse(jackHearts.hasSameValueAs(twoHearts));
    }
}
