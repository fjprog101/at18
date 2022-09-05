package jalau.at18.katas.pokerhands.maria;

import jalau.at18.katas.pokerhands.joseg.Card;
import jalau.at18.katas.pokerhands.joseg.CardComparer;
import jalau.at18.katas.pokerhands.joseg.CardValue;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CardComparerTest {

    @Test
    public void shouldSayIfTwoCardsHaveSameValue() {
        jalau.at18.katas.pokerhands.joseg.CardComparer comparer = new jalau.at18.katas.pokerhands.joseg.CardComparer();

        jalau.at18.katas.pokerhands.joseg.Card twoSpades = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'S');
        jalau.at18.katas.pokerhands.joseg.Card twoHearts = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'H');
        assertTrue(comparer.haveSameValue(twoSpades, twoHearts));

        jalau.at18.katas.pokerhands.joseg.Card jackHearts1 = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.JACK, 'H');
        jalau.at18.katas.pokerhands.joseg.Card jackHearts2 = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.JACK, 'H');
        assertTrue(comparer.haveSameValue(jackHearts1, jackHearts2));

        jalau.at18.katas.pokerhands.joseg.Card aceSpades = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.ACE, 'S');
        jalau.at18.katas.pokerhands.joseg.Card aceHearts = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.ACE, 'H');
        assertTrue(comparer.haveSameValue(aceSpades, aceHearts));

        jalau.at18.katas.pokerhands.joseg.Card fiveDiamonds = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE, 'D');
        jalau.at18.katas.pokerhands.joseg.Card fiveClubs = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE, 'C');
        assertTrue(comparer.haveSameValue(fiveDiamonds, fiveClubs));
    }

    @Test
    public void shouldSayIfTwoCardsDoNotHaveSameValue() {
        jalau.at18.katas.pokerhands.joseg.CardComparer comparer = new jalau.at18.katas.pokerhands.joseg.CardComparer();

        jalau.at18.katas.pokerhands.joseg.Card twoSpades = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'S');
        jalau.at18.katas.pokerhands.joseg.Card jackHearts = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.JACK, 'H');
        assertFalse(comparer.haveSameValue(twoSpades, jackHearts));

        jalau.at18.katas.pokerhands.joseg.Card twoHearts = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'H');
        assertFalse(comparer.haveSameValue(jackHearts, twoHearts));
    }

    @Test
    public void shouldSayIfTwoCardsHaveSameSuit() {
        jalau.at18.katas.pokerhands.joseg.CardComparer comparer = new jalau.at18.katas.pokerhands.joseg.CardComparer();

        jalau.at18.katas.pokerhands.joseg.Card twoSpades = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'S');
        jalau.at18.katas.pokerhands.joseg.Card threeSpades = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.THREE, 'S');
        jalau.at18.katas.pokerhands.joseg.Card jackHearts = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.JACK, 'H');
        jalau.at18.katas.pokerhands.joseg.Card aceHearts = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.ACE, 'H');

        assertTrue(comparer.haveSameSuit(twoSpades, threeSpades));
        assertTrue(comparer.haveSameSuit(jackHearts, aceHearts));

        assertFalse(comparer.haveSameSuit(threeSpades, jackHearts));
        assertFalse(comparer.haveSameSuit(twoSpades, aceHearts));
    }

    @Test
    public void shouldSayIfRightCardIsConsecutiveToLeftCard() {
        jalau.at18.katas.pokerhands.joseg.CardComparer comparer = new CardComparer();
        jalau.at18.katas.pokerhands.joseg.Card twoSpades = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'S');
        jalau.at18.katas.pokerhands.joseg.Card threeSpades = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.THREE, 'S');
        jalau.at18.katas.pokerhands.joseg.Card fourDiamonds = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FOUR, 'D');
        jalau.at18.katas.pokerhands.joseg.Card jackHearts = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.JACK, 'H');
        jalau.at18.katas.pokerhands.joseg.Card queenClubs = new Card(CardValue.QUEEN, 'C');

        assertTrue(comparer.areConsecutive(twoSpades, threeSpades));
        assertTrue(comparer.areConsecutive(threeSpades, fourDiamonds));
        assertTrue(comparer.areConsecutive(jackHearts, queenClubs));

        assertFalse(comparer.areConsecutive(threeSpades, threeSpades));
        assertFalse(comparer.areConsecutive(threeSpades, jackHearts));
        assertFalse(comparer.areConsecutive(twoSpades, queenClubs));
    }
}
