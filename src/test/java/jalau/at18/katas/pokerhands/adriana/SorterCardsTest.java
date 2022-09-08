package jalau.at18.katas.pokerhands.adriana;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class SorterCardsTest {
    @Test
    public void shouldReturnArragedCardsArray () {
        Card[] untidyCards = new Card[]{
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.TWO, 'S'),
        };
        SorterCards sorter = new SorterCards();
        Card[] expectedCards = new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.ACE, 'S'),
        };
        assertEquals(expectedCards[0].getValue(), sorter.sortCards(untidyCards)[0].getValue());
        assertEquals(expectedCards[0].getSuit(), sorter.sortCards(untidyCards)[0].getSuit());
        assertEquals(expectedCards[1].getValue(), sorter.sortCards(untidyCards)[1].getValue());
        assertEquals(expectedCards[1].getSuit(), sorter.sortCards(untidyCards)[1].getSuit());
        assertEquals(expectedCards[2].getValue(), sorter.sortCards(untidyCards)[2].getValue());
        assertEquals(expectedCards[2].getSuit(), sorter.sortCards(untidyCards)[2].getSuit());
        assertEquals(expectedCards[3].getValue(), sorter.sortCards(untidyCards)[3].getValue());
        assertEquals(expectedCards[3].getSuit(), sorter.sortCards(untidyCards)[3].getSuit());
        assertEquals(expectedCards[4].getValue(), sorter.sortCards(untidyCards)[4].getValue());
        assertEquals(expectedCards[4].getSuit(), sorter.sortCards(untidyCards)[4].getSuit());

        Card[] untidyCards1 = new Card[]{
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.TWO, 'S'),
        };
        Card[] expectedCards1 = new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.JACK, 'C'),
        };
        assertEquals(expectedCards1[0].getValue(), sorter.sortCards(untidyCards1)[0].getValue());
        assertEquals(expectedCards1[0].getSuit(), sorter.sortCards(untidyCards1)[0].getSuit());
        assertEquals(expectedCards1[1].getValue(), sorter.sortCards(untidyCards1)[1].getValue());
        assertEquals(expectedCards1[1].getSuit(), sorter.sortCards(untidyCards1)[1].getSuit());
        assertEquals(expectedCards1[2].getValue(), sorter.sortCards(untidyCards1)[2].getValue());
        assertEquals(expectedCards1[2].getSuit(), sorter.sortCards(untidyCards1)[2].getSuit());
        assertEquals(expectedCards1[3].getValue(), sorter.sortCards(untidyCards1)[3].getValue());
        assertEquals(expectedCards1[3].getSuit(), sorter.sortCards(untidyCards1)[3].getSuit());
        assertEquals(expectedCards1[4].getValue(), sorter.sortCards(untidyCards1)[4].getValue());
        assertEquals(expectedCards1[4].getSuit(), sorter.sortCards(untidyCards1)[4].getSuit());

        Card[] untidyCards2 = new Card[]{
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.TEN, 'C'),
            new Card(CardValue.KING, 'C'),
            new Card(CardValue.QUEEN, 'C'),
        };
        Card[] expectedCards2 = new Card[]{
            new Card(CardValue.TEN, 'C'),
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.QUEEN, 'C'),
            new Card(CardValue.KING, 'C'),
            new Card(CardValue.ACE, 'C'),
        };
        assertEquals(expectedCards2[0].getValue(), sorter.sortCards(untidyCards2)[0].getValue());
        assertEquals(expectedCards2[1].getValue(), sorter.sortCards(untidyCards2)[1].getValue());
        assertEquals(expectedCards2[2].getValue(), sorter.sortCards(untidyCards2)[2].getValue());
        assertEquals(expectedCards2[3].getValue(), sorter.sortCards(untidyCards2)[3].getValue());
        assertEquals(expectedCards2[4].getValue(), sorter.sortCards(untidyCards2)[4].getValue());
    }
    @Test
    public void shouldPutCardsInArray () {
        Card[] untidyCards = new Card[]{
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.TWO, 'S'),
        };
        SorterCards sorter = new SorterCards();
        ArrayList<Card> arrayCards = new ArrayList<Card>();

        ArrayList<Card> expectedArrayCards = new ArrayList<Card>();
        expectedArrayCards.add(new Card(CardValue.JACK, 'C'));
        expectedArrayCards.add(new Card(CardValue.SIX, 'D'));
        expectedArrayCards.add(new Card(CardValue.FOUR, 'H'));
        expectedArrayCards.add(new Card(CardValue.ACE, 'S'));
        expectedArrayCards.add(new Card(CardValue.TWO, 'S'));

        assertEquals(expectedArrayCards.get(0).getValue(), sorter.initArray(arrayCards, untidyCards).get(0).getValue());
        assertEquals(expectedArrayCards.get(0).getSuit(), sorter.initArray(arrayCards, untidyCards).get(0).getSuit());
        assertEquals(expectedArrayCards.get(4).getValue(), sorter.initArray(arrayCards, untidyCards).get(4).getValue());
        assertEquals(expectedArrayCards.get(4).getSuit(), sorter.initArray(arrayCards, untidyCards).get(4).getSuit());
    }
}