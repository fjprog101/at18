package jalau.at18.katas.pokerhands.carlos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HighCardTest {
    @Test
    public void shouldIdentifyHighCard() {
        HighCard identifier = new HighCard();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'H'),
        });
        assertEquals(CardValue.SIX.ordinal(), identifier.identifyHighCard(hand));   
    }     
}
