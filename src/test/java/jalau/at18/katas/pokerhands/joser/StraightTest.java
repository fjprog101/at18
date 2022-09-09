package jalau.at18.katas.pokerhands.joser;
import static org.junit.Assert.*;
import org.junit.Test;

public class StraightTest {
    @Test
    public void testIdentify() {
        Straight identifier = new Straight();

        PokerHand test1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(test1));

        PokerHand test2 = new PokerHand(new Card[]{
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(test2));

        PokerHand test3 = new PokerHand(new Card[]{
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SEVEN, 'S'),
            new Card(CardValue.EIGHT, 'H'),
            new Card(CardValue.NINE, 'D'),
            new Card(CardValue.TEN, 'C'),
        });
        assertTrue(identifier.identify(test3));
    }
}
