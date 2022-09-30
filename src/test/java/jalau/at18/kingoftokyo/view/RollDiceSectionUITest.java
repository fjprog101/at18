package jalau.at18.kingoftokyo.view;

import jalau.at18.kingoftokyo.view.rolldicesection.DiceFaceLabel;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RollDiceSectionUITest {
    @Test
    public void shouldHaveButton() {
        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        assertEquals("Roll Dice", rollDiceSectionUI.getRollerDiceButton().getText());
        assertTrue(rollDiceSectionUI.isVisible());
    }

    @Test
    public void shouldHaveListDiceFaceLabel() {
        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        assertNotNull(rollDiceSectionUI.getListDiceFaceLabel());
    }

    @Test
    public void shouldResetUI() {
        List<DiceFaceLabel> listDiceFaceLabel = new ArrayList<>();
        final int QUANTITY_DICES = 6;
        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
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
}
