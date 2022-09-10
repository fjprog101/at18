package jalau.at18.katas.pokerhands.sergio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PokerHandTest {

    @Test
    public void shouldHaveFiveCards() {
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'), });
        assertNotNull(hand.getCards());
        assertEquals(5, hand.getCards().length);
    }

    public void shouldReturnPokerHandSort() {
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.ACE, 'C'), });

        PokerHand sortHand = new PokerHand(new Card[]{
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'H'), });
        assertNotNull(hand.getCards());
        assertEquals(sortHand, hand.getCards());
    }

}
