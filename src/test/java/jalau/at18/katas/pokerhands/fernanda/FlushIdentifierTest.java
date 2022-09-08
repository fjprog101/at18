package jalau.at18.katas.pokerhands.fernanda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FlushIdentifierTest {

    @Test
    public void shouldIdentifyFlush() {
        FlushIdentifier identifyflush = new FlushIdentifier();
        PokerHand handCase1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.KING, 'C'),
        });
        assertTrue(identifyflush.identify(handCase1));
        PokerHand handCase2 = new PokerHand(new Card[]{
            new Card(CardValue.NINE, 'S'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.QUEEN, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        assertTrue(identifyflush.identify(handCase2));

        PokerHand handWithoutflush = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertFalse(identifyflush.identify(handWithoutflush));
    }
    @Test
    public void testGetTypeofHand() {
        int expected = 5;
        assertEquals(expected,RankHand.FLUSH.getPoint() );
        FlushIdentifier flush = new FlushIdentifier();
        assertEquals(RankHand.FLUSH, flush.getTypeofHand());
    }
}

