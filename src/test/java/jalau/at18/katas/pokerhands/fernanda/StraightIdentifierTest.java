package jalau.at18.katas.pokerhands.fernanda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StraightIdentifierTest {
    
    @Test
    public void shouldIdentifyStraight() {
        StraightIdentifier identifystraight = new StraightIdentifier();
        PokerHand handCase1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(identifystraight.identify(handCase1));
        PokerHand handCase2 = new PokerHand(new Card[]{
            new Card(CardValue.NINE, 'C'),
            new Card(CardValue.TEN, 'D'),
            new Card(CardValue.JACK, 'H'),
            new Card(CardValue.QUEEN, 'S'),
            new Card(CardValue.KING, 'S'),
        });
        assertTrue(identifystraight.identify(handCase2));

        PokerHand handWithoutStraight = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertFalse(identifystraight.identify(handWithoutStraight));

    }
    @Test
    public void testGetTypeofHand() {
        int expected = 4;
        assertEquals(expected,RankHand.STRAIGHT.getPoint() );
        StraightIdentifier straight = new StraightIdentifier();
        assertEquals(RankHand.STRAIGHT, straight.getTypeofHand());
    }
}
