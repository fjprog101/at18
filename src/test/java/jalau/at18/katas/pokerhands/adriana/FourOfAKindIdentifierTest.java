package jalau.at18.katas.pokerhands.adriana;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FourOfAKindIdentifierTest {
    @Test
    public void shouldIdentifyFourOfAKindHand() {
        FourOfAKindIdentifier identifier = new FourOfAKindIdentifier();

        PokerHand handWithFourOfAKind = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(identifier.identify(handWithFourOfAKind));

        PokerHand handWithFourOfAKind2 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'S'),
        });
        assertTrue(identifier.identify(handWithFourOfAKind2));

        PokerHand handWithoutFourOfAKind = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SEVEN, 'C'),
        });
        assertFalse(identifier.identify(handWithoutFourOfAKind));

        PokerHand handWithoutFourOfAKind2 = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.FIVE, 'C'),
        });
        assertFalse(identifier.identify(handWithoutFourOfAKind2));
    }
}
