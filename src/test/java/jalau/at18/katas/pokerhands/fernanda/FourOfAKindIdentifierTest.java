package jalau.at18.katas.pokerhands.fernanda;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FourOfAKindIdentifierTest {
    
    @Test
    public void shouldIdentifyThreeOfAKind() {
        FourOfAKindIdentifier identifyFourofaKind = new FourOfAKindIdentifier();
        PokerHand handCase1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(identifyFourofaKind.identify(handCase1));
        PokerHand handCase2 = new PokerHand(new Card[]{
            new Card(CardValue.KING, 'C'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(identifyFourofaKind.identify(handCase2));

        PokerHand handWithoutFourOfAKind = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertFalse(identifyFourofaKind.identify(handWithoutFourOfAKind));
        PokerHand handWithoutFourOfAKind1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.QUEEN, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertFalse(identifyFourofaKind.identify(handWithoutFourOfAKind1));
    }
}