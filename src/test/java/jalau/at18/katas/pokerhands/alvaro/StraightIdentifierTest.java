package jalau.at18.katas.pokerhands.alvaro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StraightIdentifierTest {
    @Test
    public void shouldIdentifyStraightHand() {
        StraightIdentifier identifier = new StraightIdentifier();

        PokerHand straightFlushHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.THREE, 'D'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'C'),
        });
        assertTrue(identifier.identify(straightFlushHand));
    }
}
