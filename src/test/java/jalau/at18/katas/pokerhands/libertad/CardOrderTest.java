package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class CardOrderTest{
    @Test
    public void identifyWhenDontExistThreeOfAKindHand() {
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.ACE, 'H'));
        input.add(new Card(CardValue.EIGHT, 'D'));
        input.add(new Card(CardValue.SEVEN, 'S'));
        input.add(new Card(CardValue.SIX, 'C'));
        PokerHand allDiferentCardsHand = new PokerHand(input);

        assertTrue(allDiferentCardsHand.getCards().get(0).equals(new Card(CardValue.TWO, 'C')));
        assertTrue(allDiferentCardsHand.getCards().get(1).equals(new Card(CardValue.SIX, 'C')));
        assertTrue(allDiferentCardsHand.getCards().get(2).equals(new Card(CardValue.SEVEN, 'S')));
        assertTrue(allDiferentCardsHand.getCards().get(3).equals(new Card(CardValue.EIGHT, 'D')));
        assertTrue(allDiferentCardsHand.getCards().get(4).equals(new Card(CardValue.ACE, 'H')));
        
    }
}
