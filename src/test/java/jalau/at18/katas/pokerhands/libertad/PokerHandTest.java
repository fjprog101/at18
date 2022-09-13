package jalau.at18.katas.pokerhands.libertad;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class PokerHandTest {

    @Test
    public void shouldHaveFiveCards() {
        List<Card> input = new LinkedList<>();
        input.add(new Card(CardValue.TWO, 'D'));
        input.add(new Card(CardValue.THREE, 'D'));
        input.add(new Card(CardValue.JACK, 'D'));
        input.add(new Card(CardValue.TWO, 'C'));
        input.add(new Card(CardValue.TWO, 'C'));
        PokerHand hand = new PokerHand(input);
        assertNotNull(hand.getCards());
        assertEquals(5, hand.getCards().size());
    }
}
