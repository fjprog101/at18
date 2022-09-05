package jalau.at18.katas.pokerhands.carlos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import jalau.at18.katas.pokerhands.carlos.Card;
import jalau.at18.katas.pokerhands.carlos.CardValue;
import jalau.at18.katas.pokerhands.carlos.PokerHand;

public class PokerHandTest {

    @Test
    public void shouldHaveFiveCards() {
        PokerHand hand = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
        });
        assertNotNull(hand.getCards());
        assertEquals(5, hand.getCards().length);
    }
}
