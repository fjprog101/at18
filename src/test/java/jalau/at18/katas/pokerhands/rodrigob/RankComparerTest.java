package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class RankComparerTest {

    @Test
    public void shouldSayWhichHandHasMoreRank() {
        RankComparer comparer = new RankComparer();

        PokerHand player1HandStrightFlush = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C')
        ));

        PokerHand player2HandFlush = new PokerHand(Arrays.asList(
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C')
        ));

        Player player1 = new Player(player1HandStrightFlush, "Black");
        Player player2 = new Player(player2HandFlush, "White");
        assertEquals(1, comparer.compareHands(player1, player2));

        PokerHand player1HandStraight = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C')
        ));

        PokerHand player2HandFourOfAKind = new PokerHand(Arrays.asList(
            new Card(CardValue.SEVEN, 'C'),
            new Card(CardValue.SEVEN, 'H'),
            new Card(CardValue.SEVEN, 'S'),
            new Card(CardValue.SEVEN, 'D'),
            new Card(CardValue.SIX, 'H')
        ));

        player1 = new Player(player1HandStraight, "Black");
        player2 = new Player(player2HandFourOfAKind, "White");
        assertEquals(-1, comparer.compareHands(player1, player2));

        PokerHand player1HandFullHouseRank6 = new PokerHand(Arrays.asList(
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'D')
        ));

        PokerHand player2HandFullHouseRank4 = new PokerHand(Arrays.asList(
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FOUR, 'S'),
            new Card(CardValue.SEVEN, 'D'),
            new Card(CardValue.SEVEN, 'H')
        ));

        player1 = new Player(player1HandFullHouseRank6, "Black");
        player2 = new Player(player2HandFullHouseRank4, "White");
        assertEquals(1, comparer.compareHands(player1, player2));

        PokerHand player1HandThreeOfAKindRank6 = new PokerHand(Arrays.asList(
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FIVE, 'H'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SIX, 'S'),
            new Card(CardValue.SIX, 'D')
        ));

        PokerHand player2HandThreeOfAKindRankNine = new PokerHand(Arrays.asList(
            new Card(CardValue.NINE, 'C'),
            new Card(CardValue.NINE, 'H'),
            new Card(CardValue.NINE, 'S'),
            new Card(CardValue.ACE, 'D'),
            new Card(CardValue.SEVEN, 'H')
        ));

        player1 = new Player(player1HandThreeOfAKindRank6, "Black");
        player2 = new Player(player2HandThreeOfAKindRankNine, "White");
        assertEquals(-1, comparer.compareHands(player1, player2));

        PokerHand player1HandOnePairRankJack = new PokerHand(Arrays.asList(
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.JACK, 'H'),
            new Card(CardValue.SIX, 'C'),
            new Card(CardValue.SEVEN, 'S'),
            new Card(CardValue.TWO, 'D')
        ));

        PokerHand player2HandOnePairRankJack = new PokerHand(Arrays.asList(
            new Card(CardValue.NINE, 'C'),
            new Card(CardValue.JACK, 'D'),
            new Card(CardValue.JACK, 'S'),
            new Card(CardValue.ACE, 'D'),
            new Card(CardValue.SEVEN, 'H')
        ));

        player1 = new Player(player1HandOnePairRankJack, "Black");
        player2 = new Player(player2HandOnePairRankJack, "White");
        assertEquals(0, comparer.compareHands(player1, player2));
    }
}
