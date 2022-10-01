package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel {
    private static final int THREE = 3;
    private static final int RED = 249;
    private static final int GREEN = 156;
    private static final int BLUE = 0;

    public FooterPanel() {
        setLayout(new BorderLayout());
        add(new FooterLabel(), BorderLayout.EAST);
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }
}
