package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FullHouseIdentifierTest {

    @Test
    public void shouldIdentifyFullHouseHand() {
        FullHouseIdentifier identifier = new FullHouseIdentifier();

        PokerHand fullHouseHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C'),
        });
        assertTrue(identifier.identify(fullHouseHand));
        assertEquals(4, identifier.getCardRankedValue(fullHouseHand));

        PokerHand threeOfAKindHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C'),
        });
        assertFalse(identifier.identify(threeOfAKindHand));

        PokerHand onePairHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C'),
        });
        assertFalse(identifier.identify(onePairHand));

        PokerHand twoPairsHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C'),
        });
        assertFalse(identifier.identify(twoPairsHand));

        PokerHand fourOfAKindHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'C'),
        });
        assertFalse(identifier.identify(fourOfAKindHand));
    }
}
