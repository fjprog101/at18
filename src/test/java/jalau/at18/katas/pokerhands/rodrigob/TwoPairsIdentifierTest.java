package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoPairsIdentifierTest {

    @Test
    public void shouldVerifyIfThereAreTwoPairs() {
        TwoPairsIdentifier identifier = new TwoPairsIdentifier();

        PokerHand cardsWith2Pairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(cardsWith2Pairs));
        assertEquals(8, identifier.getRankedValue(cardsWith2Pairs));

        PokerHand cardsWith1Pair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.SEVEN, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(cardsWith1Pair));

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
