package jalau.at18.kingoftokyo.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import javax.swing.JLabel;

import org.junit.Test;

import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.Turn;
import jalau.at18.kingoftokyo.view.TurnPanel;

public class EndTurnButtonControllerTest {
    @Test
    public void shouldChangeThePlayerWithTurn() {
        Player player1 = new Player();
        player1.addMonster(Monster.ALIENOID);
        Player player2 = new Player();
        player2.addMonster(Monster.CYBER_KITTY);
        Player player3 = new Player();
        player3.addMonster(Monster.SPACE_PENGUIN);
        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(player3);
        playerList.add(player1);
        playerList.add(player2);
        Turn turn = new Turn(playerList);
        TurnPanel turnPanel = new TurnPanel(turn);
        EndTurnButtonController button = new EndTurnButtonController(turn, turnPanel);
        assertEquals(player3, turn.getPlayerWithTheTurn());
        assertEquals("Turn of: Space Penguin", ((JLabel)turnPanel.getComponent(0)).getText());
        button.actionPerformed(null);
        assertEquals(player1, turn.getPlayerWithTheTurn());
        assertEquals("Turn of: Alienoid", ((JLabel)turnPanel.getComponent(0)).getText());
        button.actionPerformed(null);
        assertEquals(player2, turn.getPlayerWithTheTurn());
        assertEquals("Turn of: Cyber Kitty", ((JLabel)turnPanel.getComponent(0)).getText());
    }
}
