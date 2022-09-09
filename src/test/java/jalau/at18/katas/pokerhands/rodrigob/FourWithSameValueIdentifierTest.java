package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class FourWithSameValueIdentifierTest {

    @Test
    public void shouldVerifyIfThereAreFourCardsWithTheSameValue() {
        FourWithSameValueIdentifier identifier = new FourWithSameValueIdentifier();
        PokerHand fourCardsWithSameValue = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'C')
        ));
        assertTrue(identifier.identify(fourCardsWithSameValue));
        assertEquals(2, identifier.getCardRankedValue(fourCardsWithSameValue));

        PokerHand threeCardsWithSameValue = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SEVEN, 'C'),
            new Card(CardValue.SIX, 'C')
        ));
        assertFalse(identifier.identify(threeCardsWithSameValue));
    }
}
