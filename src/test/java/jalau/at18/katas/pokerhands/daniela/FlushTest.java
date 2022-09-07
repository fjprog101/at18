package jalau.at18.katas.pokerhands.daniela;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FlushTest {
    @Test
    public void shouldIdentifyFlushHand() {
        Flush identifier = new Flush();

        PokerHand FlushHand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.THREE, 'C'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(FlushHand));
    }

    @Test
    public void shouldIdentifyFalseFlushHand() {
        Flush identifier = new Flush();

        PokerHand FlushHand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.THREE, 'C'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.FIVE, 'H'),
                new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(FlushHand));
    }
}
