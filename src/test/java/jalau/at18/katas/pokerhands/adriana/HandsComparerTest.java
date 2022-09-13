package jalau.at18.katas.pokerhands.adriana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandsComparerTest {
    @Test
    public void shouldGiveTheHandWithHighestRank() {

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
        HandsComparer comparer = new HandsComparer(straightFlushHand, fullHouseHand);
        assertEquals("White", comparer.getWinner());

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
        HandsComparer comparer1 = new HandsComparer(handWithOnePair, FlushHand);
        assertEquals("Black", comparer1.getWinner());

        PokerHand fullHouseHand1 = new PokerHand("White", new Card[]{
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        PokerHand fullHouseHand2 = new PokerHand("Black", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'C'),
        });
        HandsComparer comparer2 = new HandsComparer(fullHouseHand1, fullHouseHand2);
        assertEquals("White", comparer2.getWinner());

        PokerHand noTypeHand1 = new PokerHand("White", new Card[]{
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SEVEN, 'H'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        PokerHand noTypeHand2 = new PokerHand("Black", new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.QUEEN, 'D'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.EIGHT, 'C'),
        });
        HandsComparer comparer3 = new HandsComparer(noTypeHand1, noTypeHand2);
        assertEquals("Black", comparer3.getWinner());

        PokerHand pairHand1 = new PokerHand("Black", new Card[]{
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.EIGHT, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'C'),
        });
        PokerHand pairHand2 = new PokerHand("White", new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.SEVEN, 'H'),
            new Card(CardValue.QUEEN, 'D'),
            new Card(CardValue.ACE, 'D'),
            new Card(CardValue.ACE, 'H'),
        });
        HandsComparer comparer4 = new HandsComparer(pairHand1, pairHand2);
        assertEquals("White", comparer4.getWinner());

        PokerHand twoPairHand1 = new PokerHand("White", new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.QUEEN, 'D'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'C'),
        });
        PokerHand twoPairHand2 = new PokerHand("Black", new Card[]{
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'C'),
        });
        HandsComparer comparer5 = new HandsComparer(twoPairHand1, twoPairHand2);
        assertEquals("White", comparer5.getWinner());
    }
}
