package jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import jalau.at18.katas.pokerhands.rodrigob.Cards.Card;
import jalau.at18.katas.pokerhands.rodrigob.Cards.CardValue;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public class FullHouseIdentifierTest {

    @Test
    public void shouldIdentifyFullHouseHand() {
        FullHouseIdentifier identifier = new FullHouseIdentifier();

        PokerHand fullHouseHand = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C')
        ));
        assertTrue(identifier.identify(fullHouseHand));
        assertEquals(4, identifier.getCardRankedValue(fullHouseHand));

        PokerHand threeOfAKindHand = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C')
        ));
        assertFalse(identifier.identify(threeOfAKindHand));

        PokerHand onePairHand = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C')
        ));
        assertFalse(identifier.identify(onePairHand));

        PokerHand twoPairsHand = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C')
        ));
        assertFalse(identifier.identify(twoPairsHand));

        PokerHand fourOfAKindHand = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C')
        ));
        assertFalse(identifier.identify(fourOfAKindHand));
    }
}
