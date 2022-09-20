package jalau.at18.war.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.swing.JFrame;

import org.junit.Test;

public class WarFrameTest {

    @Test
    public void shouldHaveRollerAndDice() {
        WarFrame warFrame = new WarFrame();
        assertEquals(2, warFrame.getContentPane().getComponentCount());
        assertEquals(JFrame.EXIT_ON_CLOSE, warFrame.getDefaultCloseOperation());
        assertEquals(null, warFrame.getContentPane().getLayout());
        assertTrue(warFrame.isVisible());
    }
}
