package jalau.at18.katas.pokerhands.sarai;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FourofaKindTest {
    @Test
    public void fourPairs() {
        Fourofakind  PairsHandTFourTrue = new Fourofakind();
        PokerHand PairshandTrue = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertTrue(PairsHandTFourTrue.match(PairshandTrue));

        Fourofakind  PairsHandTFourTrue1 = new Fourofakind();
        PokerHand ThreePairs2 = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'H'),
        });
        assertTrue(PairsHandTFourTrue1.match(ThreePairs2));
    }

    @Test
    public void fourPairsFalse() {
        Fourofakind  PairsHandFalse1 = new Fourofakind();
        PokerHand FourPairs1 = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertFalse(PairsHandFalse1.match(FourPairs1));

        Fourofakind  PairsHandFalse2 = new Fourofakind();
        PokerHand FourPairs2 = new PokerHand(new Card[] {
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'H'),
        });
        assertFalse(PairsHandFalse2.match(FourPairs2));

    }

}
