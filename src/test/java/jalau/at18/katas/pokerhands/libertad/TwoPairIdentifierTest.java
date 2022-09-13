package jalau.at18.katas.pokerhands.libertad;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
public class TwoPairIdentifierTest {
    @Test
    public void shouldIdentifyTwoPair() {
        TwoPairIdentifier identifier = new TwoPairIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.TWO, 'H'));
        input.add(new Card(CardValue.FOUR, 'C'));
        input.add(new Card(CardValue.FOUR, 'S'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand twoPairWithDiferentSuit = new PokerHand(input);
        assertTrue(identifier.identify(twoPairWithDiferentSuit));

        List<Card> input2 = new LinkedList<>();
        input2.add(new Card(CardValue.TWO, 'C'));
        input2.add(new Card(CardValue.TWO, 'H'));
        input2.add(new Card(CardValue.ACE, 'C'));
        input2.add(new Card(CardValue.FOUR, 'C'));
        input2.add(new Card(CardValue.FOUR, 'S'));
        PokerHand twoPairHand = new PokerHand(input2);
        assertTrue(identifier.identify(twoPairHand));
        
        List<Card> input3 = new LinkedList<>();
        input3.add(new Card(CardValue.THREE, 'C'));
        input3.add(new Card(CardValue.THREE, 'C'));
        input3.add(new Card(CardValue.FIVE, 'C'));
        input3.add(new Card(CardValue.FIVE, 'C'));
        input3.add(new Card(CardValue.SEVEN, 'C'));
        PokerHand sameSuite = new PokerHand(input3);
        assertTrue(identifier.identify(sameSuite));
    }

    @Test
    public void shouldIdentifyWhenAintTwoPair() {
        TwoPairIdentifier identifier = new TwoPairIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.TWO, 'H'));
        input.add(new Card(CardValue.TWO, 'D'));
        input.add(new Card(CardValue.FIVE, 'S'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand threeGroupSize = new PokerHand(input);
        assertFalse(identifier.identify(threeGroupSize));

        List<Card> input2 = new LinkedList<>();
        input2.add(new Card(CardValue.TWO, 'C'));
        input2.add(new Card(CardValue.TWO, 'C'));
        input2.add(new Card(CardValue.FIVE, 'C'));
        input2.add(new Card(CardValue.FIVE, 'C'));
        input2.add(new Card(CardValue.FIVE, 'C'));
        PokerHand noTwoPairHand = new PokerHand(input2);
        assertFalse(identifier.identify(noTwoPairHand));
    }
}
