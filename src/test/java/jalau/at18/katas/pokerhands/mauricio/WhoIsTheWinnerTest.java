package jalau.at18.katas.pokerhands.mauricio;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WhoIsTheWinnerTest {
    @Test
    public void shoulWinBlackCase1(){
        PokerHand black= new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });

        PokerHand white = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.FIVE, 'S'),
        });
        WhoIsTheWinner winner = new WhoIsTheWinner(black, white);
        assertEquals("Black is winner", winner.whoIsTheWInner(CardValue.TWO, CardValue.THREE));
    }

    @Test
    public void shoulWinBlackCase2(){
        PokerHand black= new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.SIX, 'S'),
        });

        PokerHand white = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        WhoIsTheWinner winner = new WhoIsTheWinner(black, white);
        assertEquals("Black is winner", winner.whoIsTheWInner(CardValue.TWO, CardValue.SIX));
    }

    @Test
    public void shoulWinBlackCase3(){
        PokerHand black= new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.THREE, 'S'),
        });

        PokerHand white = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        WhoIsTheWinner winner = new WhoIsTheWinner(black, white);
        assertEquals("Black is winner", winner.whoIsTheWInner(CardValue.TWO, CardValue.THREE));
    }

    @Test
    public void shoulWinWhiteCase1(){
        PokerHand black= new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.THREE, 'S'),
        });

        PokerHand white = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.THREE, 'S'),
        });
        WhoIsTheWinner winner = new WhoIsTheWinner(black, white);
        assertEquals("White is winner", winner.whoIsTheWInner(CardValue.TWO, CardValue.THREE));
    }

    @Test
    public void shoulWinWhiteCase2(){
        PokerHand black= new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.QUEEN, 'S'),
            new Card(CardValue.THREE, 'S'),
        });

        PokerHand white = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        WhoIsTheWinner winner = new WhoIsTheWinner(black, white);
        assertEquals("White is winner", winner.whoIsTheWInner(CardValue.TWO, CardValue.THREE));
    }

    @Test
    public void shoulWinWhiteCase3(){
        PokerHand black= new PokerHand(new Card[]{
            new Card(CardValue.TEN, 'C'),
            new Card(CardValue.TEN, 'D'),
            new Card(CardValue.TEN, 'H'),
            new Card(CardValue.TEN, 'S'),
            new Card(CardValue.ACE, 'S'),
        });

        PokerHand white = new PokerHand(new Card[]{
            new Card(CardValue.TEN, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.QUEEN, 'D'),
            new Card(CardValue.KING, 'D'),
            new Card(CardValue.ACE, 'D'),
        });
        WhoIsTheWinner winner = new WhoIsTheWinner(black, white);
        assertEquals("White is winner", winner.whoIsTheWInner(CardValue.TEN, CardValue.ACE));
    }
}
