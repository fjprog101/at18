package jalau.at18.katas.pokerhands.mauricio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CardValuesCountTest {

    @Test
    public void shouldHaveCountsPerCardValue() {
        CardValuesCount count = new CardValuesCount();
        count.add(CardValue.ACE);
        count.add(CardValue.JACK);
        count.add(CardValue.FIVE);

        assertEquals(1, count.get(CardValue.ACE));
        assertEquals(1, count.get(CardValue.JACK));
        assertEquals(1, count.get(CardValue.FIVE));
    }

    @Test
    public void shouldIncrementCountForExistingCardValue() {
        CardValuesCount count = new CardValuesCount();
        count.add(CardValue.ACE);
        count.add(CardValue.ACE);
        count.add(CardValue.ACE);
        count.add(CardValue.JACK);
        count.add(CardValue.JACK);

        assertEquals(3, count.get(CardValue.ACE));
        assertEquals(2, count.get(CardValue.JACK));
    }

    @Test
    public void shouldSayIfACountExists() {
        CardValuesCount count = new CardValuesCount();
        count.add(CardValue.ACE);
        count.add(CardValue.ACE);
        count.add(CardValue.ACE);
        count.add(CardValue.JACK);
        count.add(CardValue.JACK);

        assertTrue(count.exists(3));
        assertTrue(count.exists(2));

        assertFalse(count.exists(1));
        assertFalse(count.exists(4));
        assertFalse(count.exists(5));
    }
}
