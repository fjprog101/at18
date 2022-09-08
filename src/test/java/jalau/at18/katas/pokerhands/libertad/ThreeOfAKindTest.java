package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThreeOfAKindTest {
    @Test
    public void identifyWhenExistThreeOfAKindHand() {
        ThreeOfAKindIdentifier identifier = new ThreeOfAKindIdentifier();

        PokerHand ThreeOfAKindHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(ThreeOfAKindHand));
    }
    @Test
    public void identifyWhenDontExistThreeOfAKindHand() {
        ThreeOfAKindIdentifier identifier = new ThreeOfAKindIdentifier();

        PokerHand ThreeOfAKindHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.NINE, 'D'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(ThreeOfAKindHand));

        PokerHand hasTwoGroupHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(hasTwoGroupHand));

        PokerHand allDiferentCardsHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.EIGHT, 'D'),
            new Card(CardValue.SEVEN, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(allDiferentCardsHand));
    }
}
