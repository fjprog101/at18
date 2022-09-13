package jalau.at18.katas.pokerhands.maria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    @Test
    public void shouldInvertDataMapACE() {
        CardValuesCount count = new CardValuesCount();
        count.add(CardValue.ACE);
        count.add(CardValue.ACE);
        count.add(CardValue.ACE);
        count.add(CardValue.ACE);
        count.add(CardValue.FIVE);
        CardValueGroup cardValuesGroup = count.getCardValuesGroup();
        assertEquals(CardValue.ACE, cardValuesGroup.getCardValues(4).get(0));
    }

    @Test
    public void shouldInvertDataMapFourKind() {
        CardValuesCount count = new CardValuesCount();
        count.add(CardValue.THREE);
        count.add(CardValue.SIX);
        count.add(CardValue.THREE);
        count.add(CardValue.THREE);
        count.add(CardValue.THREE);
        CardValueGroup cardValuesGroup = count.getCardValuesGroup();
        assertEquals(CardValue.THREE, cardValuesGroup.getCardValues(4).get(0));
    }

    @Test
    public void shouldInvertDataMapPair() {
        CardValuesCount count = new CardValuesCount();
        count.add(CardValue.NINE);
        count.add(CardValue.SIX);
        count.add(CardValue.FOUR);
        count.add(CardValue.SEVEN);
        count.add(CardValue.NINE);
        CardValueGroup cardValuesGroup = count.getCardValuesGroup();
        assertEquals(CardValue.NINE, cardValuesGroup.getCardValues(2).get(0));
    }

    @Test
    public void shouldInvertDataMapTwoPair() {
        CardValuesCount count = new CardValuesCount();
        count.add(CardValue.NINE);
        count.add(CardValue.SIX);
        count.add(CardValue.FOUR);
        count.add(CardValue.SIX);
        count.add(CardValue.NINE);
        CardValueGroup cardValuesGroup = count.getCardValuesGroup();
        List<CardValue> listCardValue = new ArrayList<CardValue>(Arrays.asList(CardValue.NINE, CardValue.SIX));
        List<CardValue> currentCardValues = cardValuesGroup.getCardValues (2);
        Collections.sort(currentCardValues);
        assertEquals(listCardValue, currentCardValues);
    }

}
