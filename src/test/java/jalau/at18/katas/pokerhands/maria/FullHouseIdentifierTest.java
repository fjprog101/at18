package jalau.at18.katas.pokerhands.maria;

import jalau.at18.katas.pokerhands.maria.Identifier.FullHouseIdentifier;
import org.junit.Test;

import static org.junit.Assert.*;

public class FullHouseIdentifierTest {
    @Test
    public void shouldIdentifyThreeCardsSameValueOnePair() {
        FullHouseIdentifier identifier = new FullHouseIdentifier();

        PokerHand fullHouseHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.FIVE, 'H'),
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.TWO, 'S'),
        });
        assertTrue(identifier.identify(fullHouseHand));
    }

    @Test
    public void shouldNotIdentifyTwoPairCards() {
        FullHouseIdentifier identifier = new FullHouseIdentifier();

        PokerHand twoPairCardsHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.FIVE, 'H'),
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.SIX, 'S'),
        });
        assertFalse(identifier.identify(twoPairCardsHand));
    }

    @Test
    public void shouldNotIdentifyThreeDifferentCardsOnePair() {
        FullHouseIdentifier identifier = new FullHouseIdentifier();

        PokerHand threeDifferentCardsHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.NINE, 'C'),
                new Card(CardValue.NINE, 'S'),
        });
        assertFalse(identifier.identify(threeDifferentCardsHand));
    }

    @Test
    public void shouldGetFullHouseRank() {
        FullHouseIdentifier identifier = new FullHouseIdentifier();

        PokerHand fullHouseRank = new PokerHand(new Card[]{
                new Card(CardValue.NINE, 'H'),
                new Card(CardValue.FOUR, 'H'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.NINE, 'C'),
                new Card(CardValue.NINE, 'S'),
        });
        assertEquals(CardValue.NINE, identifier.getRank(fullHouseRank).getListCardValue().get(0));
    }

}
