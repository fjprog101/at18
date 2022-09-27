package jalau.at18.kingoftokyo.view.choosemonsters;

import jalau.at18.kingoftokyo.controller.ChooseMonstersController;
import jalau.at18.kingoftokyo.view.general.ExitButton;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 100;
    private ChooseMonstersController chooseMonstersController;
    public ButtonsPanel(ChooseMonstersFrame frame) {
        chooseMonstersController = new ChooseMonstersController(frame);
        add(new ExitButton());
        add(new StartGameButton(chooseMonstersController));
        setBackground(Color.BLUE);
        initialize();
    }

    private void initialize() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }
}
