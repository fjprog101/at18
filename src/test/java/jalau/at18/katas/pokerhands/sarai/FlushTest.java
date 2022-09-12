package jalau.at18.katas.pokerhands.sarai;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FlushTest {

    @Test
    public void shouldIdentifyFlushHand() {
        Flush identifier = new Flush();

        PokerHand flushHand = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.SEVEN, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(flushHand));
    }

    @Test
    public void shouldIdentifyFlushHandFlase() {
        Flush identifier = new Flush();

        PokerHand flushHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(flushHand));

    }
}
