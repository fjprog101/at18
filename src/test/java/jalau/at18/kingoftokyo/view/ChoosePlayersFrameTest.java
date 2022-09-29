package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import jalau.at18.kingoftokyo.view.chooseplayer.ChoosePlayersFrame;
import org.junit.Test;
import javax.swing.*;
import java.awt.*;

public class ChoosePlayersFrameTest {

    @Test
    public void shouldHaveComponents() {
        ChoosePlayersFrame playersFrame = new ChoosePlayersFrame();
        assertEquals(3, playersFrame.getContentPane().getComponentCount());
        assertEquals(JFrame.EXIT_ON_CLOSE, playersFrame.getDefaultCloseOperation());
        assertEquals(BorderLayout.class, playersFrame.getContentPane().getLayout().getClass());
        assertTrue(playersFrame.isVisible());
    }
}
