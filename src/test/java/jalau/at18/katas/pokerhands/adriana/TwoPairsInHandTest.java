package jalau.at18.katas.pokerhands.adriana;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoPairsInHandTest {
    
    @Test
    public void shouldSayIfThereAreTwoPairsInHand() {
        TwoPairsInHand identifier = new TwoPairsInHand();

        PokerHand handWithTwoPairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.match(handWithTwoPairs));

        PokerHand handWithOnePair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.match(handWithOnePair));

        PokerHand handWithoutPair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.match(handWithoutPair));

    }
}
