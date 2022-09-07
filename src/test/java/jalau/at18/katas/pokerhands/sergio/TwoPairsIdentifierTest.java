package jalau.at18.katas.pokerhands.sergio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoPairsIdentifierTest {
    @Test
    public void shouldIdentifyTwoPairsHand() {
        TwoPairsIdentifier identifier = new TwoPairsIdentifier();

        PokerHand twoPairsHand = new PokerHand(new Card[] {new Card(CardValue.TWO, 'C'), new Card(CardValue.TWO, 'D'),
                new Card(CardValue.FOUR, 'C'), new Card(CardValue.FOUR, 'S'), new Card(CardValue.JACK, 'C'), });
        assertTrue(identifier.identify(twoPairsHand));
        PokerHand threeOfKindHand = new PokerHand(
                new Card[] {new Card(CardValue.TWO, 'C'), new Card(CardValue.TWO, 'S'), new Card(CardValue.TWO, 'H'),
                        new Card(CardValue.FIVE, 'C'), new Card(CardValue.SEVEN, 'C'), });
        assertFalse(identifier.identify(threeOfKindHand));
        PokerHand PokerHand = new PokerHand(new Card[] {new Card(CardValue.THREE, 'C'), new Card(CardValue.THREE, 'S'),
                new Card(CardValue.THREE, 'H'), new Card(CardValue.THREE, 'D'), new Card(CardValue.SEVEN, 'C'), });
        assertFalse(identifier.identify(PokerHand));
    }
}
