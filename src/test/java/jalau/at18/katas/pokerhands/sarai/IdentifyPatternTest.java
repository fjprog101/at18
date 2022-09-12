package jalau.at18.katas.pokerhands.sarai;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IdentifyPatternTest {
    @Test
    public void testToIdentifyPatternHand() {
        IdentifyPattern intify_Pattern = new IdentifyPattern();
        PokerHand TwoPairshand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertEquals(4, intify_Pattern.getidentifyPatterns(TwoPairshand));
    }
}
