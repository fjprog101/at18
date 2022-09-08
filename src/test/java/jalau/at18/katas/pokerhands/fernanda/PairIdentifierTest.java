package jalau.at18.katas.pokerhands.fernanda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PairIdentifierTest {
    
    @Test
    public void shouldIdentifyPair() {
        PairIdentifier identifypair = new PairIdentifier();
        PokerHand handCase1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.KING, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(identifypair.identify(handCase1));
        PokerHand handCase2 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.ACE, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(identifypair.identify(handCase2));

        PokerHand handCase3 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.ACE, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(identifypair.identify(handCase3));

        PokerHand handWithoutPair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.QUEEN, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertFalse(identifypair.identify(handWithoutPair));
    }
    
    @Test
    public void testGetTypeofHand() {
        PairIdentifier pair = new PairIdentifier();
        int expected = 1;
        assertEquals(expected,RankHand.PAIR.getPoint() );
        assertEquals(RankHand.PAIR, pair.getTypeofHand());
    }
}

