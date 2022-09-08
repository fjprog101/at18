package jalau.at18.katas.pokerhands.mauricio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FourOfAKindIdentifierTest {
    @Test
    public void shouldIdentifyFourOfAKind() {
        FourOfAKindIdentifier identifier = new FourOfAKindIdentifier(CardValue.TWO, CardValue.SIX);

        PokerHand fourOfAKindHand= new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(fourOfAKindHand));
    }
    @Test
    public void shouldNotIdentifyFourOfAKind() {
        PokerHand notFourOfAKind = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SEVEN, 'C'),
        });
        FourOfAKindIdentifier identifier = new FourOfAKindIdentifier(CardValue.TWO, CardValue.FOUR);
        assertFalse(identifier.identify(notFourOfAKind));
    }
}
