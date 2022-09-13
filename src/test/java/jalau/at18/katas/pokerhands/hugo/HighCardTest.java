package jalau.at18.katas.pokerhands.hugo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HighCardTest {

    @Test
    public void shouldShowHighestCard() {
        HighCard highCard1 = new HighCard(0);
        HighCard highCard2 = new HighCard(1);
        HighCard highCard3 = new HighCard(2);
        HighCard highCard4 = new HighCard(3);
        HighCard highCard5 = new HighCard(4);

        PokerHand handWithNoHands = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertEquals(13, highCard1.getHighestCardValue(handWithNoHands));
        assertEquals(10, highCard2.getHighestCardValue(handWithNoHands));
        assertEquals(5, highCard3.getHighestCardValue(handWithNoHands));
        assertEquals(3, highCard4.getHighestCardValue(handWithNoHands));
        assertEquals(2, highCard5.getHighestCardValue(handWithNoHands));
    }
}
