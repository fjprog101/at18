package jalau.at18.katas.pokerhands.fernanda;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThreeOfAKindIdentifierTest {
    
    @Test
    public void shouldIdentifyThreeOfAKind() {
        ThreeOfAKindIdentifier identifyThreeofaKind = new ThreeOfAKindIdentifier();
        PokerHand handCase1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(identifyThreeofaKind.identify(handCase1));
        PokerHand handCase2 = new PokerHand(new Card[]{
            new Card(CardValue.KING, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(identifyThreeofaKind.identify(handCase2));

        PokerHand handWithoutThreeOfAKind = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertFalse(identifyThreeofaKind.identify(handWithoutThreeOfAKind));
        PokerHand handWithoutThreeOfAKind1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.QUEEN, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertFalse(identifyThreeofaKind.identify(handWithoutThreeOfAKind1));
        PokerHand handWithoutThreeOfAKind2 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertFalse(identifyThreeofaKind.identify(handWithoutThreeOfAKind2));
        PokerHand handWithoutThreeOfAKind3 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.ACE, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        assertFalse(identifyThreeofaKind.identify(handWithoutThreeOfAKind3));
    }
}

