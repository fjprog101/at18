package jalau.at18.katas.pokerhands.hugo;

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

        FullHouse threeOfAKind = new FullHouse();
        PokerHand handWithThreeKind = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.NINE, 'H'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        assertFalse(threeOfAKind.identify(handWithThreeKind));

        FullHouse twoPairs = new FullHouse();
        PokerHand handWithTwoPairs = new PokerHand(new Card[]{
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SEVEN, 'S'),
        });
        assertFalse(twoPairs.identify(handWithTwoPairs));

        FullHouse onePair = new FullHouse();
        PokerHand handWithOnePair = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.EIGHT, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        assertFalse(onePair.identify(handWithOnePair));

        FullHouse noPair = new FullHouse();
        PokerHand handWithNoPair = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.NINE, 'S'),
        });
        assertFalse(noPair.identify(handWithNoPair));
    }
}
