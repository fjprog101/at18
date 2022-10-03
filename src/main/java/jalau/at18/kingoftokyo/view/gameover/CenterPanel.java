package jalau.at18.kingoftokyo.view.gameover;

import javax.swing.JPanel;
import java.awt.*;

public class CenterPanel extends JPanel {
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;

    public CenterPanel() {
        LabelsPanel labelsPanel = new LabelsPanel();
        ButtonsPanel buttonsPanel = new ButtonsPanel();
        setLayout(null);
        add(labelsPanel);
        add(buttonsPanel);
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }
}
