package jalau.at18.katas.pokerhands.daniela;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StraightTest {
    @Test
    public void shouldIdentifyStraightHand() {
        Straightidentify identifier = new Straightidentify();

        PokerHand StraightHand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.THREE, 'C'),
                new Card(CardValue.FOUR, 'S'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.SIX, 'D'),
        });
        assertTrue(identifier.identify(StraightHand));
    }

    @Test
    public void shouldIdentifyFalseStraighthHand() {
        Straightidentify identifier = new Straightidentify();

        PokerHand NoStraightHand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.THREE, 'D'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.NINE, 'S'),
        });
        assertFalse(identifier.identify(NoStraightHand));
    }
}
