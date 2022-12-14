package jalau.at18.architects.controller;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;

import org.junit.Test;

import jalau.at18.architects.view.WondersFrame;
public class ControllerTest {
    @Test
     public void shoulPressStartButtonAndCheckBox() {
        WondersFrame frame = new WondersFrame();
        Controller controller = new Controller(frame);
        JButton button = frame.getButton();
        JComboBox<Integer> comboBox = frame.getChoice();
        ActionEvent event= new ActionEvent(button, 1001, "Start");
        ActionEvent eventCombo= new ActionEvent(comboBox, 1001, "comboBoxChanged");
        controller.actionPerformed(eventCombo);
        controller.actionPerformed(event);
        assertTrue(controller.startButtonIsActivated());
        assertTrue(controller.checkBoxIsActived());
    }
    @Test
     public void shoulPressStartButton() {
        WondersFrame frame = new WondersFrame();
        Controller controller = new Controller(frame);
        JButton button = frame.getButton();
        ActionEvent event= new ActionEvent(button, 1001, "Start");
        controller.actionPerformed(event);
        assertFalse(controller.startButtonIsActivated());
        assertFalse(controller.checkBoxIsActived());
    }
    @Test
     public void shoulPressCheckBox() {
        WondersFrame frame = new WondersFrame();
        Controller controller = new Controller(frame);
        JComboBox<Integer> comboBox = frame.getChoice();
        ActionEvent eventCombo= new ActionEvent(comboBox, 1001, "comboBoxChanged");
        controller.actionPerformed(eventCombo);
        assertFalse(controller.startButtonIsActivated());
        assertTrue(controller.checkBoxIsActived());
        assertEquals(4, frame.getContentPane().getComponentCount());
        controller.actionPerformed(eventCombo);
        assertEquals(4, frame.getContentPane().getComponentCount());
    }
}
