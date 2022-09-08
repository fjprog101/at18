package jalau.at18.katas.pokerhands.adriana.identifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.katas.pokerhands.adriana.*;

public class OnePairIdentifierTest {

    @Test
    public void shouldIdentifyOnePairInHand() {
        OnePairIdentifier identifier = new OnePairIdentifier();

        PokerHand handWithOnePair = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(identifier.identify(handWithOnePair));

        PokerHand handWithThreeOfAKind = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'S'),
        });

        assertFalse(identifier.identify(handWithThreeOfAKind));
        PokerHand handWithoutPairs = new PokerHand("White", new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SEVEN, 'C'),
        });
        assertFalse(identifier.identify(handWithoutPairs));
    }
}
