package jalau.at18.kingoftokyo.view.chooseplayer;

import jalau.at18.kingoftokyo.view.chooseplayer.NextButton;
import jalau.at18.kingoftokyo.view.general.ExitButton;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    public ButtonsPanel() {
        add(new ExitButton());
        add(new NextButton());
        setBackground(Color.BLUE);
        initialize();
    }

    private void initialize() {
        setPreferredSize(new Dimension(100,100));
    }
}
