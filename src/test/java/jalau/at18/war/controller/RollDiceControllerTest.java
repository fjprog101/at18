package jalau.at18.war.controller;

import org.junit.Test;

import jalau.at18.war.model.Player;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class RollDiceControllerTest {

     @Test
     public void shouldRollDiceAndUpdateDiceLabels(){
        // MOCKING!!!
        // mock game, so when controller invokes rollDice(), we can verify that method of mocked object has been called
        Player mockedPlayer = mock(Player.class);
        RollDiceController controller = new RollDiceController(mockedPlayer);

        // invoke method that is called by button event, no need to send an event
        controller.actionPerformed(null);

        // Verify DiceLabelGroup labels have been updated with rolled dice
        verify(mockedPlayer, times(1)).rollDice();
    }
}