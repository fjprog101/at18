package jalau.at18.katas.pokerhands.roberto;

import jalau.at18.katas.pokerhands.joseg.CardValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardValueTest {

    @Test
    public void shouldReturnNextCardInOrderByValue() {
        assertEquals(jalau.at18.katas.pokerhands.joseg.CardValue.THREE, jalau.at18.katas.pokerhands.joseg.CardValue.TWO.next());
        assertEquals(jalau.at18.katas.pokerhands.joseg.CardValue.FOUR, jalau.at18.katas.pokerhands.joseg.CardValue.THREE.next());
        assertEquals(jalau.at18.katas.pokerhands.joseg.CardValue.FIVE, jalau.at18.katas.pokerhands.joseg.CardValue.FOUR.next());
        assertEquals(jalau.at18.katas.pokerhands.joseg.CardValue.SIX, jalau.at18.katas.pokerhands.joseg.CardValue.FIVE.next());
        assertEquals(jalau.at18.katas.pokerhands.joseg.CardValue.SEVEN, jalau.at18.katas.pokerhands.joseg.CardValue.SIX.next());
        assertEquals(jalau.at18.katas.pokerhands.joseg.CardValue.EIGHT, jalau.at18.katas.pokerhands.joseg.CardValue.SEVEN.next());
        assertEquals(jalau.at18.katas.pokerhands.joseg.CardValue.NINE, jalau.at18.katas.pokerhands.joseg.CardValue.EIGHT.next());
        assertEquals(jalau.at18.katas.pokerhands.joseg.CardValue.TEN, jalau.at18.katas.pokerhands.joseg.CardValue.NINE.next());
        assertEquals(jalau.at18.katas.pokerhands.joseg.CardValue.JACK, jalau.at18.katas.pokerhands.joseg.CardValue.TEN.next());
        assertEquals(jalau.at18.katas.pokerhands.joseg.CardValue.QUEEN, jalau.at18.katas.pokerhands.joseg.CardValue.JACK.next());
        assertEquals(jalau.at18.katas.pokerhands.joseg.CardValue.KING, jalau.at18.katas.pokerhands.joseg.CardValue.QUEEN.next());
        assertEquals(jalau.at18.katas.pokerhands.joseg.CardValue.ACE, jalau.at18.katas.pokerhands.joseg.CardValue.KING.next());
        assertEquals(null, CardValue.ACE.next());
    }
}
