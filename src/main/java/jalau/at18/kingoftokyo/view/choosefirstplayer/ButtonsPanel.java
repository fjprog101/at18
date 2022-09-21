package jalau.at18.kingoftokyo.view.choosefirstplayer;

import jalau.at18.kingoftokyo.view.general.ExitButton;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 100;
    public ButtonsPanel() {
        add(new ExitButton());
        add(new NextButton());
        setBackground(Color.BLUE);
        initialize();
    }

    private void initialize() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }
}
