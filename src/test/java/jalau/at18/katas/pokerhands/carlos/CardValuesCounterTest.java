package jalau.at18.katas.pokerhands.carlos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.katas.pokerhands.carlos.Card;
import jalau.at18.katas.pokerhands.carlos.CardValue;
import jalau.at18.katas.pokerhands.carlos.CardValuesCount;
import jalau.at18.katas.pokerhands.carlos.CardValuesCounter;
import jalau.at18.katas.pokerhands.carlos.PokerHand;

public class CardValuesCounterTest {

    @Test
    public void shouldCountValues1PerValue() {
        PokerHand handWith1CardPerValue = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });

        CardValuesCounter counter = new CardValuesCounter(handWith1CardPerValue);
        CardValuesCount count = counter.getCount();
        assertEquals(1, count.get(CardValue.TWO));
        assertEquals(1, count.get(CardValue.THREE));
        assertEquals(1, count.get(CardValue.FOUR));
        assertEquals(1, count.get(CardValue.FIVE));
        assertEquals(1, count.get(CardValue.SIX));
    }

    @Test
    public void shouldCountValuesFor2And3OfSameValue() {
        PokerHand handWithGroupsOf2And3 = new PokerHand(new Card[]{
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.SEVEN, 'H'),
            new Card(CardValue.SEVEN, 'S'),
            new Card(CardValue.SEVEN, 'C'),
        });

        CardValuesCounter counter = new CardValuesCounter(handWithGroupsOf2And3);
        CardValuesCount count = counter.getCount();
        assertEquals(2, count.get(CardValue.JACK));
        assertEquals(3, count.get(CardValue.SEVEN));
    }
}
