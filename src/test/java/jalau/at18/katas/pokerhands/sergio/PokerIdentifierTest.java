package jalau.at18.katas.pokerhands.sergio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PokerIdentifierTest {
    @Test
    public void shouldIdentifyPokerHand() {
        PokerIdentifier identifier = new PokerIdentifier();

        PokerHand pokerHand = new PokerHand(new Card[] {new Card(CardValue.ACE, 'C'), new Card(CardValue.ACE, 'D'),
                new Card(CardValue.ACE, 'S'), new Card(CardValue.ACE, 'H'), new Card(CardValue.JACK, 'C'), });
        assertTrue(identifier.identify(pokerHand));
        PokerHand threeOfKindHand = new PokerHand(
                new Card[] {new Card(CardValue.TWO, 'C'), new Card(CardValue.TWO, 'S'), new Card(CardValue.TWO, 'H'),
                        new Card(CardValue.FIVE, 'D'), new Card(CardValue.SEVEN, 'C'), });
        assertFalse(identifier.identify(threeOfKindHand));
        PokerHand FullHouseHand = new PokerHand(
                new Card[] {new Card(CardValue.THREE, 'C'), new Card(CardValue.THREE, 'S'),
                        new Card(CardValue.THREE, 'H'), new Card(CardValue.SIX, 'D'), new Card(CardValue.SIX, 'C'), });
        assertFalse(identifier.identify(FullHouseHand));
    }
}
