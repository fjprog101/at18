package jalau.at18.katas.pokerhands.alvaro;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FourOfAKindIdentifierTest {
    @Test
    public void shouldIdentifyFourOfAKindHand() {
        FourOfAKindIdentifier identifier = new FourOfAKindIdentifier();

        PokerHand fourOfAKindHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO,'C'),
            new Card(CardValue.TWO,'D'),
            new Card(CardValue.THREE,'S'),
        });
        assertTrue(identifier.identify(fourOfAKindHand));

        PokerHand noConsecutiveValues = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO,'C'),
            new Card(CardValue.THREE,'D'),
            new Card(CardValue.TWO,'S'),
        });
        assertTrue(identifier.identify(noConsecutiveValues));

        PokerHand highCardHand = new PokerHand(new Card[]{
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.QUEEN, 'H'),
            new Card(CardValue.ACE, 'C'),
        });
        assertFalse(identifier.identify(highCardHand));

        PokerHand flushHand = new PokerHand(new Card[]{ //flush hand
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SEVEN, 'S'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.QUEEN, 'S'),
            new Card(CardValue.KING, 'S'),
        });
        assertFalse(identifier.identify(flushHand));

        PokerHand pairHand = new PokerHand(new Card[]{ //pair hand
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.QUEEN, 'H'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(pairHand));

        PokerHand straightHand = new PokerHand(new Card[]{ //straight hand
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(straightHand));

        PokerHand threeOfAKindHand = new PokerHand(new Card[]{ // three of a kind hand
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
        });
        assertFalse(identifier.identify(threeOfAKindHand));

        PokerHand twoPairHand = new PokerHand(new Card[]{ //two pair hand
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'C'),
        });
        assertFalse(identifier.identify(twoPairHand));

        PokerHand FullHouseHand = new PokerHand(new Card[]{ //Full House hand
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.TWO,'C'),
            new Card(CardValue.TWO,'D'),
            new Card(CardValue.TWO,'S'),
        });
        assertFalse(identifier.identify(FullHouseHand));

        PokerHand straightFlushHand = new PokerHand(new Card[]{  //StraightFlush hand
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertFalse(identifier.identify(straightFlushHand));
    }
}
