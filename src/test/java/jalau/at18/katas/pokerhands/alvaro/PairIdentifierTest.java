package jalau.at18.katas.pokerhands.alvaro;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PairIdentifierTest {
    @Test
    public void shouldIdentifyPairHand() {
        PairIdentifier identifier = new PairIdentifier();

        PokerHand pairHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE,'C'),
            new Card(CardValue.SEVEN,'D'),
            new Card(CardValue.SIX,'S'),
        });
        assertTrue(identifier.identify(pairHand));
        PokerHand noConsecutivePairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.NINE, 'H'),
            new Card(CardValue.THREE,'C'),
            new Card(CardValue.SEVEN,'D'),
            new Card(CardValue.TWO,'S'),
        });
        assertTrue(identifier.identify(noConsecutivePairs));
        PokerHand noPairHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.NINE, 'H'),
            new Card(CardValue.THREE,'C'),
            new Card(CardValue.SEVEN,'D'),
            new Card(CardValue.ACE,'S'),
        });
        assertFalse(identifier.identify(noPairHand));

    }
}
