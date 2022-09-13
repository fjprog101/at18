package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class FullHouseIdentifierTest {
    @Test
    public void shouldSayIfTheHandIsAFullHouse(){
        FullHouseIdentifier fullHouseIdentifier = new FullHouseIdentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'H'),
        });
        assertTrue(fullHouseIdentifier.identify(hand));
    }

    @Test
    public void shouldSayIfTheHandIsNotAFullHouse(){
        FullHouseIdentifier fullHouseIdentifier = new FullHouseIdentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'H'),
        });
        assertFalse(fullHouseIdentifier.identify(hand));
    }

    @Test
    public void shouldReturnFullHouseRank(){
        FullHouseIdentifier fullHouseIdentifier = new FullHouseIdentifier();
        assertEquals("FULLHOUSE", fullHouseIdentifier.identifyRank().toString());
    }
}
