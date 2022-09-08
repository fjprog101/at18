package jalau.at18.katas.pokerhands.libertad;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class TwoPairIdentifierTest {
    @Test
    public void shouldIdentifyTwoPair() {
        TwoPairIdentifier identifier = new TwoPairIdentifier();

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
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
        });
        assertFalse(identifier.identify(noTwoPairHand));
    }

    @Test
    public void shouldIdentifyWhenAintTwoPair() {
        TwoPairIdentifier identifier = new TwoPairIdentifier();

        PokerHand threeGroupSize = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(threeGroupSize));
    }
}
