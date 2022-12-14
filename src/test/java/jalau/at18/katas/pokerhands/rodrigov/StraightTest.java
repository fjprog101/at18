package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StraightTest {
    @Test
    public void shouldSayIfTheHandIsStraight(){
        StraightIdentifier straightIdentifier = new StraightIdentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.SIX, 'D'),
        });
        assertTrue(straightIdentifier.identify(hand));
    }

    @Test
    public void shouldSayIfTheHandIsNotStraight(){
        StraightIdentifier straightIdentifier = new StraightIdentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.SIX, 'D'),
        });
        assertFalse(straightIdentifier.identify(hand));
    }

    @Test
    public void shouldReturnTwoPairsRank(){
        StraightIdentifier straightIdentifier = new StraightIdentifier();
        assertEquals("STRAIGHT", straightIdentifier.identifyRank().toString());
    }
}
