package jalau.at18.katas.pokerhands.sarai;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoPairsTest {
    @Test
    public void TwoPairs() {

        TwoPairs  two_pairs= new TwoPairs();
        PokerHand TwoPairshand = new PokerHand(new Card[] {
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
        });
        assertTrue(two_pairs.match(TwoPairshand));

    }
}
