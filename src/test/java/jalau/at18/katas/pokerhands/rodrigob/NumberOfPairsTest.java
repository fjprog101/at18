package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumberOfPairsTest {
    @Test
    public void shouldSayIfHandHasNNumberOfPairs() {
        PokerHandAnalizer analizer = new PokerHandAnalizer();
        NumberOfPairs twoPairs = new NumberOfPairs(2);
        PokerHand handWith2Pairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(analizer.analize(handWith2Pairs, twoPairs));

        NumberOfPairs onePair = new NumberOfPairs(1);
        PokerHand handWith1Pair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SEVEN, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(analizer.analize(handWith1Pair, onePair));

        NumberOfPairs noPair = new NumberOfPairs(2);
        PokerHand handWith0Pair = new PokerHand(new Card[]{
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SEVEN, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertFalse(analizer.analize(handWith0Pair, noPair));

        assertFalse(analizer.analize(handWith2Pairs, onePair));
        assertFalse(analizer.analize(handWith1Pair, twoPairs));
    }
}
