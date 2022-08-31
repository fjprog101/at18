package jalau.at18.katas.pokerhands.joseg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {

    @Test
    public void shouldHaveSuitAndValue() {
        Card card = new Card(2, 'C');
        assertEquals(2, card.getValue());
        assertEquals('C', card.getSuit());
    }
}
