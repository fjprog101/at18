package jalau.at18.katas.pokerhands.adriana;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PairsCountTest {
    @Test
    public void shouldGivePairsCount() {
        PokerHand handWithoutPairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        PairsCount pairsCount = new PairsCount (handWithoutPairs);
        assertEquals(0, pairsCount.get());

        PokerHand handWithOnePair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        PairsCount pairsCount1 = new PairsCount (handWithOnePair);
        assertEquals(1, pairsCount1.get());
        
        PokerHand handWithTwoPair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.FIVE, 'S'),
        });
        PairsCount pairsCount2 = new PairsCount (handWithTwoPair);
        assertEquals(2, pairsCount2.get());
    }

    @Test
    public void shouldGivePairsArray() {
        PokerHand handWithoutPairs = new PokerHand(new Card[]{
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
        });
        PairsCount pairsCount = new PairsCount (handWithoutPairs);
        ArrayList <CardValue> expectedArray = new ArrayList <CardValue>();
        expectedArray.add(CardValue.TWO);
        assertEquals(expectedArray, pairsCount.getArrayPairs());

    }
}
