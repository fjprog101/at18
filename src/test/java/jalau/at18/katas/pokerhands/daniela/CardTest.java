package jalau.at18.katas.pokerhands.daniela;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {

    @Test
    public void shouldHaveSuitAndValue() {
        Card card = new Card(CardValue.TWO, 'C');
        assertEquals(CardValue.TWO, card.getValue());
        assertEquals('C', card.getSuit());

        Card jackOfHearts = new Card(CardValue.JACK, 'H');
        assertEquals(CardValue.JACK, jackOfHearts.getValue());
        assertEquals('H', jackOfHearts.getSuit());
    }

    @Test
    public void shouldHaveScoreOneCard() {
        Card card = new Card(CardValue.TWO, 'C');
        assertEquals(CardValue.TWO, card.getValue());
        assertEquals('C', card.getSuit());
        assertEquals(2, card.getScore(CardValue.TWO));
    }
}
