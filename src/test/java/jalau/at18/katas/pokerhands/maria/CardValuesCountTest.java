package jalau.at18.katas.pokerhands.maria;

import jalau.at18.katas.pokerhands.joseg.CardValue;
import jalau.at18.katas.pokerhands.joseg.CardValuesCount;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardValuesCountTest {

    @Test
    public void shouldHaveCountsPerCardValue() {
        jalau.at18.katas.pokerhands.joseg.CardValuesCount count = new jalau.at18.katas.pokerhands.joseg.CardValuesCount();
        count.add(jalau.at18.katas.pokerhands.joseg.CardValue.ACE);
        count.add(jalau.at18.katas.pokerhands.joseg.CardValue.JACK);
        count.add(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE);

        assertEquals(1, count.get(jalau.at18.katas.pokerhands.joseg.CardValue.ACE));
        assertEquals(1, count.get(jalau.at18.katas.pokerhands.joseg.CardValue.JACK));
        assertEquals(1, count.get(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE));
    }

    @Test
    public void shouldIncrementCountForExistingCardValue() {
        jalau.at18.katas.pokerhands.joseg.CardValuesCount count = new jalau.at18.katas.pokerhands.joseg.CardValuesCount();
        count.add(jalau.at18.katas.pokerhands.joseg.CardValue.ACE);
        count.add(jalau.at18.katas.pokerhands.joseg.CardValue.ACE);
        count.add(jalau.at18.katas.pokerhands.joseg.CardValue.ACE);
        count.add(jalau.at18.katas.pokerhands.joseg.CardValue.JACK);
        count.add(jalau.at18.katas.pokerhands.joseg.CardValue.JACK);

        assertEquals(3, count.get(jalau.at18.katas.pokerhands.joseg.CardValue.ACE));
        assertEquals(2, count.get(jalau.at18.katas.pokerhands.joseg.CardValue.JACK));
    }

    @Test
    public void shouldSayIfACountExists() {
        jalau.at18.katas.pokerhands.joseg.CardValuesCount count = new CardValuesCount();
        count.add(jalau.at18.katas.pokerhands.joseg.CardValue.ACE);
        count.add(jalau.at18.katas.pokerhands.joseg.CardValue.ACE);
        count.add(jalau.at18.katas.pokerhands.joseg.CardValue.ACE);
        count.add(jalau.at18.katas.pokerhands.joseg.CardValue.JACK);
        count.add(CardValue.JACK);

        assertTrue(count.exists(3));
        assertTrue(count.exists(2));

        assertFalse(count.exists(1));
        assertFalse(count.exists(4));
        assertFalse(count.exists(5));
    }
}
