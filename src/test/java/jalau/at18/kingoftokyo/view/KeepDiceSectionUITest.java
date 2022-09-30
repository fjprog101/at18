package jalau.at18.kingoftokyo.view;

import jalau.at18.kingoftokyo.controller.PlayerStatusController;
import jalau.at18.kingoftokyo.model.DiceFace;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceFaceLabel;
import jalau.at18.kingoftokyo.view.rolldicesection.KeepDiceSectionUI;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class KeepDiceSectionUITest {
    @Test
    public void testResetUI() {
        PlayerStatusController mockPlayerStatusController = mock(PlayerStatusController.class);
        KeepDiceSectionUI keepDiceSectionUI = new KeepDiceSectionUI(mockPlayerStatusController);
        keepDiceSectionUI.initializeDice();
        keepDiceSectionUI.getKeepButton().setVisible(true);
        for (DiceFaceLabel diceFaceLabel : keepDiceSectionUI.getListKeepDiceFaceLabel()) {
            diceFaceLabel.paintDiceFace(DiceFace.ENERGY);
        }

        keepDiceSectionUI.resetUI();

        for (DiceFaceLabel diceFaceLabel : keepDiceSectionUI.getListKeepDiceFaceLabel()) {
            assertFalse(diceFaceLabel.isInitialize());
        }
        assertFalse(keepDiceSectionUI.getKeepButton().isVisible());
    }

    @Test
    public void verifySetPlayer() {
        PlayerStatusController mockPlayerStatusController = mock(PlayerStatusController.class);
        KeepDiceSectionUI keepDiceSectionUI = new KeepDiceSectionUI(mockPlayerStatusController);
        int[] effect = new int[]{1, 2, 3, 2};
        keepDiceSectionUI.sendResults(effect);

        verify(mockPlayerStatusController, times(1)).setPlayersStatus(effect);
    }
}
