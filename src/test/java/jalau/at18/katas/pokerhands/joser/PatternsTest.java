package jalau.at18.katas.pokerhands.joser;

import org.junit.Test;
import static org.junit.Assert.*;

public class PatternsTest {
    @Test
    public void testGetidentifyPatterns() {

    }

    @Test
    public void testToIdentifyPatternHand() {
        Patterns intify_Pattern = new Patterns();
        PokerHand hand1 = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        PokerHand hand2 = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        int resultHand1;
        int resultHand2;

        resultHand1 = intify_Pattern.whatPatternIs(hand1);
        resultHand2 = intify_Pattern.whatPatternIs(hand2);
        // assertTrue(intify_Pattern.whatPatternIs(TwoPairshand));
        // assertEquals(3, 5);
        assertTrue(resultHand1 < resultHand2);
    }
}
