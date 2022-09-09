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
}
