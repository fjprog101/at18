package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoPairsTest {
    @Test
    public void shouldVerifyIfThereAreTwoPairs() {
        PokerHandAnalizer analizer = new PokerHandAnalizer();
        TwoPairs twoPairs = new TwoPairs();
        PokerHand handWith2Pairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(analizer.analize(handWith2Pairs, twoPairs));

        TwoPairs onePair = new TwoPairs();
        PokerHand handWith1Pair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SEVEN, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertFalse(analizer.analize(handWith1Pair, onePair));

        TwoPairs noPair = new TwoPairs();
        PokerHand handWith0Pair = new PokerHand(new Card[]{
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SEVEN, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertFalse(analizer.analize(handWith0Pair, noPair));
    }
}
