package jalau.at18.katas.pokerhands.mauricio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PairIdentifierTest {
    @Test
    public void shouldIdentifyPair() {
        PairIdentifier identifier = new PairIdentifier(CardValue.TWO, CardValue.SIX);

        PokerHand pair= new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(pair));
    }
    @Test
    public void shouldNotIdentifyPair() {
        PairIdentifier identifier = new PairIdentifier(CardValue.TWO, CardValue.SIX);

        PokerHand notPair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(notPair));
    }
}
