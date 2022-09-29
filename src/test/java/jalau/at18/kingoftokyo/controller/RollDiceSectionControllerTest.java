package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.*;
import jalau.at18.kingoftokyo.view.rolldicesection.*;
import org.junit.Test;
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
    }
}
