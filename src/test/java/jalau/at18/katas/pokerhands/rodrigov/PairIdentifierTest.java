package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class PairIdentifierTest {
    @Test
    public void shouldSayIfExistsAPairInTheHand(){
        PairIndentifier pairIndentifier = new PairIndentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.FIVE, 'H'),
        });
        assertTrue(pairIndentifier.identify(hand));
    }

    @Test
    public void shouldSayIfNotExistsAPairInTheHand(){
        PairIndentifier pairIndentifier = new PairIndentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SEVEN, 'D'),
            new Card(CardValue.FIVE, 'H'),
        });
        assertFalse(pairIndentifier.identify(hand));
    }
}
