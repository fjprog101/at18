package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class FourOfAKindIdentifierTest {

    @Test
    public void identifyWhenExistFourOfAKindHand() {
        FourOfAKindIdentifier identifier = new FourOfAKindIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand FourOfAKindHand = new PokerHand(input);
        assertTrue(identifier.identify(FourOfAKindHand));

        List<Card> input2 = new LinkedList<>();
        input2.add(new Card(CardValue.SIX, 'C'));
        input2.add(new Card(CardValue.SIX, 'S'));
        input2.add(new Card(CardValue.SIX, 'D'));
        input2.add(new Card(CardValue.TWO, 'C'));
        input2.add(new Card(CardValue.SIX, 'H'));
        PokerHand fourOfAKindWithDiferentSuit = new PokerHand(input2);
        assertTrue(identifier.identify(fourOfAKindWithDiferentSuit));
    }
    @Test
    public void identifyWhenDontExistFourOfAKindHand() {
        FourOfAKindIdentifier identifier = new FourOfAKindIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.TWO, 'H'));
        input.add(new Card(CardValue.TWO, 'D'));
        input.add(new Card(CardValue.SIX, 'S'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand FourOfAKindHand = new PokerHand(input);
        assertFalse(identifier.identify(FourOfAKindHand));

        List<Card> input2 = new LinkedList<>();
        input2.add(new Card(CardValue.THREE, 'C'));
        input2.add(new Card(CardValue.THREE, 'H'));
        input2.add(new Card(CardValue.THREE, 'D'));
        input2.add(new Card(CardValue.FIVE, 'S'));
        input2.add(new Card(CardValue.FIVE, 'C'));
        PokerHand diferentsValues = new PokerHand(input2);
        assertFalse(identifier.identify(diferentsValues));

        List<Card> input3 = new LinkedList<>();
        input3.add(new Card(CardValue.THREE, 'C'));
        input3.add(new Card(CardValue.THREE, 'H'));
        input3.add(new Card(CardValue.THREE, 'D'));
        input3.add(new Card(CardValue.THREE, 'S'));
        input3.add(new Card(CardValue.THREE, 'C'));
        PokerHand noFourOfAKindHand = new PokerHand(input3);
        assertFalse(identifier.identify(noFourOfAKindHand));

        List<Card> input4 = new LinkedList<>();
        input4.add(new Card(CardValue.SEVEN, 'C'));
        input4.add(new Card(CardValue.ACE, 'H'));
        input4.add(new Card(CardValue.TWO, 'D'));
        input4.add(new Card(CardValue.THREE, 'S'));
        input4.add(new Card(CardValue.SIX, 'C'));
        PokerHand pokerHand = new PokerHand(input4);
        assertFalse(identifier.identify(pokerHand));
    }
}
