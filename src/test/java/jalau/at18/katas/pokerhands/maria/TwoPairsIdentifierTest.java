package jalau.at18.katas.pokerhands.maria;

import jalau.at18.katas.pokerhands.maria.Identifier.TwoPairsIdentifier;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoPairsIdentifierTest {
    @Test
    public void shouldIdentifyTwoPairs() {
        TwoPairsIdentifier identifier = new TwoPairsIdentifier();

        PokerHand twoPairsHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.FIVE, 'S'),
        });
        assertTrue(identifier.identify(twoPairsHand));
    }

    @Test
    public void shouldNotIdentifyTwoPairs() {
        TwoPairsIdentifier identifier = new TwoPairsIdentifier();

        PokerHand twoPairsHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.FIVE, 'S'),
        });
        assertFalse(identifier.identify(twoPairsHand));
    }
    @Test
    public void shouldNotIdentifyWithTriple() {
        TwoPairsIdentifier identifier = new TwoPairsIdentifier();

        PokerHand twoPairsHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.FIVE, 'S'),
        });
        assertFalse(identifier.identify(twoPairsHand));
    }
    @Test
    public void shouldNotIdentifyWithTreeOfKind() {
        TwoPairsIdentifier identifier = new TwoPairsIdentifier();

        PokerHand twoPairsHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.TWO, 'S'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.FIVE, 'S'),
        });
        assertFalse(identifier.identify(twoPairsHand));
    }
    @Test
    public void shouldNotIdentifyFourOfKind() {
        TwoPairsIdentifier identifier = new TwoPairsIdentifier();

        PokerHand twoPairsHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.FIVE, 'S'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.FIVE, 'S'),
        });
        assertFalse(identifier.identify(twoPairsHand));
    }

    @Test
    public void shouldGetRankTwoPair() {
        TwoPairsIdentifier identifier = new TwoPairsIdentifier();

        PokerHand twoPairsHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.TWO, 'S'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.NINE, 'H'),
                new Card(CardValue.NINE, 'S'),
        });
        assertEquals(CardValue.NINE, identifier.getRank(twoPairsHand).getListCardValue().get(0));
    }
}
