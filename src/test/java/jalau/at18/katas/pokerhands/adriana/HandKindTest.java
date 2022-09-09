package jalau.at18.katas.pokerhands.adriana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandKindTest {
    @Test
    public void shouldReturnTheRankOfTheHAndKind() {
        assertEquals(0, HandKind.PAIR.ordinal());
        assertEquals(1, HandKind.TWO_PAIRS.ordinal());
        assertEquals(2, HandKind.THREE_EQUALS.ordinal());
        assertEquals(3, HandKind.STRAIGHT.ordinal());
        assertEquals(4, HandKind.FLUSH.ordinal());
        assertEquals(5, HandKind.FULL_HOUSE.ordinal());
        assertEquals(6, HandKind.FOUR_EQUALS.ordinal());
        assertEquals(7, HandKind.STRAIGHT_FLUSH.ordinal());
    }
}
