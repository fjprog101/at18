package jalau.at18.kingoftokyo.controller;
import org.junit.Test;
import jalau.at18.kingoftokyo.model.*;
import java.util.ArrayList;
import static org.junit.Assert.*;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;
import jalau.at18.kingoftokyo.view.whostart.*;

public class WhoStartRollDiceControllerTest {
    @Test
    public void showWhoStartRollDiceController() {

        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        Player player1 = new Player();
        player1.setMonster(Monster.ALIENOID);
        ArrayList<Player> playerList2 = new ArrayList<Player>();
        playerList2.add(player1);
        WhoStartFrame whoStartFrame = new WhoStartFrame(playerList2);
        ShowResultsPanel showResultsPanel = new ShowResultsPanel(playerList2);
        StartGameButton startGameButton = new StartGameButton(null);

        WhoStartRollDiceController whoStartRollDiceController = new WhoStartRollDiceController(whoStartFrame, rollDiceSectionUI, showResultsPanel, startGameButton);
        assertNotNull(whoStartRollDiceController.getListRandomDiceFace());
        assertNotNull(whoStartRollDiceController.getCountPounching());

    }
}
