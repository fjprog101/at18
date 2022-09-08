package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FullHouseTest {
    @Test
    public void identifyWhenAintExistFullHouseHand() {
        FullHouseIdentifier identifier = new FullHouseIdentifier();

        PokerHand FullHouseHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(FullHouseHand));
    }
    @Test
    public void identifyWhenExistFullHouseHand() {
        FullHouseIdentifier identifier = new FullHouseIdentifier();

        PokerHand fullHouseHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(fullHouseHand));
    }
}
