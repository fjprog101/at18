package jalau.at18.kingoftokyo.view;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.view.whostart.PlayerNameLabel;
import jalau.at18.kingoftokyo.view.whostart.ShowResultsPanel;

public class ShowResultsPanelTest {
    @Test
    public void positionShouldResultsPanel() {
        Player player1 = new Player();
        player1.setMonster(Monster.ALIENOID);

        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(player1);

        ShowResultsPanel showResultsPanel = new ShowResultsPanel(playerList);
        assertEquals(650, showResultsPanel.getBounds().getX(), 0);
        assertEquals(50, showResultsPanel.getBounds().getY(), 0);

        assertEquals(300, showResultsPanel.getBounds().getWidth(), 0);
        assertEquals(200, showResultsPanel.getBounds().getHeight(), 0);

        int index = 1;
        assertNotNull(showResultsPanel.getPlayerNameLabel(index));
        assertNotNull(showResultsPanel.getArrayPlayer());
    }
    @Test
    public void TextToplayername() {
        
        String playername = "name";
        PlayerNameLabel playerNameLabel = new PlayerNameLabel(playername);
        int cantPunching = 3;
        playerNameLabel.setPlayerName(cantPunching);
        assertEquals(" * name punching amount  =  3", playerNameLabel.getText());

    }
}
