package jalau.at18.katas.pokerhands.adriana;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThreeOfAKindIdentifierTest {
    @Test
    public void shouldIdentifyStraightFlushHand() {
        ThreeOfAKindIdentifier identifier = new ThreeOfAKindIdentifier();

        PokerHand handWithThreeOfAKind = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(identifier.identify(handWithThreeOfAKind));

        PokerHand handWithThreeOfAKindAndPair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'S'),
        });

        assertTrue(identifier.identify(handWithThreeOfAKindAndPair));
        PokerHand handWithoutThreeOfAKind = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SEVEN, 'C'),
        });
        assertFalse(identifier.identify(handWithoutThreeOfAKind));
    }
}
