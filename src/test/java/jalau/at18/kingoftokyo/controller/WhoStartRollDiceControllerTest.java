package jalau.at18.kingoftokyo.controller;
import org.junit.Test;
import jalau.at18.kingoftokyo.model.*;
import jalau.at18.kingoftokyo.view.rolldicesection.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;




import jalau.at18.kingoftokyo.controller.WhoStartRollDiceController;
import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;
import jalau.at18.kingoftokyo.view.whostart.PanelSouth;
import jalau.at18.kingoftokyo.view.whostart.ShowResultsPanel;
import jalau.at18.kingoftokyo.view.whostart.StartGameButton;
import jalau.at18.kingoftokyo.view.whostart.WhoStartFrame;

public class WhoStartRollDiceControllerTest {
    @Test
    public void showWhoStartRollDiceController() {

        final int QUANTITY_DICES = 6;
        List<DiceFace> mockedResult = new ArrayList<DiceFace>();
        mockedResult.add(DiceFace.ONE);
        mockedResult.add(DiceFace.TWO);
        mockedResult.add(DiceFace.THREE);
        mockedResult.add(DiceFace.HEALING);
        mockedResult.add(DiceFace.ENERGY);
        mockedResult.add(DiceFace.PUNCHING);

        DiceRoller mockedDiceRoller = mock(DiceRoller.class);
        when(mockedDiceRoller.randomDice(QUANTITY_DICES)).thenReturn(mockedResult);



        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();



        Player player1 = new Player();
        player1.setMonster(Monster.ALIENOID);
        ArrayList<Player> playerList2 = new ArrayList<Player>();
        playerList2.add(player1);
        WhoStartFrame whoStartFrame = new WhoStartFrame(playerList2);
        //RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        ShowResultsPanel showResultsPanel = new ShowResultsPanel(playerList2);
        StartGameButton startGameButton = new StartGameButton(null);

        WhoStartRollDiceController whoStartRollDiceController = new WhoStartRollDiceController(whoStartFrame, rollDiceSectionUI, showResultsPanel, startGameButton);

    }
}
