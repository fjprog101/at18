package jalau.at18.katas.pokerhands.joseg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

import org.junit.Test;

public class PokerHandTest {

    @Test
    public void shouldHaveFiveCards() {
        PokerHand hand = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H')
        ));
        assertNotNull(hand.getCards());
        assertEquals(5, hand.getCards().size());
    }

    @Test
    public void shouldHaveCardsSortedByValue() {
        PokerHand hand = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H')
        ));
        assertEquals(CardValue.TWO, hand.getCards().get(0).getValue());
        assertEquals(CardValue.TWO, hand.getCards().get(1).getValue());
        assertEquals(CardValue.TWO, hand.getCards().get(2).getValue());
        assertEquals(CardValue.THREE, hand.getCards().get(3).getValue());
        assertEquals(CardValue.JACK, hand.getCards().get(4).getValue());
    }
}
