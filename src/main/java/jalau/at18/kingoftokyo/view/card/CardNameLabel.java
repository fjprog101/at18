package jalau.at18.kingoftokyo.view.card;

import java.awt.Font;
import java.awt.*;

import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class CardNameLabel extends JLabel {
    private static final int POS_X = 1;
    private static final int POS_Y = 30;
    private static final int WIDTH = 149;
    private static final int HEIGHT = 14;
    private static final int FONT_STYLE = 1;
    private static final int FONT_SIZE = 11;

    public CardNameLabel(String name) {
        super(name, SwingConstants.CENTER);
        setFont(new Font("Arial Black", FONT_STYLE, FONT_SIZE));
        setForeground(Color.WHITE);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
    }
}
