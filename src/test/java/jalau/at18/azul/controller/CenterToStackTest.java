package jalau.at18.azul.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import jalau.at18.azul.controllerazul.CenterToStack;
import jalau.at18.azul.model.CenterTileBoard;
import jalau.at18.azul.view.CenterButtons;
import jalau.at18.azul.view.CenterTileButton;
import jalau.at18.azul.view.StackButtonGroup;
import jalau.at18.azul.view.TilesButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CenterToStackTest {

    @Test
    public void shouldUpdateLabelOfCenterButtons() {

        CenterTileBoard mockedCenterBoard = mock(CenterTileBoard.class);
        StackButtonGroup stack = new StackButtonGroup(0);
        CenterButtons mockedCenterButtons = mock(CenterButtons.class);

        CenterToStack controller = new CenterToStack(mockedCenterBoard, stack, mockedCenterButtons, null, null, null);

        ActionEvent mockedEvent = mock(ActionEvent.class);
        CenterTileButton center = new CenterTileButton(controller);
        when(mockedEvent.getSource()).thenReturn(center);
        controller.actionPerformed(mockedEvent);
        
    }
}
