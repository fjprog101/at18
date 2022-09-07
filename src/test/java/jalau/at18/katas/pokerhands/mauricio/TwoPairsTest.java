package jalau.at18.katas.pokerhands.mauricio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TwoPairsTest {
    @Test
    public void shouldHaveTwoPairsOnThePokerHand(){
        PokerHand handWith2PairsPerHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        TwoPairs twoPairs = new TwoPairs(CardValue.TWO, CardValue.THREE);
        assertTrue(twoPairs.match(handWith2PairsPerHand));
    }

    @Test
    public void shouldNotHaveTwoPairsOnThePokerHand(){
        PokerHand handWithoutPairsPerHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.QUEEN, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        TwoPairs twoPairs = new TwoPairs(CardValue.TWO, CardValue.ACE);
        assertFalse(twoPairs.match(handWithoutPairsPerHand));
    }
}
