package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class FlushIdentifierTest {

    @Test
    public void shouldIdentifyFlushHand() {
        FlushIdentifier identifier = new FlushIdentifier();

        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.THREE, 'C'));
        input.add(new Card(CardValue.FOUR, 'C'));
        input.add(new Card(CardValue.FIVE, 'C'));
        input.add(new Card(CardValue.SIX, 'C'));

        PokerHand FlushHand = new PokerHand(input);
        assertTrue(identifier.identify(FlushHand));
        
        List<Card> input2 = new LinkedList<>();
        input2.add(new Card(CardValue.THREE, 'C'));
        input2.add(new Card(CardValue.FOUR, 'C'));
        input2.add(new Card(CardValue.FIVE, 'H'));
        input2.add(new Card(CardValue.SIX, 'C'));
        input2.add(new Card(CardValue.SEVEN, 'C'));

        PokerHand noSameSuite = new PokerHand(input2);
        assertFalse(identifier.identify(noSameSuite));
    }
}
