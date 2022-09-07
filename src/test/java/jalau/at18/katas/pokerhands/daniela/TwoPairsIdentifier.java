package jalau.at18.katas.pokerhands.daniela;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoPairsIdentifier {

    @Test
    public void shouldReturnTwoPairs() {
        Twopairidentifier twopairs = new Twopairidentifier();
        PokerHand handWithGroupsOfTwopairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'D'),
                new Card(CardValue.SEVEN, 'D'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.NINE, 'C'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertTrue(twopairs.identify(handWithGroupsOfTwopairs));
    }

    @Test
    public void shouldReturnFalseForTwoPairs() {
        Twopairidentifier twopairs = new Twopairidentifier();
        PokerHand handWithGroupsOfTwopairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'D'),
                new Card(CardValue.SEVEN, 'D'),
                new Card(CardValue.SIX, 'S'),
                new Card(CardValue.NINE, 'C'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertFalse(twopairs.identify(handWithGroupsOfTwopairs));
    }

    @Test
    public void shouldReturnOnePair() {
        OnePair onepair = new OnePair(CardValue.JACK, CardValue.EIGHT);
        PokerHand handWithGroupsOfOnepairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.EIGHT, 'D'),
                new Card(CardValue.SEVEN, 'S'),
                new Card(CardValue.NINE, 'C'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertTrue(onepair.match(handWithGroupsOfOnepairs));
    }

    @Test
    public void shouldReturnFalseOnePair() {
        OnePair onepair = new OnePair(CardValue.JACK, CardValue.SEVEN);
        PokerHand handWithGroupsOfOnepairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'S'),
                new Card(CardValue.SEVEN, 'D'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.NINE, 'H'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertFalse(onepair.match(handWithGroupsOfOnepairs));
    }
}
