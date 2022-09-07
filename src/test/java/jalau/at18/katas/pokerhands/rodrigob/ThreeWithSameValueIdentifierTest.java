package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThreeWithSameValueIdentifierTest {

    @Test
    public void shouldVerifyIfThereAreThreeCardsWithTheSameValue() {
        ThreeWithSameValueIdentifier identifier = new ThreeWithSameValueIdentifier();
        PokerHand threeCardsWithSameValue = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(threeCardsWithSameValue));

        PokerHand fourCardsWithSameValue = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(fourCardsWithSameValue));
    }
}
