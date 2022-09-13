package jalau.at18.katas.pokerhands.rodrigob.Ranks;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import jalau.at18.katas.pokerhands.rodrigob.Cards.Card;
import jalau.at18.katas.pokerhands.rodrigob.Cards.CardValue;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public class RankCardIdentifierTest {

    @Test
    public void shouldIdentifyPokerHandRanks() {
        RankCardIdentifier identifier = new RankCardIdentifier();

        PokerHand cardsWith1Pair = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C')
        ));
        assertEquals(CardValue.FIVE.getNumericValue(), identifier.getRankCard(cardsWith1Pair));

        PokerHand cardsWith2Pairs = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C')
        ));
        assertEquals(CardValue.FIVE.getNumericValue(), identifier.getRankCard(cardsWith2Pairs));

        PokerHand cardsWith3OfAKind = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C')
        ));
        assertEquals(CardValue.TWO.getNumericValue(), identifier.getRankCard(cardsWith3OfAKind));

        PokerHand cardsWithStraight = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C')
        ));
        assertEquals(CardValue.SIX.getNumericValue(), identifier.getRankCard(cardsWithStraight));

        PokerHand cardsWithFlush = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'H')
        ));
        assertEquals(CardValue.ACE.getNumericValue(), identifier.getRankCard(cardsWithFlush));

        PokerHand cardsWithFullHouse = new PokerHand(Arrays.asList(
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'H')
        ));
        assertEquals(CardValue.THREE.getNumericValue(), identifier.getRankCard(cardsWithFullHouse));

        PokerHand cardsWithFourOfAKind = new PokerHand(Arrays.asList(
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'H')
        ));
        assertEquals(CardValue.THREE.getNumericValue(), identifier.getRankCard(cardsWithFourOfAKind));

        PokerHand cardsWithStraightFlush = new PokerHand(Arrays.asList(
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.SEVEN, 'H')
        ));
        assertEquals(CardValue.SEVEN.getNumericValue(), identifier.getRankCard(cardsWithStraightFlush));
    }
}
