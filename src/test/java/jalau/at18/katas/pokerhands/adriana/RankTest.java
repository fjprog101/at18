package jalau.at18.katas.pokerhands.adriana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RankTest {
    @Test
    public void shouldReturnTheRankOfHand() {
        Rank rankHand = new Rank();

        PokerHand straightFlushHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertEquals(8, rankHand.getRank(straightFlushHand));

        PokerHand straightHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertEquals(4, rankHand.getRank(straightHand));

        PokerHand noTypeHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.ACE, 'C'),
        });
        assertEquals(0, rankHand.getRank(noTypeHand));
    }
}
