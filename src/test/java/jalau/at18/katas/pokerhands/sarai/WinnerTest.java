package jalau.at18.katas.pokerhands.sarai;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WinnerTest {
    @Test
    public void hands() {
        PokerHand OnePairshand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.TWO, 'H'),
        }); 

        PokerHand fourhandTrue = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.TWO, 'H'),
        });

        Winner win = new Winner(fourhandTrue, OnePairshand);
        assertEquals("black", win.getWin());
    }
    @Test
    public void hand2() {
        PokerHand straightHand = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        PokerHand flushHand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.SEVEN, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });

        Winner win = new Winner(straightHand, flushHand);
        assertEquals("white", win.getWin());
    }
}
