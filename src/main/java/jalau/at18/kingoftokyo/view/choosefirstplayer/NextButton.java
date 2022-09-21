package jalau.at18.kingoftokyo.view.choosefirstplayer;

import javax.swing.*;
import java.awt.event.ActionListener;

public class NextButton extends JButton {

    public NextButton(ActionListener listener) {
        super("Next");
        addActionListener(listener);
    }
}
