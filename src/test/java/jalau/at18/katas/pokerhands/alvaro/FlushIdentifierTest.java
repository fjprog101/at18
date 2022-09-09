package jalau.at18.katas.pokerhands.alvaro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FlushIdentifierTest {
    @Test
    public void shouldIdentifyFlushHand() {
        FlushIdentifier identifier = new FlushIdentifier();

        PokerHand FlushHand = new PokerHand(new Card[]{
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.TWO, 'S'),
            new Card(CardValue.FIVE,'S'),
            new Card(CardValue.SEVEN,'S'),
            new Card(CardValue.NINE,'S'),
        });
        assertTrue(identifier.identify(FlushHand));
    }
}
