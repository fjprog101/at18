package jalau.at18.kingoftokyo.view;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class CardNameLabel extends JLabel {
    private static final int POS_X = 1;
    private static final int POS_Y = 30;
    private static final int WIDTH = 150;
    private static final int HEIGHT = 20;
    private static final int FONT_STYLE = 1;
    private static final int FONT_SIZE = 11;

    public CardNameLabel(String name) {
        super(name, SwingConstants.CENTER);
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setFont(new Font("Arial Roundeds", FONT_STYLE, FONT_SIZE));
        setForeground(Color.WHITE);
        setVisible(true);
    }
}
