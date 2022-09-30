package jalau.at18.kingoftokyo.view;

import jalau.at18.kingoftokyo.controller.KeepDiceSectionController;
import jalau.at18.kingoftokyo.controller.RollDiceSectionController;
import jalau.at18.kingoftokyo.model.DiceFace;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceFaceLabel;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceFaceLabelMouseListener;
import jalau.at18.kingoftokyo.view.rolldicesection.KeepDiceSectionUI;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;
import org.junit.Test;

import javax.swing.*;
import java.awt.event.MouseEvent;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class DiceFaceLabelMouseListenerTest {
    @Test
    public void shouldBeClickedTheLabel() {
        // Setting values
        DiceFaceLabel diceFaceLabel = new DiceFaceLabel();
        diceFaceLabel.paintDiceFace(DiceFace.ENERGY);
        JButton rollDiceButton = new JButton();
        JButton keepDiceButton = new JButton();
        final int MAX_DICEFACE_SET = 6;
        // Mockings
        RollDiceSectionUI mockRollDiceSectionUI = mock(RollDiceSectionUI.class);
        KeepDiceSectionUI mockKeepDiceSectionUI = mock(KeepDiceSectionUI.class);
        KeepDiceSectionController mockKeepDiceSectionController = mock(KeepDiceSectionController.class);
        RollDiceSectionController mockRollDiceSectionController = mock(RollDiceSectionController.class);

        DiceFaceLabelMouseListener diceFaceLabelMouseListener
                = new DiceFaceLabelMouseListener(mockKeepDiceSectionController, mockRollDiceSectionController);

        MouseEvent mouseEvent = mock(MouseEvent.class);
        when(mouseEvent.getSource()).thenReturn(diceFaceLabel);
        // mock countRamdomDiceGenerated
        when(mockRollDiceSectionController.reduceCountRamdomDiceGenerated()).thenReturn(1);
        when(mockRollDiceSectionController.getRollDiceSectionUI()).thenReturn(mockRollDiceSectionUI);
        when(mockRollDiceSectionUI.getRollerDiceButton()).thenReturn(rollDiceButton);
        // mock keepDiceSectionController.getCountDiceFaceSet()
        when(mockKeepDiceSectionController.getCountDiceFaceSet()).thenReturn(MAX_DICEFACE_SET);
        when(mockKeepDiceSectionController.getKeepDiceSectionUI()).thenReturn(mockKeepDiceSectionUI);
        when(mockKeepDiceSectionUI.getKeepButton()).thenReturn(keepDiceButton);


        diceFaceLabelMouseListener.mouseClicked(mouseEvent);

        assertFalse(diceFaceLabel.isVisible());
        assertFalse(rollDiceButton.isEnabled());
        assertTrue(keepDiceButton.isVisible());
    }
}
