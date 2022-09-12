package jalau.at18.katas.pokerhands.hugo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OnePairTest {

    @Test
    public void shouldVerifyThereAreOnePair() {

        OnePair onePairIdentifier = new OnePair();
        PokerHand handWithTwoPairs = new PokerHand(new Card[]{
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SEVEN, 'S'),
        });
        assertFalse(onePairIdentifier.identify(handWithTwoPairs));

        PokerHand handWithOnePair = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.EIGHT, 'S'),
        });
        assertTrue(onePairIdentifier.identify(handWithOnePair));

        PokerHand handWithNoPair = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.NINE, 'S'),
        });
        assertFalse(onePairIdentifier.identify(handWithNoPair));
        
        PokerHand handWithFourKind = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        assertFalse(onePairIdentifier.identify(handWithFourKind));
        assertEquals(7, onePairIdentifier.getRankedValue(handWithOnePair));
    }
}
