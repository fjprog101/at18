package jalau.at18.katas.pokerhands.joser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PokerHandTest {

    @Test
    public void shouldHaveFiveCards() {
        PokerHand hand = new PokerHand(new Card[] {
            new Card(CardValue.ACE, 'D'),
            new Card(CardValue.KING, 'D'),
            new Card(CardValue.QUEEN, 'D'),
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.TEN, 'C'),
        });
        assertNotNull(hand.getCards());
        assertEquals(5, hand.getCards().length);
    }
}
