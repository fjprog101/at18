package jalau.at18.katas.pokerhands.libertad;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class TwoPairIdentifierTest {
    @Test
    public void shouldIdentifyTwoPair() {
        StraightFlushIdentifier identifier = new StraightFlushIdentifier();

        PokerHand TwoPairHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(TwoPairHand));

        PokerHand noConsecutiveValues = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'H'),
        });

        assertFalse(identifier.identify(noConsecutiveValues));
        PokerHand sameSuite = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SEVEN, 'C'),
        });
        assertTrue(identifier.identify(sameSuite));
    }
}
