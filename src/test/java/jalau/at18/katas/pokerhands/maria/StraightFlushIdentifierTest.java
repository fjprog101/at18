package jalau.at18.katas.pokerhands.maria;

import jalau.at18.katas.pokerhands.joseg.Card;
import jalau.at18.katas.pokerhands.joseg.CardValue;
import jalau.at18.katas.pokerhands.joseg.PokerHand;
import jalau.at18.katas.pokerhands.joseg.StraightFlushIdentifier;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StraightFlushIdentifierTest {

    @Test
    public void shouldIdentifyStraightFlushHand() {
        jalau.at18.katas.pokerhands.joseg.StraightFlushIdentifier identifier = new StraightFlushIdentifier();

        jalau.at18.katas.pokerhands.joseg.PokerHand straightFlushHand = new jalau.at18.katas.pokerhands.joseg.PokerHand(new jalau.at18.katas.pokerhands.joseg.Card[]{
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.THREE, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FOUR, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(straightFlushHand));

        jalau.at18.katas.pokerhands.joseg.PokerHand noConsecutiveValues = new jalau.at18.katas.pokerhands.joseg.PokerHand(new jalau.at18.katas.pokerhands.joseg.Card[]{
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FOUR, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.SEVEN, 'C'),
        });

        assertFalse(identifier.identify(noConsecutiveValues));
        jalau.at18.katas.pokerhands.joseg.PokerHand noSameSuite = new PokerHand(new jalau.at18.katas.pokerhands.joseg.Card[]{
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.THREE, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FOUR, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE, 'H'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.SIX, 'C'),
            new Card(CardValue.SEVEN, 'C'),
        });
        assertFalse(identifier.identify(noSameSuite));
    }
}
