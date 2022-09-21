package jalau.at18.kingoftokyo.view.chooseplayer;

import jalau.at18.kingoftokyo.controller.ChoosePlayerController;
import jalau.at18.kingoftokyo.view.general.ExitButton;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 100;
    private ChoosePlayerController choosePlayerController;
    public ButtonsPanel(ChoosePlayersFrame frame) {
        choosePlayerController = new ChoosePlayerController(frame);
        add(new ExitButton());
        add(new NextButton(choosePlayerController));
        setBackground(Color.BLUE);
        initialize();
    }

    private void initialize() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }
}
