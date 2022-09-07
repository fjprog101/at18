package jalau.at18.katas.pokerhands.sarai;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class ThreePairsTest {
    @Test
    public void ThreePairs() {
        ThreePairs  PairsHandThree = new ThreePairs();
        PokerHand ThreePairshand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertTrue(PairsHandThree.match(ThreePairshand));

        PokerHand ThreePairs2 = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'H'),
        });
        assertTrue(PairsHandThree.match(ThreePairs2));
    }

    @Test
    public void ThreePairsFalse() {
        ThreePairs  PairsHandThree = new ThreePairs();
        PokerHand ThreePairshand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertFalse(PairsHandThree.match(ThreePairshand));

        PokerHand ThreePairs2 = new PokerHand(new Card[] {
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'H'),
        });
        assertFalse(PairsHandThree.match(ThreePairs2));

    }

}
