package jalau.at18.azul.model;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import jalau.at18.azul.controllerazul.StackSenderController;
import jalau.at18.azul.view.FloorButtons;
import jalau.at18.azul.view.PointerGroup;
import jalau.at18.azul.view.PyramidBoard;
import jalau.at18.azul.view.PyramidPointer;
import jalau.at18.azul.view.StackButtonGroup;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class PyramidValidationTest {

    @Test
    public void ShouldValidatePyramid() {

        StackButtonGroup mockedStack =  mock(StackButtonGroup.class);
        PyramidBoard pyramidBoard = new PyramidBoard();
        Floor colorPyramidTilesList = new Floor();
        PointerGroup mockedPointer = mock(PointerGroup.class);

        ActionEvent mockedEvent = mock(ActionEvent.class);
        StackSenderController mockedController = mock(StackSenderController.class);
        PyramidPointer button = new PyramidPointer(mockedController);

        List<Tile> expected = new ArrayList<Tile>();
        expected.add(new Tile(TileColor.RED));


        when(mockedPointer.getComponent(0)).thenReturn(button);
        mockedController.actionPerformed(mockedEvent);
        when(mockedEvent.getSource()).thenReturn(button);
        when(mockedStack.getStackColorList()).thenReturn(expected);

        PyramidValidation validation = new PyramidValidation(pyramidBoard, mockedStack, mockedPointer, colorPyramidTilesList);

        assertTrue(validation.validatePointer(0, false, mockedEvent));
    }
}
