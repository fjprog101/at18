package jalau.at18.katas.pokerhands.hugo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FullHouseTest {
    
    @Test
    public void shouldVerifyThereIsFullHouse() {

        FullHouse fullHouse = new FullHouse();
        PokerHand handWithFullHouse = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.EIGHT, 'H'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.EIGHT, 'S'),
            new Card(CardValue.TWO, 'S'),
        });
        assertTrue(fullHouse.identify(handWithFullHouse));

        PokerHand handWithThreeKind = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.NINE, 'H'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        assertFalse(fullHouse.identify(handWithThreeKind));

        PokerHand handWithTwoPairs = new PokerHand(new Card[]{
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SEVEN, 'S'),
        });
        assertFalse(fullHouse.identify(handWithTwoPairs));

        PokerHand handWithOnePair = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.EIGHT, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        assertFalse(fullHouse.identify(handWithOnePair));

        PokerHand handWithNoPair = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.NINE, 'S'),
        });
        assertFalse(fullHouse.identify(handWithNoPair));
        assertEquals(7, fullHouse.getRankedValue(handWithFullHouse));
    }
}
