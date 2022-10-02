package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.*;
import jalau.at18.kingoftokyo.view.rolldicesection.*;
import org.junit.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RollDiceSectionControllerTest {
    @Test
    public void shouldInitializeDiceFaceLabels() {
        final int QUANTITY_DICES = 6;
        List<DiceFace> mockedResult = new ArrayList<DiceFace>();
        mockedResult.add(DiceFace.ONE);
        mockedResult.add(DiceFace.TWO);
        mockedResult.add(DiceFace.THREE);
        mockedResult.add(DiceFace.HEALING);
        mockedResult.add(DiceFace.ENERGY);
        mockedResult.add(DiceFace.PUNCHING);

        DiceRoller mockedDiceRoller = mock(DiceRoller.class);
        when(mockedDiceRoller.randomDice(QUANTITY_DICES)).thenReturn(mockedResult);

        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        RollDiceSectionController rollDiceSectionController = new RollDiceSectionController(rollDiceSectionUI, null);

        List<DiceFaceLabel> listDiceFaceLabel = rollDiceSectionUI.getListDiceFaceLabel();
        assertNotNull(listDiceFaceLabel.get(0));
        assertNotNull(listDiceFaceLabel.get(1));
        assertNotNull(listDiceFaceLabel.get(2));
        assertNotNull(listDiceFaceLabel.get(3));
        assertNotNull(listDiceFaceLabel.get(4));
        assertNotNull(listDiceFaceLabel.get(5));

        assertNotNull(rollDiceSectionController.reduceCountRamdomDiceGenerated());
        assertNotNull(rollDiceSectionController.reduceCountRollDicePlayer());
        assertNotNull(rollDiceSectionController.getRollDiceSectionUI());
    }

    @Test
    public void shouldReduceCountRamdomDiceGenerated() {
        final int QUANTITY_DICE = 6;
        final int EXPECTED_DICE = 5;
        List<DiceFace> mockedResult = new ArrayList<DiceFace>();
        mockedResult.add(DiceFace.ONE);
        mockedResult.add(DiceFace.TWO);
        mockedResult.add(DiceFace.THREE);
        mockedResult.add(DiceFace.HEALING);
        mockedResult.add(DiceFace.ENERGY);
        mockedResult.add(DiceFace.PUNCHING);

        DiceRoller mockedDiceRoller = mock(DiceRoller.class);
        when(mockedDiceRoller.randomDice(QUANTITY_DICE)).thenReturn(mockedResult);

        KeepDiceSectionController mockKeepDiceSectionController = mock(KeepDiceSectionController.class);
        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        RollDiceSectionController rollDiceSectionController = new RollDiceSectionController(rollDiceSectionUI, null);

        List<DiceFaceLabel> listDiceFaceLabel = rollDiceSectionUI.getListDiceFaceLabel();
        listDiceFaceLabel.get(0).setVisible(false);
        rollDiceSectionController.reduceCountRamdomDiceGenerated();
        assertEquals(EXPECTED_DICE, rollDiceSectionController.reduceCountRamdomDiceGenerated());
    }

    @Test
    public void shouldPlayerInitializeTurnRolldice() {
        final int QUANTITY_DICE = 6;
        final int CANT_TURN = 3;
        List<DiceFace> mockedResult = new ArrayList<DiceFace>();
        mockedResult.add(DiceFace.ONE);
        mockedResult.add(DiceFace.TWO);
        mockedResult.add(DiceFace.THREE);
        mockedResult.add(DiceFace.HEALING);
        mockedResult.add(DiceFace.ENERGY);
        mockedResult.add(DiceFace.PUNCHING);

        DiceRoller mockedDiceRoller = mock(DiceRoller.class);
        when(mockedDiceRoller.randomDice(QUANTITY_DICE)).thenReturn(mockedResult);

        KeepDiceSectionController mockKeepDiceSectionController = mock(KeepDiceSectionController.class);
        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();

        RollDiceSectionController rollDiceSectionController = new RollDiceSectionController(rollDiceSectionUI, null);
        assertEquals(CANT_TURN, rollDiceSectionController.reduceCountRollDicePlayer());
    }

    @Test
    public void shouldResetUI() {
        KeepDiceSectionController mockKeepDiceSectionController = mock(KeepDiceSectionController.class);
        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();

        RollDiceSectionController rollDiceSectionController = new RollDiceSectionController(rollDiceSectionUI, null);

        List<DiceFaceLabel> listDiceFaceLabel = new ArrayList<>();
        final int QUANTITY_DICES = 6;
        rollDiceSectionUI.initializeDice();

        rollDiceSectionUI.getRollerDiceButton().setEnabled(false);
        for (int index = 1; index <= QUANTITY_DICES; index++) {
            DiceFaceLabel diceFaceLabel = new DiceFaceLabel();
            diceFaceLabel.setVisible(false);
            listDiceFaceLabel.add(diceFaceLabel);
        }

        rollDiceSectionUI.resetUI();

        rollDiceSectionUI.getRollerDiceButton().setEnabled(true);
        for (DiceFaceLabel diceFaceLabel : listDiceFaceLabel) {
            diceFaceLabel.setVisible(true);
        }
        assertNotNull(rollDiceSectionUI.getListDiceFaceLabel());
    }

    @Test
    public void shouldGenerateListRandomDiceFace() {
        final int QUANTITY_DICES = 6;
        List<DiceFaceLabel> mockedDiceFaceLabelResult = new ArrayList<DiceFaceLabel>();
        DiceFaceLabel diceFaceLabel = new DiceFaceLabel();
        DiceFaceLabel diceFaceLabel2 = new DiceFaceLabel();
        DiceFaceLabel diceFaceLabel3 = new DiceFaceLabel();
        DiceFaceLabel diceFaceLabel4 = new DiceFaceLabel();
        DiceFaceLabel diceFaceLabel5 = new DiceFaceLabel();
        DiceFaceLabel diceFaceLabel6 = new DiceFaceLabel();
        mockedDiceFaceLabelResult.add(diceFaceLabel);
        mockedDiceFaceLabelResult.add(diceFaceLabel2);
        mockedDiceFaceLabelResult.add(diceFaceLabel3);
        mockedDiceFaceLabelResult.add(diceFaceLabel4);
        mockedDiceFaceLabelResult.add(diceFaceLabel5);
        mockedDiceFaceLabelResult.add(diceFaceLabel6);

        JButton rollerButton = new JButton();

        KeepDiceSectionController mockKeepDiceSectionController = mock(KeepDiceSectionController.class);
        RollDiceSectionUI mockRollDiceSectionUI = mock(RollDiceSectionUI.class);

        when(mockRollDiceSectionUI.getListDiceFaceLabel()).thenReturn(mockedDiceFaceLabelResult);
        when(mockRollDiceSectionUI.getRollerDiceButton()).thenReturn(rollerButton);

        RollDiceSectionController rollDiceSectionController
                = new RollDiceSectionController(mockRollDiceSectionUI, null);
        rollerButton.doClick();

        List<DiceFaceLabel> listDiceFaceLabel
                = rollDiceSectionController.getRollDiceSectionUI().getListDiceFaceLabel();
        assertTrue(listDiceFaceLabel.get(0).isInitialize());
        rollerButton.doClick();
        rollerButton.doClick();
        assertFalse(rollerButton.isEnabled());
    }
}
