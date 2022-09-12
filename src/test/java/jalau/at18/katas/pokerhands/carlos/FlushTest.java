package jalau.at18.katas.pokerhands.carlos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FlushTest {
    @Test
    public void shouldIdentifyFlush() {
        FlushIdentifier identifier = new FlushIdentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SEVEN, 'H'),
        });
        assertTrue(identifier.match(hand));       
    }

    @Test
    public void shouldNotIdentifyFlush() {
        FlushIdentifier identifier = new FlushIdentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'H'),
        });
        assertFalse(identifier.match(hand));       
    }
}
