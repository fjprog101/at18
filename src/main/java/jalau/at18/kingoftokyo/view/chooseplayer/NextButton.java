package jalau.at18.kingoftokyo.view.chooseplayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NextButton extends JButton {
    public static final int DEFAULT_WIDTH = 100;
    public static final int DEFAULT_HEIGHT = 40;

    public NextButton(ActionListener listener) {
        super("Next");
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        addActionListener(listener);
    }
}
