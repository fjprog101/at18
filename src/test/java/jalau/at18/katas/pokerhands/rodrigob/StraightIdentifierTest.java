package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StraightIdentifierTest {

    @Test
    public void shouldVerifyIfThereIsAStraight() {
        StraightFlushIdentifier identifier = new StraightFlushIdentifier();

        PokerHand allCardsAreConsecutive = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(allCardsAreConsecutive));

        PokerHand fourCardsAreConsecutive = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.EIGHT, 'C'),
        });
        assertFalse(identifier.identify(fourCardsAreConsecutive));

        PokerHand noCardIsConsecutive = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.EIGHT, 'C'),
        });
        assertFalse(identifier.identify(noCardIsConsecutive));
    }
}
