package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HighCardTest {
    @Test
    public void identifyWhenExistHighCardHand() {
        HighCardIdentifier identifier = new HighCardIdentifier();

        PokerHand HighCardHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.QUEEN, 'H'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(HighCardHand));
    }
    @Test
    public void identifyWhenDontExistHighCardHand() {
        HighCardIdentifier identifier = new HighCardIdentifier();

        PokerHand HighCardHand = new PokerHand(new Card[]{
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.NINE, 'D'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(HighCardHand));
    }
}
