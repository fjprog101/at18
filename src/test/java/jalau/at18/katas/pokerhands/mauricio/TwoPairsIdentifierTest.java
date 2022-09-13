package jalau.at18.katas.pokerhands.mauricio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TwoPairsIdentifierTest {
    @Test
    public void shouldIdentifyTwoPairs() {
        TwoPairsIdentifier identifier = new TwoPairsIdentifier(CardValue.TWO, CardValue.SIX);;

        PokerHand twoPairs= new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'D'),
        });
        assertTrue(identifier.identify(twoPairs));
    }
    @Test
    public void shouldNotIdentifyTwoPairs() {
        TwoPairsIdentifier identifier = new TwoPairsIdentifier(CardValue.TWO, CardValue.SIX);

        PokerHand notTwoPairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(notTwoPairs));
    }
}
