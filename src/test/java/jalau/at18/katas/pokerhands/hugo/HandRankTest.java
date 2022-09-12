package jalau.at18.katas.pokerhands.hugo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandRankTest {

    @Test
    public void shouldIdentifyPokerHandRanks() {
        HandRank identifier = new HandRank();

        PokerHand handWithOnePair = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.EIGHT, 'S'),
        });
        assertEquals(HandRanks.PAIR.getHandRank(), identifier.getRank(handWithOnePair));

        PokerHand handWithTwoPairs = new PokerHand(new Card[]{
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SEVEN, 'S'),
        });
        assertEquals(HandRanks.TWOPAIRS.getHandRank(), identifier.getRank(handWithTwoPairs));

        PokerHand handWithThreeKind = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.NINE, 'H'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        assertEquals(HandRanks.THREEOFAKIND.getHandRank(), identifier.getRank(handWithThreeKind));

        PokerHand handWithFourKind = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.ACE, 'S'),
            new Card(CardValue.ACE, 'S'),
        });
        assertEquals(HandRanks.FOUROFAKIND.getHandRank(), identifier.getRank(handWithFourKind));

        PokerHand straightHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'D'),
            new Card(CardValue.THREE, 'S'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C'),
        });
        assertEquals(HandRanks.STRAIGHT.getHandRank(), identifier.getRank(straightHand));

        PokerHand FlushInHand = new PokerHand(new Card[]{
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.ACE, 'H'),
            new Card(CardValue.SIX, 'H'),
            new Card(CardValue.SEVEN, 'H'),
        });
        assertEquals(HandRanks.FLUSH.getHandRank(), identifier.getRank(FlushInHand));

        PokerHand handWithFullHouse = new PokerHand(new Card[]{
            new Card(CardValue.EIGHT, 'C'),
            new Card(CardValue.EIGHT, 'H'),
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.EIGHT, 'S'),
            new Card(CardValue.TWO, 'S'),
        });
        assertEquals(HandRanks.FULLHOUSE.getHandRank(), identifier.getRank(handWithFullHouse));

        PokerHand straightFlushHand = new PokerHand(new Card[]{
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C'),
        });
        assertEquals(HandRanks.STRAIGHTFLUSH.getHandRank(), identifier.getRank(straightFlushHand));
    }
}