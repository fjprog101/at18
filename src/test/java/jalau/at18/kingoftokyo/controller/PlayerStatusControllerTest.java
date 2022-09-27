package jalau.at18.kingoftokyo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.kingoftokyo.Monster;
import jalau.at18.kingoftokyo.Player;
import jalau.at18.kingoftokyo.Turn;
import jalau.at18.kingoftokyo.view.GameFrame;

public class PlayerStatusControllerTest {
    @Test
    public void shouldSetPlayerStatus() {
        Player player1 = new Player();
        player1.addMonster(Monster.ALIENOID);
        Player player2 = new Player();
        player2.addMonster(Monster.CYBER_KITTY);
        Player[] playerList = {player1, player2};
        Turn turn = new Turn(playerList);
        GameFrame gameFrame = new GameFrame(turn);
        PlayerStatusController playerController = new PlayerStatusController(gameFrame, turn);
        assertEquals(10, player1.getMonster().getLifePoints());
        assertEquals(10, player2.getMonster().getLifePoints());
        assertEquals(0, player1.getMonster().getVictoryPoints());
        assertEquals(0, player1.getEnergy());
        int[] effectsSetter = {3, 2, 1, 4};
        playerController.setPlayerStatus(effectsSetter);
        assertEquals(13, player1.getMonster().getLifePoints());
        assertEquals(8, player2.getMonster().getLifePoints());
        assertEquals(1, player1.getMonster().getVictoryPoints());
        assertEquals(4, player1.getEnergy());
    }
}
