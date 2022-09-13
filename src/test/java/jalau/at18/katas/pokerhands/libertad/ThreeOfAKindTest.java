package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ThreeOfAKindTest {
    @Test
    public void identifyWhenExistThreeOfAKindHand() {
        ThreeOfAKindIdentifier identifier = new ThreeOfAKindIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.TWO, 'H'));
        input.add(new Card(CardValue.TWO, 'D'));
        input.add(new Card(CardValue.ACE, 'S'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand ThreeOfAKindHand = new PokerHand(input);
        assertTrue(identifier.identify(ThreeOfAKindHand));
    }
    @Test
    public void identifyWhenDontExistThreeOfAKindHand() {
        ThreeOfAKindIdentifier identifier = new ThreeOfAKindIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.TWO, 'H'));
        input.add(new Card(CardValue.NINE, 'D'));
        input.add(new Card(CardValue.SIX, 'S'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand ThreeOfAKindHand = new PokerHand(input);
        assertFalse(identifier.identify(ThreeOfAKindHand));

        List<Card> input2 = new LinkedList<>();
        input2.add(new Card(CardValue.TWO, 'C'));
        input2.add(new Card(CardValue.TWO, 'H'));
        input2.add(new Card(CardValue.TWO, 'D'));
        input2.add(new Card(CardValue.SIX, 'S'));
        input2.add(new Card(CardValue.SIX, 'C'));
        PokerHand hasTwoGroupHand = new PokerHand(input2);
        assertFalse(identifier.identify(hasTwoGroupHand));

        List<Card> input3 = new LinkedList<>();
        input3.add(new Card(CardValue.TWO, 'C'));
        input3.add(new Card(CardValue.ACE, 'H'));
        input3.add(new Card(CardValue.EIGHT, 'D'));
        input3.add(new Card(CardValue.SEVEN, 'S'));
        input3.add(new Card(CardValue.SIX, 'C'));
        PokerHand allDiferentCardsHand = new PokerHand(input3);
        assertFalse(identifier.identify(allDiferentCardsHand));
    }
}
