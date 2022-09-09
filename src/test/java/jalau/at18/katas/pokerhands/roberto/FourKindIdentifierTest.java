package jalau.at18.katas.pokerhands.roberto;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FourKindIdentifierTest {
    @Test
    public void shouldIdentifyFourOfKindHand() {
        FourKindIdentifier identifier = new FourKindIdentifier();

        PokerHand fourKindHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.TWO, 'S'),
                new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(fourKindHand));

        PokerHand noFourKindValues = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.SEVEN, 'C'),
        });

        assertFalse(identifier.identify(noFourKindValues));
    }
}
