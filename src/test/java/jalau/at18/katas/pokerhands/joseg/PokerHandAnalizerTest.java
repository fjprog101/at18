package jalau.at18.katas.pokerhands.joseg;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PokerHandAnalizerTest {

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
