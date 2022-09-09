package jalau.at18.katas.pokerhands.alvaro;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HighCardIdentifierTest {
    @Test
    public void shouldIdentifyHighCardHand() {
        HighCardIdentifier identifier = new HighCardIdentifier();

        PokerHand highCardHand = new PokerHand(new Card[]{
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.QUEEN, 'H'),
            new Card(CardValue.ACE, 'C'),
        });
        assertTrue(identifier.identify(highCardHand));
        PokerHand HighCardHand1 = new PokerHand(new Card[]{
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SEVEN, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.QUEEN, 'H'),
            new Card(CardValue.KING, 'C'),
        });
        assertTrue(identifier.identify(HighCardHand1));
        PokerHand noHighCardHand = new PokerHand(new Card[]{
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.QUEEN, 'H'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(noHighCardHand));
    }

}
