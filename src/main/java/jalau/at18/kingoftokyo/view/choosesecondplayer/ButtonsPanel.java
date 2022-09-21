package jalau.at18.kingoftokyo.view.choosesecondplayer;

import jalau.at18.kingoftokyo.controller.ChooseFirstPlayerController;
import jalau.at18.kingoftokyo.controller.ChooseSecondPlayerController;
import jalau.at18.kingoftokyo.view.choosefirstplayer.ChooseFirstPlayerFrame;
import jalau.at18.kingoftokyo.view.general.ExitButton;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 100;
    private ChooseSecondPlayerController chooseSecondPlayerController;
    public ButtonsPanel(ChooseSecondPlayerFrame frame) {
        chooseSecondPlayerController = new ChooseSecondPlayerController(frame);
        add(new ExitButton());
        add(new StartGameButton(chooseSecondPlayerController));
        setBackground(Color.BLUE);
        initialize();
    }

    private void initialize() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }
}
