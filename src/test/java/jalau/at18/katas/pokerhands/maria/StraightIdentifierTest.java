package jalau.at18.katas.pokerhands.maria;

import jalau.at18.katas.pokerhands.maria.Identifier.StraightIdentifier;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StraightIdentifierTest {
    @Test
    public void shouldIdentifyStraightConsecutiveHand() {
        StraightIdentifier identifier = new StraightIdentifier();

        PokerHand straightHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.THREE, 'S'),
                new Card(CardValue.FOUR, 'S'),
                new Card(CardValue.FIVE, 'D'),
                new Card(CardValue.SIX, 'H'),
        });
        assertTrue(identifier.identify(straightHand));
    }
    @Test
    public void shouldIdentifyStraightWithNumberMessyInHand() {
        StraightIdentifier identifier = new StraightIdentifier();

        PokerHand straightHand = new PokerHand(new Card[]{
                new Card(CardValue.SIX, 'C'),
                new Card(CardValue.THREE, 'S'),
                new Card(CardValue.FOUR, 'S'),
                new Card(CardValue.FIVE, 'D'),
                new Card(CardValue.TWO, 'H'),
        });
        assertTrue(identifier.identify(straightHand));
    }

    @Test
    public void shouldNotIdentifyStraightHand() {
        StraightIdentifier identifier = new StraightIdentifier();

        PokerHand straightHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.TWO, 'S'),
                new Card(CardValue.FOUR, 'S'),
                new Card(CardValue.FIVE, 'D'),
                new Card(CardValue.SIX, 'H'),
        });
        assertFalse(identifier.identify(straightHand));
    }

    @Test
    public void shouldNotIdentifyNumbersDisorderHand() {
        StraightIdentifier identifier = new StraightIdentifier();

        PokerHand straightHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.FOUR, 'S'),
                new Card(CardValue.SIX, 'S'),
                new Card(CardValue.EIGHT, 'D'),
                new Card(CardValue.NINE, 'H'),
        });
        assertFalse(identifier.identify(straightHand));
    }

}
