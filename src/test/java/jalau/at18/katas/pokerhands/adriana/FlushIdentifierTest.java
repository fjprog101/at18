package jalau.at18.katas.pokerhands.adriana;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FlushIdentifierTest {
    
    @Test
    public void shouldIdentifyFlushHand() {
        FlushIdentifier identifier = new FlushIdentifier();

        PokerHand straightFlushHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(straightFlushHand));

        PokerHand FlushHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SEVEN, 'C'),
        });
        assertTrue(identifier.identify(FlushHand));

        PokerHand straightHand = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SEVEN, 'C'),
        });
        assertFalse(identifier.identify(straightHand));
    }
}
