package jalau.at18.kingoftokyo.view;

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
