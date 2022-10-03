package jalau.at18.kingoftokyo.view.whostart;

import javax.swing.*;

import java.awt.*;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;

public class ShowDicesPanel extends JPanel {
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private static final int DEFAULT_LABEL_POSX = 100;
    private static final int DEFAULT_LABEL_POSY = 90;
    private static final int DEFAULT_LABEL_WIDTH = 500;
    private static final int DEFAULT_LABEL_HEIGHT = 200;

    private RollDiceSectionUI rollDiceSectionUI;
    public ShowDicesPanel() {
        rollDiceSectionUI = new RollDiceSectionUI();
        add(rollDiceSectionUI);
        setBounds(DEFAULT_LABEL_POSX, DEFAULT_LABEL_POSY, DEFAULT_LABEL_WIDTH, DEFAULT_LABEL_HEIGHT);
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }

    public RollDiceSectionUI getRolldiceSeccionUI() {
        return rollDiceSectionUI;
    }
}