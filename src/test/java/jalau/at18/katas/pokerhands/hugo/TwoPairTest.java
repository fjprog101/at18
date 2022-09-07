package jalau.at18.katas.pokerhands.hugo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoPairTest {
    @Test
    public void shouldVerifyThereAreTwoPairs() {
        PokerHandAnalizer checker = new PokerHandAnalizer();

        TwoPair twoPairs = new TwoPair();
        PokerHand handWithTwoPairs = new PokerHand(new Card[]{
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SEVEN, 'S'),
        });
        assertTrue(checker.analize(handWithTwoPairs, twoPairs));

        TwoPair onePair = new TwoPair();
        PokerHand handWithOnePair = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.EIGHT, 'S'),
        });
        assertFalse(checker.analize(handWithOnePair, onePair));
    }
}