package jalau.at18.katas.pokerhands.alvaro;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FourOfAKindIdentifierTest {
    @Test
    public void shouldIdentifyFourOfAKindHand() {
        FourOfAKindIdentifier identifier = new FourOfAKindIdentifier();

        PokerHand fourOfAKindHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO,'C'),
            new Card(CardValue.TWO,'D'),
            new Card(CardValue.THREE,'S'),
        });
        assertTrue(identifier.identify(fourOfAKindHand));
        PokerHand noConsecutiveValues = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO,'C'),
            new Card(CardValue.THREE,'D'),
            new Card(CardValue.TWO,'S'),
        });
        assertTrue(identifier.identify(noConsecutiveValues));
        PokerHand noFourOfAKindHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE,'C'),
            new Card(CardValue.THREE,'D'),
            new Card(CardValue.TWO,'S'),
        });
        assertFalse(identifier.identify(noFourOfAKindHand));
    }
}
