package jalau.at18.katas.pokerhands.maria;

import jalau.at18.katas.pokerhands.maria.Identifier.FlushIdentifier;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FlushIdentifierTest {
    @Test
    public void shouldAllCardsSameSuit() {
        FlushIdentifier identifier = new FlushIdentifier();

        PokerHand cardsSameSuitHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.FOUR, 'H'),
                new Card(CardValue.FIVE, 'H'),
                new Card(CardValue.NINE, 'H'),
        });
        assertTrue(identifier.identify(cardsSameSuitHand));
    }
    @Test
    public void shouldNotAllCardsSameSuit() {
        FlushIdentifier identifier = new FlushIdentifier();

        PokerHand cardsSameSuitHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.FIVE, 'H'),
                new Card(CardValue.NINE, 'H'),
        });
        assertFalse(identifier.identify(cardsSameSuitHand));
    }

}
