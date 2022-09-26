package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import javax.swing.*;
import jalau.at18.kingoftokyo.controller.WhoStartController;
import java.awt.*;

public class PanelSouth  extends JPanel {
    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 100;
    private WhoStartController whoStartController;

    public PanelSouth(WhoStartController whoStartController) {
        //whoStartController = new WhoStartController(frame);
        add(new StartGameButton(whoStartController));
        initialize();
    }

    private void initialize() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }
}