package jalau.at18.kingoftokyo.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.Turn;

public class PlayerStatusControllerTest {
    @Test
    public void shouldSetPlayerStatus() {
        Player player1 = new Player();
        player1.addMonster(Monster.ALIENOID);
        Player player2 = new Player();
        player2.addMonster(Monster.CYBER_KITTY);
        //Player[] playerList = {player1, player2};

        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(player1);
        playerList.add(player2);
        Turn turn = new Turn(playerList);
        PlayerStatusController playerController = new PlayerStatusController(turn);
        assertEquals(10, player1.getLifePoints());
        assertEquals(10, player2.getLifePoints());
        assertEquals(0, player1.getVictoryPoints());
        assertEquals(0, player1.getEnergy());
        int[] effectsSetter = {3, 2, 1, 4};
        playerController.setPlayersStatus(effectsSetter);
        assertEquals(13, player1.getLifePoints());
        assertEquals(8, player2.getLifePoints());
        assertEquals(1, player1.getVictoryPoints());
        assertEquals(4, player1.getEnergy());
    }
}
