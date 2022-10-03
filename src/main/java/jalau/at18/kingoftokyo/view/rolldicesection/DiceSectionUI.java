package jalau.at18.kingoftokyo.view.rolldicesection;

import jalau.at18.kingoftokyo.controller.KeepDiceSectionController;
import jalau.at18.kingoftokyo.controller.PlayerStatusController;
import jalau.at18.kingoftokyo.controller.RollDiceSectionController;
import jalau.at18.kingoftokyo.view.TurnPanel;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;

public class DiceSectionUI extends JPanel {
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
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
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.LEFT, 0, null));
    }

    public RollDiceSectionController getController() {
        return rollDiceSectionController;
    }
}