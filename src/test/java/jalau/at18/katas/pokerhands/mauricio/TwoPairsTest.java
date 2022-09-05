package jalau.at18.katas.pokerhands.mauricio;

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
        TwoPairs twopairs = new TwoPairs(handWith2PairsPerHand, CardValue.TWO, CardValue.THREE, CardValue.SIX);
        assertTrue(twopairs.twoPairs());
    }
}
