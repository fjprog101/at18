package jalau.at18.kingoftokyo.view;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerButtonTest {
    @Test
    public void shouldSetupAsButtonWithRollText() {
        RollerButton roller = new RollerButton(null);
        assertEquals("Roll Dice", roller.getText());
        assertEquals(RollerButton.DEFAULT_POSX, roller.getBounds().getX(), 0);
        assertEquals(RollerButton.DEFAULT_POSY, roller.getBounds().getY(), 0);
        assertEquals(RollerButton.DEFAULT_WIDTH, roller.getBounds().getWidth(), 0);
        assertEquals(RollerButton.DEFAULT_HEIGHT, roller.getBounds().getHeight(), 0);
    }


}
