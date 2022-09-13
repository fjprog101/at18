package jalau.at18.katas.pokerhands.rodrigov;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class WinDeciderTest {
    
    @Test
    public void shouldReturnWinner(){
        WinDecider winDecider = new WinDecider();

        PokerHand handWhitePlayer1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'H'),
        });

        PokerHand handBlackPlayer2 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.NINE, 'C'),
            new Card(CardValue.KING, 'D'),
        });
        assertEquals("Hand white player win", winDecider.winner(handWhitePlayer1, handBlackPlayer2));
    }

    @Test
    public void shouldReturnWinnerTest2(){
        WinDecider winDecider = new WinDecider();

        PokerHand handWhitePlayer1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.EIGHT, 'S'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.QUEEN, 'S'),
            new Card(CardValue.THREE, 'S'),
        });

        PokerHand handBlackPlayer2 = new PokerHand(new Card[]{
            
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
        });
        assertEquals("Hand black player win", winDecider.winner(handWhitePlayer1, handBlackPlayer2));
    }

    @Test
    public void shouldReturnWinnerTest3(){
        WinDecider winDecider = new WinDecider();

        PokerHand handWhitePlayer1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.KING, 'H'),
        });

        PokerHand handBlackPlayer2 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.NINE, 'C'),
            new Card(CardValue.KING, 'D'),
        });
        assertEquals("Hand black player win", winDecider.winner(handWhitePlayer1, handBlackPlayer2));
    }
    
    @Test
    public void shouldReturnWinnerTest4(){
        WinDecider winDecider = new WinDecider();

        PokerHand handWhitePlayer1 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.NINE, 'S'),
            new Card(CardValue.KING, 'H'),
        });

        PokerHand handBlackPlayer2 = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.NINE, 'C'),
            new Card(CardValue.KING, 'D'),
        });
        assertEquals("Hand black player win", winDecider.defineWinnerinatie(handWhitePlayer1, CardValue.FIVE, handBlackPlayer2, CardValue.SEVEN));
    }
}
