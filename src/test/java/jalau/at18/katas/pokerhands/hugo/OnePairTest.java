package jalau.at18.katas.pokerhands.hugo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OnePairTest {

    @Test
    public void shouldVerifyThereAreOnePair() {

        OnePair twoPairs = new OnePair();
        PokerHand handWithTwoPairs = new PokerHand(new Card[]{
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SEVEN, 'S'),
        });
        assertFalse(twoPairs.identify(handWithTwoPairs));

        OnePair onePair = new OnePair();
        PokerHand handWithOnePair = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.EIGHT, 'S'),
        });
        assertTrue(onePair.identify(handWithOnePair));

        OnePair noPair = new OnePair();
        PokerHand handWithNoPair = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.NINE, 'S'),
        });
        assertFalse(noPair.identify(handWithNoPair));
        
        OnePair fourOfAKind = new OnePair();
        PokerHand handWithFourKind = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        assertFalse(fourOfAKind.identify(handWithFourKind));
    }
}
