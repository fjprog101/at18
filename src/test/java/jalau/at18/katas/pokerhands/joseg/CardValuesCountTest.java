package jalau.at18.katas.pokerhands.joseg;

import static org.junit.Assert.assertEquals;

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
}
