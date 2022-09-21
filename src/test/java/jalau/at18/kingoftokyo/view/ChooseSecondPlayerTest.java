package jalau.at18.kingoftokyo.view;

import jalau.at18.kingoftokyo.view.choosesecondplayer.ChooseSecondPlayerFrame;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChooseSecondPlayerTest {
    @Test
    public void shouldHaveComponents() {
        ChooseSecondPlayerFrame secondPlayersFrame = new ChooseSecondPlayerFrame();
        assertEquals(3, secondPlayersFrame.getContentPane().getComponentCount());
        assertEquals(JFrame.EXIT_ON_CLOSE, secondPlayersFrame.getDefaultCloseOperation());
        assertEquals(BorderLayout.class, secondPlayersFrame.getContentPane().getLayout().getClass());
        assertTrue(secondPlayersFrame.isVisible());
    }
}
