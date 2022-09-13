package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class HighCardTest {
    @Test
    public void identifyWhenExistHighCardHand() {
        HighCardIdentifier identifier = new HighCardIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.QUEEN, 'H'));
        input.add(new Card(CardValue.FIVE, 'D'));
        input.add(new Card(CardValue.ACE, 'S'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand HighCardHand = new PokerHand(input);
        assertTrue(identifier.identify(HighCardHand));
    }
    @Test
    public void identifyWhenDontExistHighCardHand() {
        HighCardIdentifier identifier = new HighCardIdentifier();
        List<Card> input2 = new LinkedList<>();
        input2.add(new Card(CardValue.JACK, 'C'));
        input2.add(new Card(CardValue.TWO, 'H'));
        input2.add(new Card(CardValue.NINE, 'D'));
        input2.add(new Card(CardValue.SIX, 'S'));
        input2.add(new Card(CardValue.SIX, 'C'));
        PokerHand HighCardHand = new PokerHand(input2);
        assertFalse(identifier.identify(HighCardHand));
    }
}
