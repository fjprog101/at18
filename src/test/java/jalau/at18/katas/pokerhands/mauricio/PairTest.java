package jalau.at18.katas.pokerhands.mauricio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PairTest {
    @Test
    public void shouldHaveOnePairOnThePokerHand(){
        PokerHand handWithOnePairPerHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        Pair pair = new Pair(CardValue.TWO, CardValue.ACE);
        assertTrue(pair.match(handWithOnePairPerHand ));
    }

    @Test
    public void shouldNotHaveOnePairOnThePokerHand(){
        PokerHand handWithoutPairsPerHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        Pair pair = new Pair(CardValue.TWO, CardValue.THREE);
        assertFalse(pair.match(handWithoutPairsPerHand));
    }
}
