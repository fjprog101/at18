package jalau.at18.katas.pokerhands.adriana.identifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.katas.pokerhands.adriana.*;

public class FullHouseIdentifierTest {
    @Test
    public void shouldIdentifyFullHouseHand() {
        FullHouseIdentifier identifier = new FullHouseIdentifier();

        PokerHand handWithThreeOfAKind = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'S'),
        });
        assertFalse(identifier.identify(handWithThreeOfAKind));

        PokerHand handWithThreeOfAKindAndPair = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'S'),
        });
        assertTrue(identifier.identify(handWithThreeOfAKindAndPair));

        PokerHand handWithoutFullHouse = new PokerHand("White", new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SEVEN, 'C'),
        });
        assertFalse(identifier.identify(handWithoutFullHouse));
    }
}
