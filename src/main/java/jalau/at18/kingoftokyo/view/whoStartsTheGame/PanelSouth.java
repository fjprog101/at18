package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import javax.swing.*;
//import jalau.at18.kingoftokyo.controller.WhoStartController;
import jalau.at18.kingoftokyo.controller.WhoStartRollDiceController;

import java.awt.*;

public class PanelSouth  extends JPanel {
    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 200;

    private static final int DEFAULT_LABEL_POSX = 300;
    private static final int DEFAULT_LABEL_POSY = 400;
    private static final int DEFAULT_LABEL_WIDTH = 600;
    private static final int DEFAULT_LABEL_HEIGHT = 200;
    private StartGameButton startGameButton;

    public PanelSouth(WhoStartRollDiceController whoStartRollDiceController) {
        startGameButton = new StartGameButton(whoStartRollDiceController);
        add(startGameButton);
        setBounds(DEFAULT_LABEL_POSX, DEFAULT_LABEL_POSY, DEFAULT_LABEL_WIDTH, DEFAULT_LABEL_HEIGHT);
        initialize();
    }

    private void initialize() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }

    public StartGameButton getButton() {
        return startGameButton;
    }
}