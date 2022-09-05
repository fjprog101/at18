package jalau.at18.katas.pokerhands.maria;

import jalau.at18.katas.pokerhands.joseg.Card;
import jalau.at18.katas.pokerhands.joseg.CardValue;
import jalau.at18.katas.pokerhands.joseg.PokerHand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PokerHandTest {

    @Test
    public void shouldHaveFiveCards() {
        jalau.at18.katas.pokerhands.joseg.PokerHand hand = new PokerHand(new jalau.at18.katas.pokerhands.joseg.Card[] {
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'D'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.THREE, 'D'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.JACK, 'D'),
            new jalau.at18.katas.pokerhands.joseg.Card(jalau.at18.katas.pokerhands.joseg.CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
        });
        assertNotNull(hand.getCards());
        assertEquals(5, hand.getCards().length);
    }
}
