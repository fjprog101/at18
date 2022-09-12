package jalau.at18.katas.pokerhands.hugo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoPairTest {
    
    @Test
    public void shouldVerifyThereAreTwoPairs() {

        TwoPair twoPairIdentifier = new TwoPair();
        PokerHand handWithTwoPairs = new PokerHand(new Card[]{
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.SEVEN, 'S'),
        });
        assertTrue(twoPairIdentifier.identify(handWithTwoPairs));

        PokerHand handWithOnePair = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.EIGHT, 'S'),
        });
        assertFalse(twoPairIdentifier.identify(handWithOnePair));

        PokerHand handWithNoPair = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.NINE, 'S'),
        });
        assertFalse(twoPairIdentifier.identify(handWithNoPair));
        
        PokerHand handWithFourKind = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        assertFalse(twoPairIdentifier.identify(handWithFourKind));
        assertEquals(13, twoPairIdentifier.getRankedValue(handWithTwoPairs));
    }
}