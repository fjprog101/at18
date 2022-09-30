package jalau.at18.azul.controller;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import jalau.at18.azul.controllerazul.MoveTileController;
import jalau.at18.azul.controllerazul.StackSenderController;
import jalau.at18.azul.model.CenterTileBoard;
import jalau.at18.azul.model.Factory;
import jalau.at18.azul.model.Floor;
import jalau.at18.azul.model.Tile;
import jalau.at18.azul.view.CenterButtons;
import jalau.at18.azul.view.FactoryButtonGroup;
import jalau.at18.azul.view.FloorButtons;
import jalau.at18.azul.view.PointerGroup;
import jalau.at18.azul.view.PyramidBoard;
import jalau.at18.azul.view.PyramidPointer;
import jalau.at18.azul.view.StackButtonGroup;
import jalau.at18.azul.view.TilesButton;

import java.awt.event.ActionEvent;
public class MoveTileControllerTest {
    
    @Test
    public void shouldMovetiles() {
        FactoryButtonGroup factorymockedStack = mock(FactoryButtonGroup.class);
        CenterButtons center = new CenterButtons(null, null, null, null, null);
        CenterTileBoard centertile = new CenterTileBoard();
        StackButtonGroup stack = mock(StackButtonGroup.class);

        MoveTileController controller = new MoveTileController(center, centertile, factorymockedStack, stack);

        ActionEvent mockedEvent = mock(ActionEvent.class);
        TilesButton button = new TilesButton(controller);
        when(mockedEvent.getSource()).thenReturn(button);
        controller.actionPerformed(mockedEvent);

        verify(factorymockedStack, times(1)).fillArrayList();


    }
}
