package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.katas.pokerhands.daniela.Twopairidentifier;
public class TwoPairsIdentifierTest {
    @Test
    public void shouldSayIfTheHandHaveTwoPair(){
        TwoPairsIdentifier twoPairsIdentifier = new TwoPairsIdentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertTrue(twoPairsIdentifier.identify(hand));
    }

    @Test
    public void shouldSayIfTheHandDoesntHaveTwoPair(){
        TwoPairsIdentifier twoPairsIdentifier = new TwoPairsIdentifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.SEVEN, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.SIX, 'H'),
        });
        assertFalse(twoPairsIdentifier.identify(hand));;
    }

    @Test
    public void shouldReturnTwoPairsRank(){
        TwoPairsIdentifier twoPairsIdentifier = new TwoPairsIdentifier();
        assertEquals("TWOPAIRS", twoPairsIdentifier.identifyRank().toString());
    }
}
