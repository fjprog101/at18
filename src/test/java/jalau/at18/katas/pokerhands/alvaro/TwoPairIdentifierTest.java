package jalau.at18.katas.pokerhands.alvaro;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoPairIdentifierTest {
    @Test
    public void shouldIdentifyTwoPairHand() {
        TwoPairIdentifier identifier = new TwoPairIdentifier();

        PokerHand twoPairHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'C'),
        });
        assertTrue(identifier.identify(twoPairHand));
        PokerHand twoPairConsecutiveHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'C'),
        });
        assertTrue(identifier.identify(twoPairConsecutiveHand));
        PairIdentifier pairIdentifier = new PairIdentifier();
        PokerHand noTwoPairHand = new PokerHand(new Card[]{
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'C'),
        });
        assertFalse(identifier.identify(noTwoPairHand));
        assertTrue(pairIdentifier.identify(noTwoPairHand));
        PokerHand noTwoPairHand1 = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'C'),
        });
        assertFalse(identifier.identify(noTwoPairHand1));
    }

}
