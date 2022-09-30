package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;
import jalau.at18.kingoftokyo.controller.WhoStartRollDiceController;
import jalau.at18.kingoftokyo.model.*;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;
import jalau.at18.kingoftokyo.view.whostart.*;

public class PanelSouthTest {
    @Test
    public void shouldPanelSouth() {

        Player player1 = new Player();
        player1.setMonster(Monster.ALIENOID);

        ArrayList<Player> playerList2 = new ArrayList<Player>();
        playerList2.add(player1);

        WhoStartFrame whoStartFrame = new WhoStartFrame(playerList2);

        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        ShowResultsPanel showResultsPanel = new ShowResultsPanel(playerList2);
        StartGameButton startGameButton = new StartGameButton(null);
        
        WhoStartRollDiceController whoStartRollDiceController = new WhoStartRollDiceController(whoStartFrame, rollDiceSectionUI, showResultsPanel, startGameButton);
        PanelSouth panelSouth = new PanelSouth(whoStartRollDiceController);
        assertEquals(300, panelSouth.getBounds().getX(), 0);
        assertEquals(400, panelSouth.getBounds().getY(), 0);
        
        assertEquals(600, panelSouth.getBounds().getWidth(), 0);
        assertEquals(200, panelSouth.getBounds().getHeight(), 0);


    }
}
