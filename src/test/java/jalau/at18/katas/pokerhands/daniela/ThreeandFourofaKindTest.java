package jalau.at18.katas.pokerhands.daniela;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThreeandFourofaKindTest {
    @Test
    public void shouldReturnTrueThreeOfaKind() {
        ThreeofaKindIdentifier three = new ThreeofaKindIdentifier();
        PokerHand handWithGroupsOfOnepairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'S'),
                new Card(CardValue.JACK, 'D'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.NINE, 'H'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertTrue(three.identify(handWithGroupsOfOnepairs));
    }

    @Test
    public void shouldReturnFalseThreeOfaKind() {
        ThreeofaKindIdentifier three = new ThreeofaKindIdentifier();
        PokerHand handWithGroupsOfOnepairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'S'),
                new Card(CardValue.JACK, 'D'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.SEVEN, 'H'),
        });
        // Twopairidentifier twopairs = new Twopairidentifier();
        assertFalse(three.identify(handWithGroupsOfOnepairs));
    }

    @Test
    public void shouldReturnTrueFourOfaKind() {
        FourodaKindIdentifier four = new FourodaKindIdentifier();
        PokerHand handWithGroupsOfOnepairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'S'),
                new Card(CardValue.JACK, 'D'),
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.SEVEN, 'H'),
        });
        assertTrue(four.identify(handWithGroupsOfOnepairs));
    }

    @Test
    public void shouldReturnFalseFourOfaKind() {
        FourodaKindIdentifier four = new FourodaKindIdentifier();
        PokerHand handWithGroupsOfOnepairs = new PokerHand(new Card[] {
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.JACK, 'S'),
                new Card(CardValue.EIGHT, 'S'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.NINE, 'H'),
        });
        assertFalse(four.identify(handWithGroupsOfOnepairs));
    }
}
