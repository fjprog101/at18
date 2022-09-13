package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertArrayEquals;

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
        List<Card> expList = new LinkedList<>();
        expList.add(new Card(CardValue.TWO, 'C'));
        expList.add(new Card(CardValue.SIX, 'C'));
        expList.add(new Card(CardValue.SEVEN, 'S'));
        expList.add(new Card(CardValue.EIGHT, 'D'));
        expList.add(new Card(CardValue.ACE, 'H'));
        //assertArrayEquals(expList.toArray(), allDiferentCardsHand.getCards().toArray());
    }
}
