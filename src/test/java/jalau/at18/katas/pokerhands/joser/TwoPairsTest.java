package jalau.at18.katas.pokerhands.joser;

import org.junit.Test;
import static org.junit.Assert.*;
public class TwoPairsTest {
    @Test
    public void shouldIdentifyTwoPair() {
        TwoPairs identifier = new TwoPairs();

        PokerHand twoPairWithDiferentSuit = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(twoPairWithDiferentSuit));

        PokerHand twoPairHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.ACE, 'D'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'H'),
        });

        assertTrue(identifier.identify(twoPairHand));
        PokerHand sameSuite = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SEVEN, 'C'),
        });
        assertTrue(identifier.identify(sameSuite));
        PokerHand noTwoPairHand = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
        });
        assertFalse(identifier.identify(noTwoPairHand));
    }
}
