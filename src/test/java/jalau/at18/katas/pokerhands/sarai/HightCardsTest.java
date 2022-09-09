package jalau.at18.katas.pokerhands.sarai;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HightCardsTest {
    @Test
    public void Higth() {

        HightCards  HigthTrue1 = new HightCards();
        PokerHand Higthhand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.SIX, 'H'),
        });
        assertTrue(HigthTrue1.match(Higthhand));

        HightCards  HigthTrue2 = new HightCards();
        PokerHand Higthhand2 = new PokerHand(new Card[] {
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.SIX, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.JACK, 'H'),
        });
        assertTrue(HigthTrue2.match(Higthhand2));
    }

    @Test
    public void TwoPairsFalse() {

        HightCards  HigthFalse1= new HightCards();
        PokerHand Higthhand2 = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertFalse(HigthFalse1.match(Higthhand2));

        HightCards  HigthFalse2= new HightCards();
        PokerHand Higthhand3 = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FIVE, 'D'),
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertFalse(HigthFalse2.match(Higthhand3));

    }
}
