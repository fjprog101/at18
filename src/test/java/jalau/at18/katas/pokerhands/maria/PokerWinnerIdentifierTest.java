package jalau.at18.katas.pokerhands.maria;

import org.junit.Test;

import static org.junit.Assert.*;

public class PokerWinnerIdentifierTest {
    @Test
    public void playerOneWin() {
        PokerHand player1StraightFlush = new PokerHand(new Card[]{
                new Card(CardValue.SIX, 'C'),
                new Card(CardValue.THREE, 'C'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.FIVE, 'C'),
                new Card(CardValue.TWO, 'C'),
        });

        PokerHand player2ThreeKind = new PokerHand(new Card[]{
                new Card(CardValue.SIX, 'C'),
                new Card(CardValue.SIX, 'S'),
                new Card(CardValue.SIX, 'H'),
                new Card(CardValue.FIVE, 'D'),
                new Card(CardValue.FIVE, 'C'),
        });


        PokerWinnerIdentifier pokerWinnerIdentifier = new PokerWinnerIdentifier(player1StraightFlush, player2ThreeKind);
        GameResult gameResult = pokerWinnerIdentifier.calculatePokerWinner();
        assertEquals(PokerHandType.STRAIGHTFLUSH, gameResult.getPokerHandRank().getPokerHandType());
        assertEquals("Player One", gameResult.getWinnerPlayer());
    }

    @Test
    public void playerTwoWin() {
        PokerHand player1TwoPair = new PokerHand(new Card[]{
                new Card(CardValue.SIX, 'C'),
                new Card(CardValue.SIX, 'S'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.TWO, 'H'),
                new Card(CardValue.TWO, 'D'),
        });

        PokerHand player2Flush = new PokerHand(new Card[]{
                new Card(CardValue.SIX, 'C'),
                new Card(CardValue.TWO, 'C'),
                new Card(CardValue.NINE, 'C'),
                new Card(CardValue.SEVEN, 'C'),
                new Card(CardValue.FIVE, 'C'),
        });


        PokerWinnerIdentifier pokerWinnerIdentifier = new PokerWinnerIdentifier(player1TwoPair, player2Flush);
        GameResult gameResult = pokerWinnerIdentifier.calculatePokerWinner();
        assertEquals(PokerHandType.FLUSH, gameResult.getPokerHandRank().getPokerHandType());
        assertEquals("Player Two", gameResult.getWinnerPlayer());
    }

    @Test
    public void playersTie1() {
        PokerHand player1HighCard = new PokerHand(new Card[]{
                new Card(CardValue.SIX, 'C'),
                new Card(CardValue.JACK, 'S'),
                new Card(CardValue.FOUR, 'C'),
                new Card(CardValue.THREE, 'H'),
                new Card(CardValue.TWO, 'D'),
        });

        PokerHand player2HighCard = new PokerHand(new Card[]{
                new Card(CardValue.THREE, 'D'),
                new Card(CardValue.TEN, 'S'),
                new Card(CardValue.JACK, 'H'),
                new Card(CardValue.SEVEN, 'S'),
                new Card(CardValue.FIVE, 'C'),
        });

        PokerWinnerIdentifier pokerWinnerIdentifier = new PokerWinnerIdentifier(player1HighCard, player2HighCard);
        GameResult gameResult = pokerWinnerIdentifier.calculatePokerWinner();
        assertNull(gameResult.getPokerHandRank());
        assertEquals("Tie", gameResult.getWinnerPlayer());
    }

    @Test
    public void playersFourKindRank() {
        PokerHand player1FourKind = new PokerHand(new Card[]{
                new Card(CardValue.THREE, 'C'),
                new Card(CardValue.THREE, 'S'),
                new Card(CardValue.SEVEN, 'D'),
                new Card(CardValue.THREE, 'D'),
                new Card(CardValue.THREE, 'H'),
        });

        PokerHand player2FourKind = new PokerHand(new Card[]{
                new Card(CardValue.EIGHT, 'C'),
                new Card(CardValue.TWO, 'S'),
                new Card(CardValue.EIGHT, 'D'),
                new Card(CardValue.EIGHT, 'S'),
                new Card(CardValue.EIGHT, 'H'),
        });

        PokerWinnerIdentifier pokerWinnerIdentifier = new PokerWinnerIdentifier(player1FourKind, player2FourKind);
        GameResult gameResult = pokerWinnerIdentifier.calculatePokerWinner();
        assertEquals(PokerHandType.FOURKIND, gameResult.getPokerHandRank().getPokerHandType());
        assertEquals("Player Two", gameResult.getWinnerPlayer());
    }

    @Test
    public void playersFullHouseRank() {
        PokerHand player1FullHouse = new PokerHand(new Card[]{
                new Card(CardValue.JACK, 'C'),
                new Card(CardValue.JACK, 'S'),
                new Card(CardValue.THREE, 'D'),
                new Card(CardValue.THREE, 'C'),
                new Card(CardValue.JACK, 'H'),
        });

        PokerHand player2FullHouse = new PokerHand(new Card[]{
                new Card(CardValue.EIGHT, 'C'),
                new Card(CardValue.TWO, 'S'),
                new Card(CardValue.TWO, 'D'),
                new Card(CardValue.EIGHT, 'S'),
                new Card(CardValue.EIGHT, 'H'),
        });

        PokerWinnerIdentifier pokerWinnerIdentifier = new PokerWinnerIdentifier(player1FullHouse, player2FullHouse);
        GameResult gameResult = pokerWinnerIdentifier.calculatePokerWinner();
        assertEquals(PokerHandType.FULLHOUSE, gameResult.getPokerHandRank().getPokerHandType());
        assertEquals("Player One", gameResult.getWinnerPlayer());
    }
}
