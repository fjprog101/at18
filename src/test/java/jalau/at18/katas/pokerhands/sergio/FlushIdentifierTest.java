package jalau.at18.katas.pokerhands.sergio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FlushIdentifierTest {

    @Test
    public void shouldIdentifyFlushHand() {
        FlushIdentifier identifier = new FlushIdentifier();

        PokerHand flushHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.NINE, 'C'),
            new Card(CardValue.QUEEN, 'C'), });
        assertTrue(identifier.identify(flushHand));

        PokerHand flushWithConsecutiveValues = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'), });

        assertFalse(identifier.identify(flushWithConsecutiveValues));
        PokerHand noSameSuite = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.EIGHT, 'H'),
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.ACE, 'S'), });
        assertFalse(identifier.identify(noSameSuite));
    }
}