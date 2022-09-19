package jalau.at18.war.view;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RollerButtonTest {

    @Test
    public void shouldSetupAsButtonWithRollText() {
        RollerButton roller = new RollerButton();
        assertEquals("Roll!", roller.getText());
        assertEquals(RollerButton.DEFAULT_POSX, roller.getBounds().getX(), 0);
        assertEquals(RollerButton.DEFAULT_POSY, roller.getBounds().getY(), 0);
        assertEquals(RollerButton.DEFAULT_WIDTH, roller.getBounds().getWidth(), 0);
        assertEquals(RollerButton.DEFAULT_HEIGHT, roller.getBounds().getHeight(), 0);
    }
}
