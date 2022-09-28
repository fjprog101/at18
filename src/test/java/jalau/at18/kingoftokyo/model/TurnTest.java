package jalau.at18.kingoftokyo.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TurnTest {
    @Test
    public void shouldChangeThePlayerInTurn() {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(player3);
        playerList.add(player1);
        playerList.add(player2);
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
