package jalau.at18.katas.pokerhands.mauricio;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WhoIsTheWinnerTest {
    @Test
    public void whoIsTheWinner(){
        PokerHand blackHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        PokerHand whiteHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.ACE, 'D'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        WhoIsTheWinner winner = new WhoIsTheWinner(blackHand, whiteHand);
        assertEquals("Black is winner", winner.whoisWinner());
        
    }
}
