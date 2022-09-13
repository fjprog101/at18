package jalau.at18.katas.pokerhands.mauricio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ThreeOfAKindTest {
    @Test
    public void shouldHaveThreeOfKindOnThePokerHand(){
        PokerHand handWith3ofAKindPerHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        ThreeOfAKind threeOfAKind = new ThreeOfAKind(CardValue.TWO, CardValue.SIX);
        assertTrue(threeOfAKind.match(handWith3ofAKindPerHand));
    }

    @Test
    public void shouldNotHaveThreeOfKindOnThePokerHand(){
        PokerHand handWithout3OfAKindPerHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        ThreeOfAKind threeOfAKind = new ThreeOfAKind(CardValue.TWO, CardValue.ACE);
        assertFalse(threeOfAKind.match(handWithout3OfAKindPerHand));
    }
}
