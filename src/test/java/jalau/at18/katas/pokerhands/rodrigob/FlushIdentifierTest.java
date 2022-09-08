package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FlushIdentifierTest {

    @Test
    public void shouldVerifyIfTehreIsAFlush() {
        FlushIdentifier identifier = new FlushIdentifier();

        PokerHand allCardsWithTheSameSuit = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(allCardsWithTheSameSuit));

        PokerHand fourCardsWithTheSameSuit = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(fourCardsWithTheSameSuit));

        PokerHand twoCardsWithTheSameSuit = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.SIX, 'D'),
        });
        assertFalse(identifier.identify(twoCardsWithTheSameSuit));

    }
}
