package jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import jalau.at18.katas.pokerhands.rodrigob.Cards.Card;
import jalau.at18.katas.pokerhands.rodrigob.Cards.CardValue;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public class StraightIdentifierTest {

    @Test
    public void shouldVerifyIfThereIsAStraight() {
        StraightIdentifier identifier = new StraightIdentifier();

        PokerHand allCardsAreConsecutive = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C')
        ));
        assertTrue(identifier.identify(allCardsAreConsecutive));
        assertEquals(6, identifier.getCardRankedValue(allCardsAreConsecutive));

        PokerHand fourCardsAreConsecutive = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.EIGHT, 'C')
        ));
        assertFalse(identifier.identify(fourCardsAreConsecutive));

        PokerHand noCardIsConsecutive = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.EIGHT, 'C')
        ));
        assertFalse(identifier.identify(noCardIsConsecutive));
    }
}
