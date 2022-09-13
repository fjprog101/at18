package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class FullHouseTest {
    @Test
    public void identifyWhenAintExistFullHouseHand() {
        FullHouseIdentifier identifier = new FullHouseIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.TWO, 'H'));
        input.add(new Card(CardValue.TWO, 'D'));
        input.add(new Card(CardValue.ACE, 'S'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand FullHouseHand = new PokerHand(input);
        assertFalse(identifier.identify(FullHouseHand));

        List<Card> input2 = new LinkedList<>();
        input2.add(new Card(CardValue.TWO, 'C'));
        input2.add(new Card(CardValue.TWO, 'H'));
        input2.add(new Card(CardValue.TWO, 'D'));
        input2.add(new Card(CardValue.TWO, 'S'));
        input2.add(new Card(CardValue.SIX, 'C'));
        PokerHand twoGroupHand = new PokerHand(input2);
        assertFalse(identifier.identify(twoGroupHand));
        
        List<Card> input3 = new LinkedList<>();
        input3.add(new Card(CardValue.FOUR, 'C'));
        input3.add(new Card(CardValue.EIGHT, 'H'));
        input3.add(new Card(CardValue.KING, 'D'));
        input3.add(new Card(CardValue.TWO, 'S'));
        input3.add(new Card(CardValue.SIX, 'C'));
        PokerHand allDiferrentCardsHand = new PokerHand(input3);
        assertFalse(identifier.identify(allDiferrentCardsHand));
    }
    @Test
    public void identifyWhenExistFullHouseHand() {
        FullHouseIdentifier identifier = new FullHouseIdentifier();
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.TWO, 'H'));
        input.add(new Card(CardValue.TWO, 'D'));
        input.add(new Card(CardValue.SIX, 'S'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand fullHouseHand = new PokerHand(input);
        assertTrue(identifier.identify(fullHouseHand));
    }
}
