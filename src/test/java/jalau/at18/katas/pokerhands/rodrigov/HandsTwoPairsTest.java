package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class HandsTwoPairsTest {
    @Test
    public void shouldSayIfThereAreTwoPairsInHand() {
        HandsTwoPairs handsTwoPairs = new HandsTwoPairs();

        PokerHand twoPairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(handsTwoPairs.match(twoPairs));

        PokerHand onePair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'H'),
        });
        assertFalse(handsTwoPairs.match(onePair));

        PokerHand diferentCards = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.SIX, 'S'),
        });
        assertFalse(handsTwoPairs.match(diferentCards));

    }
}
