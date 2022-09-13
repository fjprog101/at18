package jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import jalau.at18.katas.pokerhands.rodrigob.Cards.Card;
import jalau.at18.katas.pokerhands.rodrigob.Cards.CardValue;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public class FlushIdentifierTest {

    @Test
    public void shouldVerifyIfTehreIsAFlush() {
        FlushIdentifier identifier = new FlushIdentifier();

        PokerHand allCardsWithTheSameSuit = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'C')
        ));
        assertTrue(identifier.identify(allCardsWithTheSameSuit));
        assertEquals(6, identifier.getCardRankedValue(allCardsWithTheSameSuit));

        PokerHand fourCardsWithTheSameSuit = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'C')
        ));
        assertFalse(identifier.identify(fourCardsWithTheSameSuit));

        PokerHand twoCardsWithTheSameSuit = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.SIX, 'D')
        ));
        assertFalse(identifier.identify(twoCardsWithTheSameSuit));

    }
}
