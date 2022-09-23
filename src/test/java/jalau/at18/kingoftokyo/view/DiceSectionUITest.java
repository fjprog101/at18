package jalau.at18.kingoftokyo.view;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiceSectionUITest {
    @Test
    public void shouldHaveComponents() {
        DiceSectionUI diceSectionUI = new DiceSectionUI();
        assertEquals(2, diceSectionUI.getComponentCount());
    }
}
