package jalau.at18.katas.pokerhands.sarai;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PairsTest {
    @Test
    public void OnePairs() {

        Pairs two_pairs= new Pairs();
        PokerHand OnePairshand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertTrue(two_pairs.match(OnePairshand));

        PokerHand OnePairshandwithtoFour = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertTrue(two_pairs.match(OnePairshandwithtoFour));
    }

    @Test
    public void OnePairsFalse() {

        Pairs two_pairs = new Pairs();
        PokerHand OnePairshand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertFalse(two_pairs.match(OnePairshand));

        PokerHand Pairshand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertFalse(two_pairs.match(Pairshand));
    }
}
