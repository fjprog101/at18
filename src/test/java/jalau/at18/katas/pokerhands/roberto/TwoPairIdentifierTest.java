package jalau.at18.katas.pokerhands.roberto;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoPairIdentifierTest {

    @Test
    public void shouldIdentifyTwoPairHand() {
        TwoPairIdentifier identifier = new TwoPairIdentifier();

        PokerHand twoPairHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.FOUR, 'H'),
                new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(twoPairHand));

        PokerHand noTwoPairValues = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.SEVEN, 'C'),
        });

        assertFalse(identifier.identify(noTwoPairValues));
    }

}
