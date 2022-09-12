package jalau.at18.katas.pokerhands.sarai;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PairsTest {
    @Test
    public void OnePairs() {

        Pairs pairs= new Pairs();
        PokerHand OnePairshand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertTrue(pairs.match(OnePairshand));

        Pairs pairs2= new Pairs();
        PokerHand OnePairshandwithtoFour = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertTrue(pairs2.match(OnePairshandwithtoFour));
    }

    @Test
    public void OnePairsFalse() {

        Pairs pairs = new Pairs();
        PokerHand OnePairshand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertFalse(pairs.match(OnePairshand));

        Pairs pairs1 = new Pairs();
        PokerHand Pairshand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertFalse(pairs1.match(Pairshand));
    }
}
