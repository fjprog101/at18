package jalau.at18.katas.pokerhands.adriana;

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

    @Test
    public void shouldReturnIntegerCardValue() {
        assertEquals(2, CardValue.TWO.get());
        assertEquals(3, CardValue.THREE.get());
        assertEquals(4, CardValue.FOUR.get());
        assertEquals(5, CardValue.FIVE.get());
        assertEquals(6, CardValue.SIX.get());
        assertEquals(7, CardValue.SEVEN.get());
        assertEquals(8, CardValue.EIGHT.get());
        assertEquals(9, CardValue.NINE.get());
        assertEquals(10, CardValue.TEN.get());
        assertEquals(11, CardValue.JACK.get());
        assertEquals(12, CardValue.QUEEN.get());
        assertEquals(13, CardValue.KING.get());
        assertEquals(14, CardValue.ACE.get());
    }
}
