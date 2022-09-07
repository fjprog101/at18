package jalau.at18.katas.pokerhands.roberto;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FullHouseIdentifierTest {

    @Test
    public void shouldIdentifyFullHouseHand() {
        FullHouseIdentifier identifier = new FullHouseIdentifier();

        PokerHand fullHouseHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.FOUR, 'D'),
                new Card(CardValue.FOUR, 'H'),
                new Card(CardValue.FOUR, 'C'),
        });
        assertTrue(identifier.identify(fullHouseHand));

        PokerHand noFullHouseValues = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.SEVEN, 'C'),
        });

        assertFalse(identifier.identify(noFullHouseValues));
    }
}
