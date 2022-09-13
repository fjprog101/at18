package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class CardValuesCounterTest {

    @Test
    public void shouldCountValues1PerValue() {
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.THREE, 'D'));
        input.add(new Card(CardValue.FOUR, 'H'));
        input.add(new Card(CardValue.FIVE, 'S'));
        input.add(new Card(CardValue.SIX, 'S'));

        PokerHand handWith1CardPerValue = new PokerHand(input);

        CardValuesCounter counter = new CardValuesCounter(handWith1CardPerValue);
        CardValuesCount count = counter.getCount();
        assertEquals(5, count.getGroupSize());
        assertEquals(1, count.get(CardValue.TWO));
        assertEquals(1, count.get(CardValue.THREE));
        assertEquals(1, count.get(CardValue.FOUR));
        assertEquals(1, count.get(CardValue.FIVE));
        assertEquals(1, count.get(CardValue.SIX));
    }

    @Test
    public void shouldCountValuesFor2And3OfSameValue() {
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.JACK, 'C'));
        input.add(new Card(CardValue.JACK, 'D'));
        input.add(new Card(CardValue.SEVEN, 'H'));
        input.add(new Card(CardValue.SEVEN, 'S'));
        input.add(new Card(CardValue.SEVEN, 'C'));
        
        PokerHand handWithGroupsOf2And3 = new PokerHand(input);

        CardValuesCounter counter = new CardValuesCounter(handWithGroupsOf2And3);
        CardValuesCount count = counter.getCount();
        assertEquals(2, count.getGroupSize());
        assertEquals(2, count.get(CardValue.JACK));
        assertEquals(3, count.get(CardValue.SEVEN));
    }
}
