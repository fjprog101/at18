package jalau.at18.kingoftokyo.view;

import jalau.at18.kingoftokyo.view.choosemonsters.ChooseMonstersFrame;
import org.junit.Test;
import javax.swing.*;
import java.awt.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChooseMonstersFrameTest {

    @Test
    public void shouldHaveComponents() {
        ChooseMonstersFrame chooseMonstersFrame = new ChooseMonstersFrame();
        assertEquals(3, chooseMonstersFrame.getContentPane().getComponentCount());
        assertEquals(JFrame.EXIT_ON_CLOSE, chooseMonstersFrame.getDefaultCloseOperation());
        assertEquals(BorderLayout.class, chooseMonstersFrame.getContentPane().getLayout().getClass());
        assertTrue(chooseMonstersFrame.isVisible());
    }
}
