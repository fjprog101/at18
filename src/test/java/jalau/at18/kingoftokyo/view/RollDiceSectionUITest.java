package jalau.at18.kingoftokyo.view;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RollDiceSectionUITest {
    @Test
    public void shouldHaveButton() {
        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        assertEquals("Roll Dice", rollDiceSectionUI.getRollerDiceButton().getText());
    }

    @Test
    public void shouldHaveListDiceFaceLabel() {
        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        assertNotNull(rollDiceSectionUI.getListDiceFaceLabel());
    }

}
