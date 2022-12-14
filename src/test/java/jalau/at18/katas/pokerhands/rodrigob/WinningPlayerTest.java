package jalau.at18.katas.pokerhands.rodrigob;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;

import org.junit.Test;

import jalau.at18.katas.pokerhands.rodrigob.Cards.Card;
import jalau.at18.katas.pokerhands.rodrigob.Cards.CardValue;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public class WinningPlayerTest {

    @Test
    public void shouldSayWhoIsTheWinner() {
        WinningPlayer winnerPlayer1 = new WinningPlayer();

        PokerHand player1HandWinner = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C')
        ));

        PokerHand player2HandLosser = new PokerHand(Arrays.asList(
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'C')
        ));

        Player player1 = new Player(player1HandWinner, "Black");
        Player player2 = new Player(player2HandLosser, "White");

        assertEquals(player1, winnerPlayer1.getWinner(player1, player2));
        assertNotEquals(player2, winnerPlayer1.getWinner(player1, player2));


        WinningPlayer winnerPlayer2 = new WinningPlayer();

        PokerHand player1HandLosser = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C')
        ));

        PokerHand player2HandWinner = new PokerHand(Arrays.asList(
            new Card(CardValue.ACE, 'C'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.JACK, 'C'),
            new Card(CardValue.TEN, 'C'),
            new Card(CardValue.SIX, 'C')
        ));

        player1 = new Player(player1HandLosser, "Black");
        player2 = new Player(player2HandWinner, "White");

        assertEquals(player2, winnerPlayer2.getWinner(player1, player2));
        assertNotEquals(player1, winnerPlayer2.getWinner(player1, player2));

        WinningPlayer tie = new WinningPlayer();

        PokerHand player1HandTie = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'C'),
            new Card(CardValue.THREE, 'H'),
            new Card(CardValue.FOUR, 'C'),
            new Card(CardValue.FIVE, 'S'),
            new Card(CardValue.SIX, 'C')
        ));

        PokerHand player2HandTie = new PokerHand(Arrays.asList(
            new Card(CardValue.TWO, 'H'),
            new Card(CardValue.THREE, 'C'),
            new Card(CardValue.FOUR, 'H'),
            new Card(CardValue.FIVE, 'C'),
            new Card(CardValue.SIX, 'H')
        ));

        player1 = new Player(player1HandTie, "Black");
        player2 = new Player(player2HandTie, "White");

        assertEquals("Tie", tie.getWinner(player1, player2).getPlayerName());
        assertNotEquals(player1, tie.getWinner(player1, player2));
        assertNotEquals(player2, tie.getWinner(player1, player2));
    }
}
