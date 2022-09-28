package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import javax.swing.*;
import jalau.at18.kingoftokyo.controller.WhoStartController;
import jalau.at18.kingoftokyo.controller.WhoStartRollDiceController;

import java.awt.*;

public class PanelSouth  extends JPanel {
    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 200;

    private static final int DEFAULT_LABEL_POSX = 300;
    private static final int DEFAULT_LABEL_POSY = 400;
    private static final int DEFAULT_LABEL_WIDTH = 600;
    private static final int DEFAULT_LABEL_HEIGHT = 200;


    private WhoStartController whoStartController;

    //public PanelSouth(WhoStartController whoStartController) {
    public PanelSouth(WhoStartRollDiceController whoStartRollDiceController) {
        //whoStartController = new WhoStartController(frame);
        //add(new StartGameButton(whoStartController));
        add(new StartGameButton(whoStartRollDiceController));
        setBounds(DEFAULT_LABEL_POSX, DEFAULT_LABEL_POSY, DEFAULT_LABEL_WIDTH, DEFAULT_LABEL_HEIGHT);
        //setVisible(false);

        initialize();

    }

    private void initialize() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        //setEnabled(false);
    }
}