package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FourOfAKindIdentifierTest {

    @Test
    public void identifyWhenExistFourOfAKindHand() {
        FourOfAKindIdentifier identifier = new FourOfAKindIdentifier();

        PokerHand FourOfAKindHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(FourOfAKindHand));
    }
    @Test
    public void identifyWhenDontExistFourOfAKindHand() {
        FourOfAKindIdentifier identifier = new FourOfAKindIdentifier();

        PokerHand FourOfAKindHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(FourOfAKindHand));
    }
}
