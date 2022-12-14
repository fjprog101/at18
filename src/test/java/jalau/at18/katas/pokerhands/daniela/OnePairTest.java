package jalau.at18.katas.pokerhands.daniela;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OnePairTest {
    @Test
    public void shouldReturnOnePair() {
        OnePairIdentifier onepair = new OnePairIdentifier();
        PokerHand handWithGroupsOfOnepairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.EIGHT, 'D'),
                new Card(CardValue.SEVEN, 'S'),
                new Card(CardValue.NINE, 'C'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertTrue(onepair.identify(handWithGroupsOfOnepairs));
    }

    @Test
    public void shouldReturnFalseOnePair() {
        OnePairIdentifier onepair = new OnePairIdentifier();
        PokerHand handWithGroupsOfOnepairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.QUEEN, 'S'),
                new Card(CardValue.SEVEN, 'D'),
                new Card(CardValue.EIGHT, 'H'),
                new Card(CardValue.NINE, 'H'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertFalse(onepair.identify(handWithGroupsOfOnepairs));
    }

    @Test
    public void shouldReturnFalseOnePair1() {
        OnePairIdentifier onepair = new OnePairIdentifier();
        PokerHand handWithGroupsOfOnepairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.QUEEN, 'S'),
                new Card(CardValue.SEVEN, 'D'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.SEVEN, 'H'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertFalse(onepair.identify(handWithGroupsOfOnepairs));
    }

    @Test
    public void shouldReturnFalseOnePair2() {
        OnePairIdentifier onepair = new OnePairIdentifier();
        PokerHand handWithGroupsOfOnepairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'S'),
                new Card(CardValue.SEVEN, 'D'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.SEVEN, 'H'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertFalse(onepair.identify(handWithGroupsOfOnepairs));
    }
}
