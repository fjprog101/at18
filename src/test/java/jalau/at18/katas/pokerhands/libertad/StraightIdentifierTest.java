package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class StraightIdentifierTest {

    @Test
    public void shouldIdentifyStraightHand() {
        StraightIdentifier identifier = new StraightIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.THREE, 'C'));
        input.add(new Card(CardValue.FOUR, 'C'));
        input.add(new Card(CardValue.FIVE, 'C'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand consecutiveValues = new PokerHand(input);
        assertTrue(identifier.identify(consecutiveValues));
    }
    @Test
    public void shouldIdentifyWhenThereIsntStraightHand() {
        StraightIdentifier identifier = new StraightIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.FOUR, 'C'));
        input.add(new Card(CardValue.FIVE, 'C'));
        input.add(new Card(CardValue.FIVE, 'C'));
        input.add(new Card(CardValue.SEVEN, 'C'));
        PokerHand noConsecutiveValues = new PokerHand(input);
        assertFalse(identifier.identify(noConsecutiveValues));
    }
}
