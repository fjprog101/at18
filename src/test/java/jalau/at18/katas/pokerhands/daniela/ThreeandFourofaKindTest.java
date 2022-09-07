package jalau.at18.katas.pokerhands.daniela;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThreeandFourofaKindTest {
    @Test
    public void shouldReturnTrueThreeOfaKind() {
        ThreeofaKind three = new ThreeofaKind(CardValue.JACK, CardValue.SEVEN);
        PokerHand handWithGroupsOfOnepairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'S'),
                new Card(CardValue.JACK, 'D'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.NINE, 'H'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertTrue(three.match(handWithGroupsOfOnepairs));
    }

    @Test
    public void shouldReturnFalseThreeOfaKind() {
        ThreeofaKind three = new ThreeofaKind(CardValue.JACK, CardValue.SEVEN);
        PokerHand handWithGroupsOfOnepairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'S'),
                new Card(CardValue.JACK, 'D'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.SEVEN, 'H'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertFalse(three.match(handWithGroupsOfOnepairs));
    }

    @Test
    public void shouldReturnTrueFourOfaKind() {
        FourofaKind four = new FourofaKind(CardValue.JACK, CardValue.SEVEN);
        PokerHand handWithGroupsOfOnepairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'S'),
                new Card(CardValue.JACK, 'D'),
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.SEVEN, 'H'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertTrue(four.match(handWithGroupsOfOnepairs));
    }

    @Test
    public void shouldReturnFalseFourOfaKind() {
        FourofaKind four = new FourofaKind(CardValue.JACK, CardValue.EIGHT);
        PokerHand handWithGroupsOfOnepairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'S'),
                new Card(CardValue.EIGHT, 'S'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.NINE, 'H'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertFalse(four.match(handWithGroupsOfOnepairs));
    }
}
