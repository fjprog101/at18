package jalau.at18.azul.controller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import jalau.at18.azul.controllerazul.StackSenderController;
import jalau.at18.azul.model.Floor;
import jalau.at18.azul.view.FloorButtons;
import jalau.at18.azul.view.PointerGroup;
import jalau.at18.azul.view.PyramidBoard;
import jalau.at18.azul.view.PyramidPointer;
import jalau.at18.azul.view.StackButtonGroup;
import java.awt.event.ActionEvent;

public class StackSenderControllerTest {

    @Test
    public void shouldSendTilesFromStack() {
        StackButtonGroup mockedStack = mock(StackButtonGroup.class);
        PyramidBoard pyramidBoard = new PyramidBoard();
        Floor floort = new Floor();
        FloorButtons floorButtons = new FloorButtons(floort);
        PointerGroup pointerGroup = new PointerGroup(mockedStack, pyramidBoard, floorButtons, floort);

        StackSenderController controller = new StackSenderController(mockedStack, pointerGroup, pyramidBoard, floorButtons, floort);

        ActionEvent mockedEvent = mock(ActionEvent.class);
        PyramidPointer button = new PyramidPointer(controller);
        when(mockedEvent.getSource()).thenReturn(button);
        controller.actionPerformed(mockedEvent);

        verify(mockedStack, times(1)).sentStackColorList();


    }
}
