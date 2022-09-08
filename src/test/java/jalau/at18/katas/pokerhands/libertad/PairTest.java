package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PairTest {
    @Test
    public void identifyWhenExistPairHand() {
        PairIdentifier identifier = new PairIdentifier();

        PokerHand PairHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(PairHand));
    }
    @Test
    public void identifyWhenDontExistPairHand() {
        PairIdentifier identifier = new PairIdentifier();

        PokerHand PairHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.NINE, 'D'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(PairHand));
    }
}
