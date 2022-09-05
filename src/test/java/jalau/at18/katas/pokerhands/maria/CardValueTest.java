package jalau.at18.katas.pokerhands.maria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardValueTest {

    @Test
    public void shouldReturnNextCardInOrderByValue() {
        assertEquals(CardValue.THREE, CardValue.TWO.next());
        assertEquals(CardValue.FOUR, CardValue.THREE.next());
        assertEquals(CardValue.FIVE, CardValue.FOUR.next());
        assertEquals(CardValue.SIX, CardValue.FIVE.next());
        assertEquals(CardValue.SEVEN, CardValue.SIX.next());
        assertEquals(CardValue.EIGHT, CardValue.SEVEN.next());
        assertEquals(CardValue.NINE, CardValue.EIGHT.next());
        assertEquals(CardValue.TEN, CardValue.NINE.next());
        assertEquals(CardValue.JACK, CardValue.TEN.next());
        assertEquals(CardValue.QUEEN, CardValue.JACK.next());
        assertEquals(CardValue.KING, CardValue.QUEEN.next());
        assertEquals(CardValue.ACE, CardValue.KING.next());
        assertEquals(null, CardValue.ACE.next());
    }
}
