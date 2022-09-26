package jalau.at18.kingoftokyo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TurnTest {
    @Test
    public void shouldChangeThePlayerInTurn() {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player[] playerList = {player3, player1, player2};
        Turn turn = new Turn(playerList);
        assertEquals(player3, turn.getPlayerWithTheTurn());
        turn.changePlayerWithTheTurn();
        assertEquals(player1, turn.getPlayerWithTheTurn());
        turn.changePlayerWithTheTurn();
        assertEquals(player2, turn.getPlayerWithTheTurn());
        turn.changePlayerWithTheTurn();
        assertEquals(player3, turn.getPlayerWithTheTurn());
    }
}
