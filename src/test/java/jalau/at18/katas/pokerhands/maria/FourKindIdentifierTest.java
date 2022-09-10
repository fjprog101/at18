package jalau.at18.katas.pokerhands.maria;

import jalau.at18.katas.pokerhands.maria.Identifier.FourKindIdentifier;
import org.junit.Test;

import static org.junit.Assert.*;

public class FourKindIdentifierTest {
    @Test
    public void shouldHandHaveFourCardsSameValue() {
        FourKindIdentifier identifier = new FourKindIdentifier();
        PokerHand fourKindHand = new PokerHand(new Card[]{
                new Card(CardValue.SEVEN, 'C'),
                new Card(CardValue.SEVEN, 'S'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.SEVEN, 'C'),
                new Card(CardValue.EIGHT, 'D'),
        });
        assertTrue(identifier.identify(fourKindHand));
    }

    @Test
    public void shouldNotHandHaveFourCardsSameValue() {
        FourKindIdentifier identifier = new FourKindIdentifier();
        PokerHand fourKindHand = new PokerHand(new Card[]{
                new Card(CardValue.SEVEN, 'C'),
                new Card(CardValue.SEVEN, 'S'),
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.SEVEN, 'C'),
                new Card(CardValue.EIGHT, 'D'),
        });
        assertFalse(identifier.identify(fourKindHand));
    }

    @Test
    public void rankFlushHand() {
        FourKindIdentifier identifier = new FourKindIdentifier();
        PokerHand fourKindHand = new PokerHand(new Card[]{
                new Card(CardValue.SEVEN, 'C'),
                new Card(CardValue.SEVEN, 'S'),
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.SEVEN, 'D'),
        });
        assertEquals(CardValue.SEVEN, identifier.getRank(fourKindHand).getCardValue());
    }
}
