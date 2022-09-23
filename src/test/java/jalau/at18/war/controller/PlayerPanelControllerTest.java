package jalau.at18.war.controller;

import org.junit.Test;

import jalau.at18.war.model.Die;
import jalau.at18.war.model.DieFace;
import jalau.at18.war.model.Game;
import jalau.at18.war.view.DieLabel;
import jalau.at18.war.view.DiceLabelGroup;
import jalau.at18.war.view.PlayerPanel;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class PlayerPanelControllerTest {

     @Test
     public void shouldRollDiceAndUpdateDiceLabels(){
        // MOCKING!!!
        List<Die> mockedResult = new ArrayList<Die>();
        mockedResult.add(new Die(DieFace.ONE));
        mockedResult.add(new Die(DieFace.THREE));
        mockedResult.add(new Die(DieFace.SIX));

        // mock game, so when controller invokes rollDice(), it returns our mocked result
        Game mockedGame = mock(Game.class);
        // stubbing rollDice()
        when(mockedGame.rollDice()).thenReturn(mockedResult);

        PlayerPanel playerPanel = new PlayerPanel(mockedGame);
        PlayerPanelController controller = playerPanel.getController();

        // invoke method that is called by button event, no need to send an event
        controller.actionPerformed(null);

        // Verify DiceLabelGroup labels have been updated with rolled dice
        DiceLabelGroup dieLabelGroup = playerPanel.getDiceLabelGroup();
        assertEquals(DieFace.ONE.getSymbol(), ((DieLabel)dieLabelGroup.getComponent(0)).getText());
        assertEquals(DieFace.THREE.getSymbol(), ((DieLabel)dieLabelGroup.getComponent(1)).getText());
        assertEquals(DieFace.SIX.getSymbol(), ((DieLabel)dieLabelGroup.getComponent(2)).getText());
    }
}