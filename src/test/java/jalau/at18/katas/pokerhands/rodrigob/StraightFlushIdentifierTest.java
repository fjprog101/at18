package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class StraightFlushIdentifierTest {

    @Test
    public void shouldIdentifyStraightFlushHand() {
        StraightFlushIdentifier identifier = new StraightFlushIdentifier();

        PokerHand straightFlushHand = new PokerHand(Arrays.asList(
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SEVEN, 'C'),
            new Card(CardValue.EIGHT, 'C')
        ));
        assertTrue(identifier.identify(straightFlushHand));
        assertEquals(8, identifier.getCardRankedValue(straightFlushHand));


        PokerHand noConsecutiveValues = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SEVEN, 'C')
        ));

        assertFalse(identifier.identify(noConsecutiveValues));
        PokerHand noSameSuite = new PokerHand(Arrays.asList(
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SEVEN, 'C')
        ));
        assertFalse(identifier.identify(noSameSuite));
    }
}
