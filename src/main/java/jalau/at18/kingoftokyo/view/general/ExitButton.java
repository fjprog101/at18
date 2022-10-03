package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class ExitButton extends JButton {
    private static final int THREE = 3;
    private static final int RED = 249;
    private static final int GREEN = 156;
    private static final int BLUE = 0;
    public static final int DEFAULT_WIDTH = 100;
    public static final int DEFAULT_HEIGHT = 40;

    public ExitButton() {
        super("Exit");
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        addActionListener(e -> exitGame());
    }
    private void exitGame() {
        System.exit(0);
    }
}
