package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class HandsTwoPairsTest {
    @Test
    public void shouldSayIfThereAreTwoPairsInHand() {
        HandsTwoPairs handsTwoPairs = new HandsTwoPairs();

        PokerHand handWithTwoPairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(handsTwoPairs.match(handWithTwoPairs));

        PokerHand handWithOnePair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(handsTwoPairs.match(handWithOnePair));

        PokerHand handWithoutPair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(handsTwoPairs.match(handWithoutPair));

    }
}
