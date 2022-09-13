package jalau.at18.katas.pokerhands.alvaro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PokerHandGameTest {
    @Test
    public void shouldReturnWinner() {
        PokerHandGame newGame = new PokerHandGame();
        PokerHand whiteHand = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.EIGHT, 'S'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.QUEEN, 'S'),
            new Card(CardValue.THREE, 'S'),
        });
        PokerHand blackHand = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
        });
        assertEquals("BlackHand Wins with Full House", newGame.compareHands(whiteHand, blackHand));

        PokerHand blackHand1 = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.EIGHT, 'S'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.QUEEN, 'S'),
            new Card(CardValue.THREE, 'S'),
        });
        PokerHand whiteHand1 = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
        });
        assertEquals("WhiteHand Wins with Full House", newGame.compareHands(whiteHand1, blackHand1));

        PokerHand sameHandBlack = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
        });
        PokerHand sameHandWhite = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.FOUR, 'H'),
        });
        assertEquals("Tie", newGame.compareHands(sameHandBlack,sameHandWhite));
    }

}
