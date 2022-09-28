package jalau.at18.kingoftokyo.view;

import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;
import org.junit.Test;
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

}
