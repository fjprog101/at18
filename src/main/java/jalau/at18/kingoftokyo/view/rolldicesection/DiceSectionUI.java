package jalau.at18.kingoftokyo.view.rolldicesection;

import jalau.at18.kingoftokyo.controller.KeepDiceSectionController;
import jalau.at18.kingoftokyo.controller.PlayerStatusController;
import jalau.at18.kingoftokyo.controller.RollDiceSectionController;
import jalau.at18.kingoftokyo.view.TurnPanel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class DiceSectionUI extends JPanel {
    private static final int DEFAULT_POSX = 310;
    private static final int DEFAULT_POSY = 450;
    private static final int DEFAULT_WIDTH = 1000;
    private static final int DEFAULT_HEIGHT = 300 - 1;
    private RollDiceSectionController rollDiceSectionController;
    private KeepDiceSectionController keepDiceSectionController;

    public DiceSectionUI(TurnPanel turnPanel, PlayerStatusController playerController) {
        KeepDiceSectionUI keepDiceSectionUI = new KeepDiceSectionUI(playerController);
        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        add(keepDiceSectionUI);
        add(rollDiceSectionUI);
        keepDiceSectionController = new KeepDiceSectionController(keepDiceSectionUI);
        keepDiceSectionController.addTurnPanel(turnPanel);
        rollDiceSectionController = new RollDiceSectionController(rollDiceSectionUI, keepDiceSectionController);
        //keepDiceSectionController.setRollDiceSectionController(rollDiceSectionController);
        //Position of this Panel DiceSectionUI
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setBorder(new LineBorder(Color.BLACK, 1));
    }

    public RollDiceSectionController getController() {
        return rollDiceSectionController;
    }
}