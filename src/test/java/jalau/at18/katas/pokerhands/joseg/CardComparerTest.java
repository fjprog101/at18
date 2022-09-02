package jalau.at18.katas.pokerhands.joseg;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CardComparerTest {

    @Test
    public void shouldSayIfTwoCardsHaveSameValue() {
        CardComparer comparer = new CardComparer();

        Card twoSpades = new Card(CardValue.TWO, 'S');
        Card twoHearts = new Card(CardValue.TWO, 'H');
        assertTrue(comparer.haveSameValue(twoSpades, twoHearts));

        Card jackHearts1 = new Card(CardValue.JACK, 'H');
        Card jackHearts2 = new Card(CardValue.JACK, 'H');
        assertTrue(comparer.haveSameValue(jackHearts1, jackHearts2));

        Card aceSpades = new Card(CardValue.ACE, 'S');
        Card aceHearts = new Card(CardValue.ACE, 'H');
        assertTrue(comparer.haveSameValue(aceSpades, aceHearts));

        Card fiveDiamonds = new Card(CardValue.FIVE, 'D');
        Card fiveClubs = new Card(CardValue.FIVE, 'C');
        assertTrue(comparer.haveSameValue(fiveDiamonds, fiveClubs));
    }

    @Test
    public void shouldSayIfTwoCardsDoNotHaveSameValue() {
        CardComparer comparer = new CardComparer();

        Card twoSpades = new Card(CardValue.TWO, 'S');
        Card jackHearts = new Card(CardValue.JACK, 'H');
        assertFalse(comparer.haveSameValue(twoSpades, jackHearts));

        Card twoHearts = new Card(CardValue.TWO, 'H');
        assertFalse(comparer.haveSameValue(jackHearts, twoHearts));
    }
}
