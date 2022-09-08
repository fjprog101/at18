package jalau.at18.katas.pokerhands.adriana.identifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.katas.pokerhands.adriana.*;

public class StraightFlushIdentifierTest {

    @Test
    public void shouldIdentifyStraightFlushHand() {
        StraightFlushIdentifier identifier = new StraightFlushIdentifier();

        PokerHand straightFlushHand = new PokerHand("White", new Card[]{
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.THREE, 'C'),
        });
        assertTrue(identifier.identify(straightFlushHand));

        PokerHand noConsecutiveValues = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SEVEN, 'C'),
        });

        assertFalse(identifier.identify(noConsecutiveValues));
        PokerHand noSameSuite = new PokerHand("White", new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SEVEN, 'C'),
        });
        assertFalse(identifier.identify(noSameSuite));
    }
}
