package jalau.at18.katas.pokerhands.fernanda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DetermineWinningHandTest {
    @Test
    public void testDetermineWinner() {
        DetermineWinningHand determinewinninghand = new DetermineWinningHand();
        PokerHand firsthandWhite = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        PokerHand secondhandBlack = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        String expected = "White wins";
        assertEquals(expected, determinewinninghand.determineWinner(firsthandWhite, secondhandBlack));
    }
    @Test
    public void testDetermineWinner2() {
        DetermineWinningHand determinewinninghand = new DetermineWinningHand();
        PokerHand firsthandWhite = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        PokerHand secondhandBlack = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        String expected = "Black wins";
        assertEquals(expected, determinewinninghand.determineWinner(firsthandWhite, secondhandBlack));
    }
}
