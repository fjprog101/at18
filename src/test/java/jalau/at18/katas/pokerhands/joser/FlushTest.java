package jalau.at18.katas.pokerhands.joser;
import static org.junit.Assert.*;
import org.junit.Test;

public class FlushTest {
    @Test
    public void testIdentify() {
        Flush identifier = new Flush();

        PokerHand test1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(test1));

        PokerHand test2 = new PokerHand(new Card[]{
            new Card(CardValue.ACE, 'D'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.SEVEN, 'D'),
            new Card(CardValue.NINE, 'D'),
        });
        assertTrue(identifier.identify(test2));

        PokerHand test3 = new PokerHand(new Card[]{
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(test3));
    }
}
