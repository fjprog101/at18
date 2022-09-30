package jalau.at18.azul.controller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import jalau.at18.azul.controllerazul.StackSenderController;
import jalau.at18.azul.controllerazul.TileController;
import jalau.at18.azul.model.BagSender;
import jalau.at18.azul.model.CenterTileBoard;
import jalau.at18.azul.model.Floor;
import jalau.at18.azul.model.PyramidValidation;
import jalau.at18.azul.model.Tile;
import jalau.at18.azul.model.TileColor;
import jalau.at18.azul.view.BagButton;
import jalau.at18.azul.view.CenterButtons;
import jalau.at18.azul.view.FactoryButtonGroup;
import jalau.at18.azul.view.FactoryPanel;
import jalau.at18.azul.view.FloorButtons;
import jalau.at18.azul.view.PointerGroup;
import jalau.at18.azul.view.PyramidBoard;
import jalau.at18.azul.view.PyramidPointer;
import jalau.at18.azul.view.StackButtonGroup;
import jalau.at18.azul.view.WallBoard;
import jalau.at18.azul.view.PlayerPanel;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class TileControllerTest {

    @Test
    public void shouldSendTilestoFactoriesandCleanPyramid() {
        StackButtonGroup stack = new StackButtonGroup(20);
        PlayerPanel player1 = new PlayerPanel(0, 0, stack);
        PlayerPanel player2 = new PlayerPanel(0, 0, stack);
        FactoryPanel factoryPanel = new FactoryPanel(stack, player1, player2);

        //BagSender gameAzul = new BagSender();
        CenterTileBoard firstplayer = new CenterTileBoard();
        Floor gamefloor = new Floor();
        FloorButtons floor1 = new FloorButtons(gamefloor);
        FloorButtons floor2 = new FloorButtons(gamefloor);

        CenterButtons center = new CenterButtons(firstplayer, stack, floor1, floor2, gamefloor);

        /////////////////Mock/////////////

        BagSender mockedStack = mock(BagSender.class);

        TileController controller = new TileController(factoryPanel, mockedStack, player2, player2, center, firstplayer, gamefloor);
       // ActionEvent mockedEvent = mock(ActionEvent.class);

        BagButton button = new BagButton(controller);
       // when(mockedEvent.getSource()).thenReturn(button);


        List<Tile> testbag = new ArrayList<>();
        testbag.add(new Tile(TileColor.RED));
        testbag.add(new Tile(TileColor.RED));
        testbag.add(new Tile(TileColor.RED));
        testbag.add(new Tile(TileColor.RED));

        when(mockedStack.getFactoryGroup()).thenReturn(testbag);

        controller.actionPerformed(null);

        verify(mockedStack, times(5)).getFactoryGroup();
    }
}
