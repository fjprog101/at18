package jalau.at18.katas.pokerhands.alvaro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

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
    @Test
    public void shouldSortByValue() {
        PokerHand handDisordered = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FOUR, 'C'),
        });
        assertEquals(CardValue.TWO, handDisordered.getCards()[0].getValue());
        assertEquals(CardValue.THREE, handDisordered.getCards()[1].getValue());
        assertEquals(CardValue.FOUR, handDisordered.getCards()[2].getValue());
        assertEquals(CardValue.FIVE, handDisordered.getCards()[3].getValue());
        assertEquals(CardValue.SIX, handDisordered.getCards()[4].getValue());

        PokerHand handDisordered1 = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'D'),
        });
        assertEquals(CardValue.TWO, handDisordered1.getCards()[0].getValue());
        assertEquals(CardValue.TWO, handDisordered1.getCards()[1].getValue());
        assertEquals(CardValue.FOUR, handDisordered1.getCards()[2].getValue());
        assertEquals(CardValue.FOUR, handDisordered1.getCards()[3].getValue());
        assertEquals(CardValue.SIX, handDisordered1.getCards()[4].getValue());
    }

}
