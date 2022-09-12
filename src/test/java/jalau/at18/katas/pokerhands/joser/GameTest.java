package jalau.at18.katas.pokerhands.joser;
import static org.junit.Assert.*;
import org.junit.Test;

public class GameTest {
    @Test
    public void testGetWinHand1() {
        PokerHand hand1 = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        PokerHand hand2 = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });

        Game game = new Game(hand1, hand2);
        assertEquals(1, game.getWin());

    }
    @Test
    public void testGetWinHand2() {
        PokerHand hand2 = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        PokerHand hand1 = new PokerHand(new Card[] {
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });

        Game game = new Game(hand1, hand2);
        assertEquals(2, game.getWin());

    }
}
