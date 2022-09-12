package jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import jalau.at18.katas.pokerhands.rodrigob.Cards.Card;
import jalau.at18.katas.pokerhands.rodrigob.Cards.CardValue;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public class TwoPairsIdentifierTest {

    @Test
    public void shouldVerifyIfThereAreTwoPairs() {
        TwoPairsIdentifier identifier = new TwoPairsIdentifier();

        PokerHand cardsWith2Pairs = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.SIX, 'C')
        ));
        assertTrue(identifier.identify(cardsWith2Pairs));
        assertEquals(8, identifier.getCardRankedValue(cardsWith2Pairs));

        PokerHand cardsWith1Pair = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.SEVEN, 'C'),
            new Card(CardValue.SIX, 'C')
        ));
        assertFalse(identifier.identify(cardsWith1Pair));

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
