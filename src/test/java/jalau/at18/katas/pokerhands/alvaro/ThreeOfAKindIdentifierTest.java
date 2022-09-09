package jalau.at18.katas.pokerhands.alvaro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThreeOfAKindIdentifierTest {
    @Test
    public void shouldIdentifyThreeOfAKindHand() {
        ThreeOfAKindIdentifier identifier = new ThreeOfAKindIdentifier();

        PokerHand threeOfAKindHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
        });
        assertTrue(identifier.identify(threeOfAKindHand));
    }

}
