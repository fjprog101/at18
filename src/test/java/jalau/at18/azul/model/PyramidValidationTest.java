package jalau.at18.azul.model;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import jalau.at18.azul.controllerazul.StackSenderController;
import jalau.at18.azul.view.FloorButtons;
import jalau.at18.azul.view.PointerGroup;
import jalau.at18.azul.view.PyramidBoard;
import jalau.at18.azul.view.PyramidPointer;
import jalau.at18.azul.view.StackButtonGroup;
import java.awt.event.ActionEvent;

public class PyramidValidationTest {

    @Test
    public void ShouldValidatePyramid() {

        StackButtonGroup stackButtonGroup =  new StackButtonGroup(20);
        PyramidBoard pyramidBoard = new PyramidBoard();
        Floor colorPyramidTilesList = new Floor();
        FloorButtons floor = new FloorButtons(colorPyramidTilesList);
        //PointerGroup pointerGroup = new PointerGroup(stackButtonGroup, pyramidBoard, floor, colorPyramidTilesList);
        PointerGroup mockedPointer = mock(PointerGroup.class);

        ActionEvent mockedEvent = mock(ActionEvent.class);
        StackSenderController mockedController = mock(StackSenderController.class);
        PyramidPointer button = new PyramidPointer(mockedController);
        when(mockedPointer.getComponent(0)).thenReturn(button);
        mockedController.actionPerformed(mockedEvent);
        when(mockedEvent.getSource()).thenReturn(button);

        PyramidValidation validation = new PyramidValidation(pyramidBoard, stackButtonGroup, mockedPointer, colorPyramidTilesList);

        assertTrue(!validation.validatePointer(0, false, mockedEvent));
    }
}
