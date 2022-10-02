package jalau.at18.kingoftokyo.view.whostart;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;

public class ShowDicesPanel extends JPanel {
    private static final int DEFAULT_LABEL_POSX = 100;
    private static final int DEFAULT_LABEL_POSY = 90;
    private static final int DEFAULT_LABEL_WIDTH = 500;
    private static final int DEFAULT_LABEL_HEIGHT = 200;
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private static final int RED_BUTTON = 249;
    private static final int GREEN_BUTTON = 156;
    private static final int BLUE_BUTTON = 0;

    private RollDiceSectionUI rollDiceSectionUI;
    public ShowDicesPanel() {
        rollDiceSectionUI = new RollDiceSectionUI();
        add(rollDiceSectionUI);
        setBounds(DEFAULT_LABEL_POSX, DEFAULT_LABEL_POSY, DEFAULT_LABEL_WIDTH, DEFAULT_LABEL_HEIGHT);
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        rollDiceSectionUI.setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        float[] hsbButton = new float[THREE];
        hsbButton = Color.RGBtoHSB(RED_BUTTON, GREEN_BUTTON, BLUE_BUTTON, hsbButton);
        rollDiceSectionUI.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.LEFT, 0, null));
        rollDiceSectionUI.getRollerDiceButton().setBackground(Color.getHSBColor(hsbButton[0], hsbButton[1], hsbButton[2]));
    }

    public RollDiceSectionUI getRolldiceSeccionUI() {
        return rollDiceSectionUI;
    }
}