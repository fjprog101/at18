package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FourOfAKindIdentifierTest {

    @Test
    public void identifyWhenExistFourOfAKindHand() {
        FourOfAKindIdentifier identifier = new FourOfAKindIdentifier();

        PokerHand FourOfAKindHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(FourOfAKindHand));

        PokerHand fourOfAKindWithDiferentSuit = new PokerHand(new Card[]{
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(fourOfAKindWithDiferentSuit));

        PokerHand sameSuite = new PokerHand(new Card[]{
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SEVEN, 'C'),
        });
        assertTrue(identifier.identify(sameSuite));
    }
    @Test
    public void identifyWhenDontExistFourOfAKindHand() {
        FourOfAKindIdentifier identifier = new FourOfAKindIdentifier();

        PokerHand FourOfAKindHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        
        assertFalse(identifier.identify(FourOfAKindHand));
        PokerHand diferentsValues = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
        });
        assertFalse(identifier.identify(diferentsValues));
        PokerHand noFourOfAKindHand = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'D'),
        });
        assertFalse(identifier.identify(noFourOfAKindHand));
        PokerHand pokerHand = new PokerHand(new Card[]{
            new Card(CardValue.SEVEN, 'C'),
            new Card(CardValue.SEVEN, 'S'),
            new Card(CardValue.SEVEN, 'H'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'D'),
        });
        assertFalse(identifier.identify(pokerHand));
    }
}
