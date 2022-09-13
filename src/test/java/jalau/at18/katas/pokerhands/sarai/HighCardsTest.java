package jalau.at18.katas.pokerhands.sarai;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HighCardsTest {
    @Test
    public void High() {

        HighCards  HighTrue1 = new HighCards();
        PokerHand Highhand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'H'),
        });
        assertTrue(HighTrue1.match(Highhand));

        HighCards  HighTrue2 = new HighCards();
        PokerHand Highhand2 = new PokerHand(new Card[] {
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.JACK, 'H'),
        });
        assertTrue(HighTrue2.match(Highhand2));
    }

    @Test
    public void TwoPairsFalse() {

        HighCards  HighFalse1= new HighCards();
        PokerHand Highhand2 = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertFalse(HighFalse1.match(Highhand2));

        HighCards  HighFalse2= new HighCards();
        PokerHand Highhand3 = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertFalse(HighFalse2.match(Highhand3));

    }
}
