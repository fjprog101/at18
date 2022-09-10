package jalau.at18.katas.pokerhands.alvaro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {

    @Test
    public void shouldHaveSuitAndValue() {
        Card card = new Card(CardValue.TWO, 'C');
        assertEquals(CardValue.TWO, card.getValue());
        assertEquals('C', card.getSuit());
        assertEquals(2, CardValue.TWO.getValue());

        Card jackOfHearts = new Card(CardValue.JACK, 'H');
        assertEquals(CardValue.JACK, jackOfHearts.getValue());
        assertEquals('H', jackOfHearts.getSuit());
        assertEquals(11, CardValue.JACK.getValue());


    }
}
