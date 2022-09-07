package jalau.at18.katas.pokerhands.roberto;

import jalau.at18.katas.pokerhands.joseg.Card;
import jalau.at18.katas.pokerhands.joseg.CardValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    @Test
    public void shouldHaveSuitAndValue() {
        jalau.at18.katas.pokerhands.joseg.Card card = new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'C');
        assertEquals(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, card.getValue());
        assertEquals('C', card.getSuit());

        jalau.at18.katas.pokerhands.joseg.Card jackOfHearts = new Card(jalau.at18.katas.pokerhands.joseg.CardValue.JACK, 'H');
        assertEquals(CardValue.JACK, jackOfHearts.getValue());
        assertEquals('H', jackOfHearts.getSuit());
    }
}
