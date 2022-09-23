package jalau.at18.war.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import javax.swing.JFrame;
import org.junit.Test;

public class WarFrameTest {

    @Test
    public void shouldHave4PlayersAndWorldMap() {
        WarFrame warFrame = new WarFrame();
        assertEquals(5, warFrame.getContentPane().getComponentCount());
        assertEquals(JFrame.EXIT_ON_CLOSE, warFrame.getDefaultCloseOperation());
        assertEquals(JFrame.MAXIMIZED_BOTH, warFrame.getExtendedState());
        assertNotNull(warFrame.getLayout());
        assertTrue(warFrame.isVisible());
    }
}
