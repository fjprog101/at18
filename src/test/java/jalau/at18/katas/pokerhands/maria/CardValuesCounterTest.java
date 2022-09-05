package jalau.at18.katas.pokerhands.maria;

import jalau.at18.katas.pokerhands.joseg.Card;
import jalau.at18.katas.pokerhands.joseg.CardValue;
import jalau.at18.katas.pokerhands.joseg.CardValuesCount;
import jalau.at18.katas.pokerhands.joseg.CardValuesCounter;
import jalau.at18.katas.pokerhands.joseg.PokerHand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardValuesCounterTest {

    @Test
    public void shouldCountValues1PerValue() {
        jalau.at18.katas.pokerhands.joseg.PokerHand handWith1CardPerValue = new jalau.at18.katas.pokerhands.joseg.PokerHand(new jalau.at18.katas.pokerhands.joseg.Card[]{
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.THREE, 'D'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FOUR, 'H'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE, 'S'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.SIX, 'S'),
        });

        jalau.at18.katas.pokerhands.joseg.CardValuesCounter counter = new jalau.at18.katas.pokerhands.joseg.CardValuesCounter(handWith1CardPerValue);
        jalau.at18.katas.pokerhands.joseg.CardValuesCount count = counter.getCount();
        assertEquals(1, count.get(jalau.at18.katas.pokerhands.joseg.CardValue.TWO));
        assertEquals(1, count.get(jalau.at18.katas.pokerhands.joseg.CardValue.THREE));
        assertEquals(1, count.get(jalau.at18.katas.pokerhands.joseg.CardValue.FOUR));
        assertEquals(1, count.get(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE));
        assertEquals(1, count.get(jalau.at18.katas.pokerhands.joseg.CardValue.SIX));
    }

    @Test
    public void shouldCountValuesFor2And3OfSameValue() {
        jalau.at18.katas.pokerhands.joseg.PokerHand handWithGroupsOf2And3 = new PokerHand(new jalau.at18.katas.pokerhands.joseg.Card[]{
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.JACK, 'C'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.JACK, 'D'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.SEVEN, 'H'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.SEVEN, 'S'),
            new Card(jalau.at18.katas.pokerhands.joseg.CardValue.SEVEN, 'C'),
        });

        jalau.at18.katas.pokerhands.joseg.CardValuesCounter counter = new CardValuesCounter(handWithGroupsOf2And3);
        CardValuesCount count = counter.getCount();
        assertEquals(2, count.get(jalau.at18.katas.pokerhands.joseg.CardValue.JACK));
        assertEquals(3, count.get(CardValue.SEVEN));
    }
}
