package jalau.at18.katas.pokerhands.daniela;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameAnalizerTest {
    @Test
    public void shouldSayStraightFlush() {

        PokerHand straightFlushHand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.THREE, 'C'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.SIX, 'C'),
        });
        GameAnalizer analizer = new GameAnalizer(straightFlushHand);
        assertEquals(Rank.STRAIGHTFLUSH, analizer.getidentifyPokerhand());
    }

    @Test
    public void shouldSayFullHouse() {

        PokerHand straightFlushHand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.FIVE, 'S'),
                new Card(CardValue.FIVE, 'S'),
        });
        GameAnalizer analizer = new GameAnalizer(straightFlushHand);
        assertEquals(Rank.FULLHOUSE, analizer.getidentifyPokerhand());
    }

    /////////////////////// getscore////////////////////

    @Test
    public void shouldSayStraightFlushScore() {

        PokerHand straightFlushHand = new PokerHand(new Card[] {
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.THREE, 'C'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.SIX, 'C'),
        });
        GameAnalizer analizer = new GameAnalizer(straightFlushHand);
        assertEquals(9, analizer.getscore());
    }
}
