package jalau.at18.katas.pokerhands.sergio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HighestCardTest {
    @Test
    public void shouldIdentifyHighestCard() {
        HighestCard identifier = new HighestCard();

        PokerHand pokerHand = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'D'),
            new Card(CardValue.EIGHT, 'S'),
            new Card(CardValue.JACK, 'H'),
            new Card(CardValue.QUEEN, 'C'), });
        assertEquals(2, identifier.highestCardIdentifier(pokerHand));
    }
}
