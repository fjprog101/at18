package jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import jalau.at18.katas.pokerhands.rodrigob.Cards.Card;
import jalau.at18.katas.pokerhands.rodrigob.Cards.CardValue;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public class HighCardIdentifierTest {

    @Test
    public void shouldShowHighestCard() {
        HighCardIdentifier highCard1 = new HighCardIdentifier();

        PokerHand handWithNoHands = new PokerHand(Arrays.asList(
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SIX, 'S')
        ));
        assertTrue(highCard1.identify(handWithNoHands));
        assertEquals(14, highCard1.getCardRankedValue(handWithNoHands));
    }
}
