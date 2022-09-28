package jalau.at18.kingoftokyo.view.choosemonsters;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StartGameButton extends JButton {
    public static final int DEFAULT_WIDTH = 100;
    public static final int DEFAULT_HEIGHT = 40;

    public StartGameButton(ActionListener listener) {
        super("Start");
        addActionListener(listener);
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }
}
