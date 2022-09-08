package jalau.at18.katas.pokerhands.adriana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandsComparerTest {
    @Test
    public void shouldGiveTheHandWithHighestRank() {
        HandsComparer comparer = new HandsComparer();

        PokerHand straightFlushHand = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        PokerHand fullHouseHand = new PokerHand("Black", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertEquals("White", comparer.getWinner(straightFlushHand, fullHouseHand));

        PokerHand handWithOnePair = new PokerHand("White", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'S'),
        });
        PokerHand FlushHand = new PokerHand("Black", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SEVEN, 'C'),
        });
        assertEquals("Black", comparer.getWinner(handWithOnePair, FlushHand));
    }
}
