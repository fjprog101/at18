package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class PairTest {
    @Test
    public void identifyWhenExistPairHand() {
        PairIdentifier identifier = new PairIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.TWO, 'H'));
        input.add(new Card(CardValue.FIVE, 'D'));
        input.add(new Card(CardValue.ACE, 'S'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand PairHand = new PokerHand(input);
        assertTrue(identifier.identify(PairHand));
    }
    @Test
    public void identifyWhenPairHandHasSameSuit() {
        PairIdentifier identifier = new PairIdentifier();
        List<Card> input2 = new LinkedList<>();
        input2.add(new Card(CardValue.TWO, 'C'));
        input2.add(new Card(CardValue.FIVE, 'H'));
        input2.add(new Card(CardValue.FIVE, 'D'));
        input2.add(new Card(CardValue.ACE, 'S'));
        input2.add(new Card(CardValue.SIX, 'C'));
        PokerHand PairHand = new PokerHand(input2);
        assertTrue(identifier.identify(PairHand));
    }
    @Test
    public void identifyWhenDontExistPairHand() {
        PairIdentifier identifier = new PairIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.TWO, 'H'));
        input.add(new Card(CardValue.NINE, 'D'));
        input.add(new Card(CardValue.SIX, 'S'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand PairHand = new PokerHand(input);
        assertFalse(identifier.identify(PairHand));
    }
    @Test
    public void identifyWhenHaveAllDiferentHand() {
        PairIdentifier identifier = new PairIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.FIVE, 'H'));
        input.add(new Card(CardValue.NINE, 'D'));
        input.add(new Card(CardValue.FOUR, 'S'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand PairHand = new PokerHand(input);
        assertFalse(identifier.identify(PairHand));
    }
}
