package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OnePairIdentifierTest {

    @Test
    public void shouldVerifyIfThereIsOnePair() {
        OnePairIdentifier identifier = new OnePairIdentifier();

        PokerHand cardsWith1Pair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(cardsWith1Pair));
        assertEquals(2, identifier.getRankedValue(cardsWith1Pair));

        PokerHand cardsWith2Pair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(cardsWith2Pair));

        PokerHand cardsWith0Pair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.NINE, 'C'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(cardsWith0Pair));
    }
}
