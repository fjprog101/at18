package jalau.at18.katas.pokerhands.maria;

import jalau.at18.katas.pokerhands.maria.Identifier.PairIdentifier;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PairIdentifierTest {
    @Test
    public void shouldIdentifyOnePair() {
        PairIdentifier identifier = new PairIdentifier();

        PokerHand pairHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.SIX, 'S'),
        });
        assertTrue(identifier.identify(pairHand));
    }
    @Test
    public void shouldNotIdentifyPair() {
        PairIdentifier identifier = new PairIdentifier();

        PokerHand pairHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.SIX, 'S'),
        });
        assertFalse(identifier.identify(pairHand));
    }
    @Test
    public void shouldNotIdentifyThreeCards() {
        PairIdentifier identifier = new PairIdentifier();

        PokerHand pairHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.SIX, 'S'),
        });
        assertFalse(identifier.identify(pairHand));
    }

}
