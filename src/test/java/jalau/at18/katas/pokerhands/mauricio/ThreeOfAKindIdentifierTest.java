package jalau.at18.katas.pokerhands.mauricio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ThreeOfAKindIdentifierTest {
    @Test
    public void shouldIdentifyThreeOfAKind() {
        ThreeOfKindIdentifier identifier = new ThreeOfKindIdentifier(CardValue.TWO, CardValue.SIX);

        PokerHand threeOfAKind= new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.FIVE, 'C'),
        });
        assertTrue(identifier.identify(threeOfAKind));
    }
    @Test
    public void shouldNotIdentifyThreeOfAKind() {
        ThreeOfKindIdentifier identifier = new ThreeOfKindIdentifier(CardValue.TWO, CardValue.SIX);

        PokerHand notThreeOfAKind = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(notThreeOfAKind));
    }
}
