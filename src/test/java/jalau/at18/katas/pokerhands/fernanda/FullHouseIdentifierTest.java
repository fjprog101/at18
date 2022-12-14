package jalau.at18.katas.pokerhands.fernanda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FullHouseIdentifierTest {
    
    @Test
    public void shouldIdentifyFullHouseHand() {
        FullHouseIdentifier identifier = new FullHouseIdentifier();

        PokerHand fullHouseHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'S'),
        });
        assertTrue(identifier.identify(fullHouseHand));
        PokerHand fullHouseHand1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'D'),
        });
        assertTrue(identifier.identify(fullHouseHand1));
        
        PokerHand nofullHouseHand1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.QUEEN, 'D'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'D'),
        });
        assertFalse(identifier.identify(nofullHouseHand1));

        PokerHand nofullHouseHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.JACK, 'C'),
        });
        assertFalse(identifier.identify(nofullHouseHand));
        PokerHand nofullHouseHand2 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.JACK, 'C'),
        });
        assertFalse(identifier.identify(nofullHouseHand2));
        PokerHand nofullHouseHand3 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
        });
        assertFalse(identifier.identify(nofullHouseHand3));
    }
    @Test
    public void testGetTypeofHand() {
        int expected = 7;
        assertEquals(expected,RankHand.FULLHOUSE.getPoint() );
        FullHouseIdentifier full = new FullHouseIdentifier();
        assertEquals(RankHand.FULLHOUSE, full.getTypeofHand());
    }
}
