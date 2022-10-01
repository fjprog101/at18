package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.DiceFace;
import jalau.at18.kingoftokyo.view.TurnPanel;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceFaceLabel;
import jalau.at18.kingoftokyo.view.rolldicesection.KeepDiceSectionUI;
import org.junit.Test;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class KeepDiceSectionControllerTest {
    @Test
    public void shouldCalculateDiceRollerPlayerTurn() {
        PlayerStatusController mockPlayerStatusController = mock(PlayerStatusController.class);
        KeepDiceSectionUI mockKeepDiceSectionUI = mock(KeepDiceSectionUI.class);
        JButton keepButton = new JButton();
        when(mockKeepDiceSectionUI.getKeepButton()).thenReturn(keepButton);

        TurnPanel turnPanel = mock(TurnPanel.class);
        JLabel turnPanelLabel = new JLabel();
        when(turnPanel.getComponent(1)).thenReturn(turnPanelLabel);

        KeepDiceSectionController keepDiceSectionController = new KeepDiceSectionController(mockKeepDiceSectionUI);
        keepDiceSectionController.addTurnPanel(turnPanel);
        keepDiceSectionController.keepDice(DiceFace.ENERGY);
        keepDiceSectionController.keepDice(DiceFace.TWO);
        keepDiceSectionController.keepDice(DiceFace.TWO);
        keepDiceSectionController.keepDice(DiceFace.TWO);
        keepDiceSectionController.keepDice(DiceFace.PUNCHING);
        int[] result = {0, 1, 2, 1};
        keepDiceSectionController.calculateDiceResult();
        verify(mockKeepDiceSectionUI, times(1)).sendResults(result);
    }

    @Test
    public void shouldPutDiceFaceLabel() {
        // KeepDiceSectionController(KeepDiceSectionUI keepDiceSectionUI)
        List<DiceFaceLabel> listDiceFaceLabel = new ArrayList<>();
        listDiceFaceLabel.add(new DiceFaceLabel());
        listDiceFaceLabel.add(new DiceFaceLabel());
        listDiceFaceLabel.add(new DiceFaceLabel());
        listDiceFaceLabel.add(new DiceFaceLabel());
        listDiceFaceLabel.add(new DiceFaceLabel());
        listDiceFaceLabel.add(new DiceFaceLabel());

        DiceFaceLabel diceFaceLabel1 = new DiceFaceLabel();
        diceFaceLabel1.paintDiceFace(DiceFace.ENERGY);

        KeepDiceSectionUI keepDiceSectionUI = mock(KeepDiceSectionUI.class);
        when(keepDiceSectionUI.getListKeepDiceFaceLabel()).thenReturn(listDiceFaceLabel);
        when(keepDiceSectionUI.getKeepButton()).thenReturn(new JButton());

        KeepDiceSectionController keepDiceSectionController = new KeepDiceSectionController(keepDiceSectionUI);
        keepDiceSectionController.putDiceFaceLabel(diceFaceLabel1);



        assertEquals(1, keepDiceSectionController.getCountDiceFaceSet());
        assertEquals(DiceFace.ENERGY, keepDiceSectionController.getKeepDiceSectionUI()
                .getListKeepDiceFaceLabel().get(0).getPaintDiceFace());
    }

}
