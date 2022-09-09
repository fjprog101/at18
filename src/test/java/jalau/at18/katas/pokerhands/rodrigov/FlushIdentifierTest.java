package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class FlushIdentifierTest {
    @Test
    public void shouldSayIfTheHandIsFlush(){
        FlushIdenfier flushIdenfier = new FlushIdenfier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'D'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SEVEN, 'D'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.QUEEN, 'D'),
        });
        assertTrue(flushIdenfier.identify(hand));
    }

    @Test
    public void shouldSayIfTheHandIsNotFlush(){
        FlushIdenfier flushIdenfier = new FlushIdenfier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'D'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.SEVEN, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.QUEEN, 'S'),
        });
        assertFalse(flushIdenfier.identify(hand));
    }
}
