package jalau.at18.katas.pokerhands.joseg;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PokerHandAnalizerTest {

    @Test
    public void shouldSayIfHandNCardsWithSameValue() {
        PokerHandAnalizer analizer = new PokerHandAnalizer();

        PokerHand handWith2CardsWithSameValue = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(analizer.hasCardsWithSameValue(handWith2CardsWithSameValue, 2));

        PokerHand handWith3CardsWithSameValue = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(analizer.hasCardsWithSameValue(handWith3CardsWithSameValue, 3));

        PokerHand handWith4CardsWithSameValue = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.JACK, 'H'),
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.JACK, 'S'),
        });
        assertTrue(analizer.hasCardsWithSameValue(handWith4CardsWithSameValue, 4));

        assertFalse(analizer.hasCardsWithSameValue(handWith2CardsWithSameValue, 3));
        assertFalse(analizer.hasCardsWithSameValue(handWith3CardsWithSameValue, 4));
        assertFalse(analizer.hasCardsWithSameValue(handWith4CardsWithSameValue, 2));
    }

    @Test
    public void shouldSayIfHandHasConsecutiveValues() {
        PokerHandAnalizer analizer = new PokerHandAnalizer();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(analizer.hasConsecutiveValues(hand));
    }

    @Test
    public void shouldSayIfHandHasAllCardsWithSameSuit() {
        PokerHandAnalizer analizer = new PokerHandAnalizer();
        PokerHand allSameSuitHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(analizer.hasAllCardsSameSuit(allSameSuitHand));

        PokerHand notAllSameSuitHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(analizer.hasAllCardsSameSuit(notAllSameSuitHand));
    }
}
