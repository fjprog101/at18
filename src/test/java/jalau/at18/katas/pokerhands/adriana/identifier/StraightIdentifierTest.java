package jalau.at18.katas.pokerhands.adriana.identifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.katas.pokerhands.adriana.*;

public class StraightIdentifierTest {

    @Test
    public void shouldIdentifyStraightHand() {
        StraightIdentifier identifier = new StraightIdentifier();

        PokerHand straightHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(straightHand));

        PokerHand straightFlushHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(straightFlushHand));

        PokerHand noStraightHand = new PokerHand("White", new Card[]{
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SEVEN, 'C'),
        });
        assertFalse(identifier.identify(noStraightHand));
    }
}

