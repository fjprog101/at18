package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class ThreeWithSameValueIdentifierTest {

    @Test
    public void shouldVerifyIfThereAreThreeCardsWithTheSameValue() {
        ThreeWithSameValueIdentifier identifier = new ThreeWithSameValueIdentifier();
        PokerHand threeCardsWithSameValue = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.EIGHT, 'H'),
            new Card(CardValue.SIX, 'C')
        ));
        assertTrue(identifier.identify(threeCardsWithSameValue));
        assertEquals(2, identifier.getCardRankedValue(threeCardsWithSameValue));

        PokerHand fourCardsWithSameValue = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'C')
        ));
        assertFalse(identifier.identify(fourCardsWithSameValue));
    }
}
