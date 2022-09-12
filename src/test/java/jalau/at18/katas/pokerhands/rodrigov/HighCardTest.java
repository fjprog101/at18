package jalau.at18.katas.pokerhands.rodrigov;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HighCardTest {
    
    @Test
    public void shouldSayIfTheHandIsDefinedByTheHighCard(){
        HighCardIndetifier highCard = new HighCardIndetifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.NINE, 'C'),
            new Card(CardValue.KING, 'D'),
        });
        assertTrue(highCard.identify(hand));
    }

    @Test
    public void shouldSayIfTheHandIsNotDefinedByTheHighCard(){
        HighCardIndetifier highCard = new HighCardIndetifier();
        PokerHand hand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.THREE, 'H'),
        });
        assertFalse(highCard.identify(hand));
    }

    @Test
    public void shouldReturnOnePairRank(){
        HighCardIndetifier highCardIndetifier = new HighCardIndetifier();
        assertEquals("HIGHCARD", highCardIndetifier.identifyRank().toString());
        System.out.println(highCardIndetifier.identifyRank().toString());
    }
}
