package jalau.at18.kingoftokyo.view;

import jalau.at18.kingoftokyo.view.choosefirstplayer.ChooseFirstPlayerFrame;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChooseFirstPlayerFrameTest {

    @Test
    public void shouldHaveComponents() {
        ChooseFirstPlayerFrame firstPlayersFrame = new ChooseFirstPlayerFrame();
        assertEquals(3, firstPlayersFrame.getContentPane().getComponentCount());
        assertEquals(JFrame.EXIT_ON_CLOSE, firstPlayersFrame.getDefaultCloseOperation());
        assertEquals(BorderLayout.class, firstPlayersFrame.getContentPane().getLayout().getClass());
        assertTrue(firstPlayersFrame.isVisible());
    }
}
