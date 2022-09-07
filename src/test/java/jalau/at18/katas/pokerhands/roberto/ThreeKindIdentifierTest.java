package jalau.at18.katas.pokerhands.roberto;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ThreeKindIdentifierTest {
    @Test
    public void shouldIdentifyThreeKindHand() {
        ThreeKindIdentifier identifier = new ThreeKindIdentifier();

        PokerHand threeKindHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.FOUR, 'H'),
                new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(threeKindHand));

        PokerHand noThreeKindValues = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.SEVEN, 'C'),
        });

        assertFalse(identifier.identify(noThreeKindValues));
    }
}
