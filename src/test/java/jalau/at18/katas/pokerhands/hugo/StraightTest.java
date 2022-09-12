package jalau.at18.katas.pokerhands.hugo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StraightTest {

    @Test
    public void shouldIdentifyStraightHand() {
        Straight identifier = new Straight();

        PokerHand straightHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'S'),
        });
        assertTrue(identifier.identify(straightHand));

        PokerHand StraightWithAceHand = new PokerHand(new Card[]{
            new Card(CardValue.TEN, 'S'),
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.QUEEN, 'H'),
            new Card(CardValue.KING, 'C'),
            new Card(CardValue.ACE, 'C'),
        });
        assertTrue(identifier.identify(StraightWithAceHand));

        PokerHand noConsecutiveValues = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.NINE, 'C'),
            new Card(CardValue.NINE, 'C'),
            new Card(CardValue.SEVEN, 'C'),
        });

        assertFalse(identifier.identify(noConsecutiveValues));
    }
}
