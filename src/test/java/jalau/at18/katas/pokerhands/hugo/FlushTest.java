package jalau.at18.katas.pokerhands.hugo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FlushTest {
   
    @Test
    public void shouldIdentifyFlushHand() {
        Flush identifier = new Flush();

        PokerHand FlushInHand = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.SEVEN, 'H'),
        });
        assertTrue(identifier.identify(FlushInHand));

        PokerHand OneNoSameSuite = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.NINE, 'C'),
            new Card(CardValue.SIX, 'H'),
        });
        assertFalse(identifier.identify(OneNoSameSuite));

        PokerHand allNoSameSuite = new PokerHand(new Card[]{
            new Card(CardValue.TEN, 'S'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.SIX, 'D'),
        });

        assertFalse(identifier.identify(allNoSameSuite));
    }
}
