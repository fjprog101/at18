package jalau.at18.kingoftokyo.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.TokyoCity;
import jalau.at18.kingoftokyo.model.Turn;

public class PlayerStatusControllerTest {
    @Test
    public void shouldSetPlayerStatus() {
        TokyoCity tokyoCity = new TokyoCity();
        Player player1 = new Player();
        player1.addMonster(Monster.ALIENOID);
        Player player2 = new Player();
        player2.addMonster(Monster.CYBER_KITTY);

        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(player1);
        playerList.add(player2);
        Turn turn = new Turn(playerList);
        PlayerStatusController playerController = new PlayerStatusController(turn, tokyoCity);
        assertEquals(10, player1.getLifePoints());
        assertEquals(10, player2.getLifePoints());
        assertEquals(0, player1.getVictoryPoints());
        assertEquals(0, player1.getEnergy());
        int[] effectsSetter = {3, 2, 1, 4 };
        tokyoCity.addMonster(player1);
        playerController.setPlayersStatus(effectsSetter);
        assertEquals(10, player1.getLifePoints());
        assertEquals(8, player2.getLifePoints());
        assertEquals(1, player1.getVictoryPoints());
        assertEquals(4, player1.getEnergy());

        turn.changePlayerWithTheTurn();
        int[] effectsSetter1 = {1, 3, 23, 4 };
        playerController.setPlayersStatus(effectsSetter1);
        assertEquals(7, player1.getLifePoints());
        assertEquals(9, player2.getLifePoints());
        assertEquals(20, player2.getVictoryPoints());
        turn.changePlayerWithTheTurn();

        int[] effectsSetter2 = {1, 10, 1, 4 };
        playerController.setPlayersStatus(effectsSetter2);
        assertEquals(8, player1.getLifePoints());
        assertEquals(0, player2.getLifePoints());
        
    }
}
