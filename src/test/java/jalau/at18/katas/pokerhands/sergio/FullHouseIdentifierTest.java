package jalau.at18.katas.pokerhands.sergio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FullHouseIdentifierTest {
    @Test
    public void shouldIdentifyTFullHouse() {
        FullHouseIdentifier identifier = new FullHouseIdentifier();

        PokerHand fullHouseHand = new PokerHand(
                new Card[] {new Card(CardValue.FOUR, 'C'), new Card(CardValue.FOUR, 'D'), new Card(CardValue.FOUR, 'S'),
                        new Card(CardValue.JACK, 'S'), new Card(CardValue.JACK, 'C'), });
        assertTrue(identifier.identify(fullHouseHand));
        PokerHand pokerHand = new PokerHand(new Card[] {new Card(CardValue.TWO, 'C'), new Card(CardValue.TWO, 'S'),
                new Card(CardValue.TWO, 'H'), new Card(CardValue.TWO, 'D'), new Card(CardValue.SEVEN, 'C'), });
        assertFalse(identifier.identify(pokerHand));
        PokerHand threeOfKindHand = new PokerHand(new Card[] {new Card(CardValue.THREE, 'C'),
                new Card(CardValue.THREE, 'S'), new Card(CardValue.THREE, 'H'), new Card(CardValue.SIX, 'D'),
                new Card(CardValue.EIGHT, 'C'), });
        assertFalse(identifier.identify(threeOfKindHand));
    }
}
