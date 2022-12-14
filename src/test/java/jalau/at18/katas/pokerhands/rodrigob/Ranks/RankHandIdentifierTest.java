package jalau.at18.katas.pokerhands.rodrigob.Ranks;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import jalau.at18.katas.pokerhands.rodrigob.Cards.Card;
import jalau.at18.katas.pokerhands.rodrigob.Cards.CardValue;
import jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers.HandsValue;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public class RankHandIdentifierTest {

    @Test
    public void shouldIdentifyPokerHandRanks() {
        RankHandIdentifier identifier = new RankHandIdentifier();

        PokerHand cardsWith1Pair = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C')
        ));
        assertEquals(HandsValue.ONEPAIR.getRank(), identifier.getRankHand(cardsWith1Pair));

        PokerHand cardsWith2Pairs = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C')
        ));
        assertEquals(HandsValue.TWOPAIRS.getRank(), identifier.getRankHand(cardsWith2Pairs));

        PokerHand cardsWith3OfAKind = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C')
        ));
        assertEquals(HandsValue.THREEOFAKIND.getRank(), identifier.getRankHand(cardsWith3OfAKind));

        PokerHand cardsWithStraight = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C')
        ));
        assertEquals(HandsValue.STRAIGHT.getRank(), identifier.getRankHand(cardsWithStraight));

        PokerHand cardsWithFlush = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'H')
        ));
        assertEquals(HandsValue.FLUSH.getRank(), identifier.getRankHand(cardsWithFlush));

        PokerHand cardsWithFullHouse = new PokerHand(Arrays.asList(
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'H')
        ));
        assertEquals(HandsValue.FULLHOUSE.getRank(), identifier.getRankHand(cardsWithFullHouse));

        PokerHand cardsWithFourOfAKind = new PokerHand(Arrays.asList(
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'H')
        ));
        assertEquals(HandsValue.FOUROFAKIND.getRank(), identifier.getRankHand(cardsWithFourOfAKind));

        PokerHand cardsWithStraightFlush = new PokerHand(Arrays.asList(
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.SEVEN, 'H')
        ));
        assertEquals(HandsValue.STRAIGHTFLUSH.getRank(), identifier.getRankHand(cardsWithStraightFlush));
    }
}
