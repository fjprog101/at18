package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;

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

        assertEquals(2, showResultsPanel.getComponentCount());

    }
    @Test
    public void TextToplayername() {
        Player player1 = new Player();
        player1.setMonster(Monster.ALIENOID);
        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(player1);
        ShowResultsPanel showResultsPanel = new ShowResultsPanel(playerList);
        int cantPunching = 3;
        assertEquals("Alienoid", ((PlayerNameLabel)showResultsPanel.getComponent(1)).getText());
        showResultsPanel.setTextComponent(1, cantPunching);
        assertEquals(" * Alienoid punching amount  =  3", ((PlayerNameLabel)showResultsPanel.getComponent(1)).getText());
    }

    @Test
    public void shouldGivePlayersArrayList() {
        Player player1 = new Player();
        player1.setMonster(Monster.ALIENOID);
        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(player1);
        ShowResultsPanel showResultsPanel = new ShowResultsPanel(playerList);
        assertEquals(playerList, showResultsPanel.getArrayPlayer());
    }
}
