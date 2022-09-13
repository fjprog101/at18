package jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;


import org.junit.Test;

import jalau.at18.katas.pokerhands.rodrigob.Cards.Card;
import jalau.at18.katas.pokerhands.rodrigob.Cards.CardValue;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public class OnePairIdentifierTest {

    @Test
    public void shouldVerifyIfThereIsOnePair() {
        OnePairIdentifier identifier = new OnePairIdentifier();

        PokerHand cardsWith1Pair = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.SIX, 'C')
        ));
        assertTrue(identifier.identify(cardsWith1Pair));
        assertEquals(2, identifier.getCardRankedValue(cardsWith1Pair));

        PokerHand cardsWith2Pair = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'C')
        ));
        assertFalse(identifier.identify(cardsWith2Pair));

        PokerHand cardsWith0Pair = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.NINE, 'C'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.SIX, 'C')
        ));
        assertFalse(identifier.identify(cardsWith0Pair));
    }
}
