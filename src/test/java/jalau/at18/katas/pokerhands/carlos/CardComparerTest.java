package jalau.at18.katas.pokerhands.carlos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.katas.pokerhands.carlos.Card;
import jalau.at18.katas.pokerhands.carlos.CardComparer;
import jalau.at18.katas.pokerhands.carlos.CardValue;

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

    @Test
    public void shouldSayIfTwoCardsHaveSameSuit() {
        CardComparer comparer = new CardComparer();

        Card twoSpades = new Card(CardValue.TWO, 'S');
        Card threeSpades = new Card(CardValue.THREE, 'S');
        Card jackHearts = new Card(CardValue.JACK, 'H');
        Card aceHearts = new Card(CardValue.ACE, 'H');

        assertTrue(comparer.haveSameSuit(twoSpades, threeSpades));
        assertTrue(comparer.haveSameSuit(jackHearts, aceHearts));

        assertFalse(comparer.haveSameSuit(threeSpades, jackHearts));
        assertFalse(comparer.haveSameSuit(twoSpades, aceHearts));
    }

    @Test
    public void shouldSayIfRightCardIsConsecutiveToLeftCard() {
        CardComparer comparer = new CardComparer();
        Card twoSpades = new Card(CardValue.TWO, 'S');
        Card threeSpades = new Card(CardValue.THREE, 'S');
        Card fourDiamonds = new Card(CardValue.FOUR, 'D');
        Card jackHearts = new Card(CardValue.JACK, 'H');
        Card queenClubs = new Card(CardValue.QUEEN, 'C');

        assertTrue(comparer.areConsecutive(twoSpades, threeSpades));
        assertTrue(comparer.areConsecutive(threeSpades, fourDiamonds));
        assertTrue(comparer.areConsecutive(jackHearts, queenClubs));

        assertFalse(comparer.areConsecutive(threeSpades, threeSpades));
        assertFalse(comparer.areConsecutive(threeSpades, jackHearts));
        assertFalse(comparer.areConsecutive(twoSpades, queenClubs));
    }
}
