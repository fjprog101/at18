package jalau.at18.katas.pokerhands.sergio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OnePairIdentifierTest {

    @Test
    public void shouldIdentifyOnePairsHand() {
        OnePairIdentifier identifier = new OnePairIdentifier();

        PokerHand onePairHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.JACK, 'C'), });
        assertTrue(identifier.identify(onePairHand));
        PokerHand twoPairsHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.JACK, 'C'), });
        assertFalse(identifier.identify(twoPairsHand));
        PokerHand PokerHand = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.SEVEN, 'C'), });
        assertFalse(identifier.identify(PokerHand));
    }
}
