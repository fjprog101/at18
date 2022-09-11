package jalau.at18.katas.pokerhands.sergio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThreeOfKindIdentifierTest {
    @Test
    public void shouldIdentifyThreeOfKindHand() {
        ThreeOfKindIdentifier identifier = new ThreeOfKindIdentifier();

        PokerHand threeOfKindHand = new PokerHand(new Card[]{
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SEVEN, 'S'),
            new Card(CardValue.JACK, 'C'), });
        assertTrue(identifier.match(threeOfKindHand));
        PokerHand pokerHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SEVEN, 'C'), });
        assertFalse(identifier.match(pokerHand));
        PokerHand fullHouseHand = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SIX, 'C'), });
        assertFalse(identifier.match(fullHouseHand));
    }
}