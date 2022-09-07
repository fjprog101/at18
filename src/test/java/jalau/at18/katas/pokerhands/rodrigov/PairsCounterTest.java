package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
public class PairsCounterTest {
    @Test
    public void shouldGivePairsCount() {
        PokerHand handWithoutPairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SEVEN, 'C'),
            new Card(CardValue.THREE, 'H'),
        });
        PairsCounter pairsCount = new PairsCounter (handWithoutPairs);
        assertEquals(0, pairsCount.getArraySize());

        PokerHand handWithOnePair = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.SEVEN, 'D'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.EIGHT, 'S'),
        });
        PairsCounter pc1 = new PairsCounter (handWithOnePair);
        assertEquals(1, pc1.getArraySize());

        PokerHand handWithTwoPair = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.SIX, 'D'),
        });
        PairsCounter pc2 = new PairsCounter (handWithTwoPair);
        assertEquals(2, pc2.getArraySize());
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
        PairsCounter pairsCount = new PairsCounter (handWithoutPairs);
        ArrayList <CardValue> expectedArray = new ArrayList <CardValue>();
        expectedArray.add(CardValue.TWO);
        assertEquals(expectedArray, pairsCount.getPairsArray());

    }
}
