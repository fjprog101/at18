package jalau.at18.katas.pokerhands.adriana;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PokerHandTest {

    @Test
    public void shouldHaveFiveCards() {
        PokerHand hand = new PokerHand("White", new Card[] {
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'S'),
        });
        assertNotNull(hand.getCards());
        assertEquals(5, hand.getCards().length);
        assertEquals("White", hand.getPlayer());
        assertEquals(CardValue.TWO, hand.getCards()[0].getValue());
        assertEquals(CardValue.TWO, hand.getCards()[1].getValue());
        assertEquals(CardValue.TWO, hand.getCards()[2].getValue());
        assertEquals(CardValue.THREE, hand.getCards()[3].getValue());
        assertEquals(CardValue.JACK, hand.getCards()[4].getValue());

        PokerHand hand2 = new PokerHand("Black", new Card[] {
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.FOUR, 'S'),
        });
        assertNotNull(hand2.getCards());
        assertEquals(5, hand2.getCards().length);
        assertEquals("Black", hand2.getPlayer());
        assertEquals(CardValue.TWO, hand2.getCards()[0].getValue());
        assertEquals(CardValue.THREE, hand2.getCards()[1].getValue());
        assertEquals(CardValue.FOUR, hand2.getCards()[2].getValue());
        assertEquals(CardValue.FIVE, hand2.getCards()[3].getValue());
        assertEquals(CardValue.SIX, hand2.getCards()[4].getValue());
        
    }
}
