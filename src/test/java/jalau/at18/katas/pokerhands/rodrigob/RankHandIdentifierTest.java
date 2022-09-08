package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RankHandIdentifierTest {

    @Test
    public void shouldIdentifyPokerHandRanks() {
        RankHandIdentifier identifier = new RankHandIdentifier();

        PokerHand cardsWith1Pair = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertEquals(HandsValue.ONEPAIR.getRank(), identifier.getRankHand(cardsWith1Pair));

        PokerHand cardsWith2Pairs = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertEquals(HandsValue.TWOPAIRS.getRank(), identifier.getRankHand(cardsWith2Pairs));

        PokerHand cardsWith3OfAKind = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertEquals(HandsValue.THREEOFAKIND.getRank(), identifier.getRankHand(cardsWith3OfAKind));

        PokerHand cardsWithStraight = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertEquals(HandsValue.STRAIGHT.getRank(), identifier.getRankHand(cardsWithStraight));

        PokerHand cardsWithFlush = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'H'),
        });
        assertEquals(HandsValue.FLUSH.getRank(), identifier.getRankHand(cardsWithFlush));

        PokerHand cardsWithFullHouse = new PokerHand(new Card[]{
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'H'),
        });
        assertEquals(HandsValue.FULLHOUSE.getRank(), identifier.getRankHand(cardsWithFullHouse));

        PokerHand cardsWithFourOfAKind = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.THREE, 'H'),
        });
        assertEquals(HandsValue.FOUROFAKIND.getRank(), identifier.getRankHand(cardsWithFourOfAKind));

        PokerHand cardsWithStraightFlush = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.SEVEN, 'H'),
        });
        assertEquals(HandsValue.STRAIGHTFLUSH.getRank(), identifier.getRankHand(cardsWithStraightFlush));
    }
}
