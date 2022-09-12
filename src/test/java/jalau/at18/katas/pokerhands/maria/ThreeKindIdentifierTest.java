package jalau.at18.katas.pokerhands.maria;

import jalau.at18.katas.pokerhands.maria.Identifier.ThreeKindIdentifier;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeKindIdentifierTest {
    @Test
    public void shouldIdentifyThreeKindCardsHand() {
        ThreeKindIdentifier identifier = new ThreeKindIdentifier();

        PokerHand threeKindHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.THREE, 'S'),
                new Card(CardValue.FOUR, 'S'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.TWO, 'H'),
        });
        assertTrue(identifier.identify(threeKindHand));
    }

    @Test
    public void shouldNotFourCardsHand() {
        ThreeKindIdentifier identifier = new ThreeKindIdentifier();

        PokerHand fourKindHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.THREE, 'S'),
                new Card(CardValue.TWO, 'S'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.TWO, 'H'),
        });
        assertFalse(identifier.identify(fourKindHand));
    }

    @Test
    public void shouldNotPairCardsHand() {
        ThreeKindIdentifier identifier = new ThreeKindIdentifier();

        PokerHand fourKindHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.THREE, 'S'),
                new Card(CardValue.FIVE, 'S'),
                new Card(CardValue.SEVEN, 'D'),
                new Card(CardValue.TWO, 'H'),
        });
        assertFalse(identifier.identify(fourKindHand));
    }

    @Test
    public void shouldGetThreeKindRank() {
        ThreeKindIdentifier identifier = new ThreeKindIdentifier();

        PokerHand threeKindHand = new PokerHand(new Card[]{
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.TEN, 'S'),
                new Card(CardValue.TEN, 'D'),
                new Card(CardValue.SEVEN, 'H'),
                new Card(CardValue.TEN, 'H'),
        });
        assertEquals(CardValue.TEN, identifier.getRank(threeKindHand).getListCardValue().get(0));
    }
}
