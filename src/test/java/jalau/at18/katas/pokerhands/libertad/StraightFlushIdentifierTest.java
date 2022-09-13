package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class StraightFlushIdentifierTest {

    @Test
    public void shouldIdentifyStraightFlushHand() {
        StraightFlushIdentifier identifier = new StraightFlushIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.THREE, 'C'));
        input.add(new Card(CardValue.FOUR, 'C'));
        input.add(new Card(CardValue.FIVE, 'C'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand straightFlushHand = new PokerHand(input);
        assertTrue(identifier.identify(straightFlushHand));
    }

    @Test
    public void shouldIdentifyNOStraightFlushHand() {
        StraightFlushIdentifier identifier = new StraightFlushIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.FOUR, 'C'));
        input.add(new Card(CardValue.FIVE, 'C'));
        input.add(new Card(CardValue.FIVE, 'C'));
        input.add(new Card(CardValue.SEVEN, 'C'));
        PokerHand noConsecutiveValues = new PokerHand(input);
        assertFalse(identifier.identify(noConsecutiveValues));

        List<Card> input2 = new LinkedList<>();
        input2.add(new Card(CardValue.THREE, 'C'));
        input2.add(new Card(CardValue.FOUR, 'S'));
        input2.add(new Card(CardValue.FIVE, 'H'));
        input2.add(new Card(CardValue.SIX, 'D'));
        input2.add(new Card(CardValue.SEVEN, 'C'));
        PokerHand noSameSuite = new PokerHand(input2);
        assertFalse(identifier.identify(noSameSuite));
    }
}
