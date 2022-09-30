package jalau.at18.kingoftokyo.view.choosemonsters;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StartGameButton extends JButton {
    private static final int THREE = 3;
    private static final int RED = 249;
    private static final int GREEN = 156;
    private static final int BLUE = 0;
    public static final int DEFAULT_WIDTH = 100;
    public static final int DEFAULT_HEIGHT = 40;

    public StartGameButton(ActionListener listener) {
        super("Start");
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        addActionListener(listener);
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }
}
