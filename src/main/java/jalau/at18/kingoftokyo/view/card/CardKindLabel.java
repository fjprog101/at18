package jalau.at18.kingoftokyo.view.card;

import java.awt.Font;
import java.awt.*;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CardKindLabel extends JLabel {
    private static final int POS_X = 1;
    private static final int POS_Y = 100;
    private static final int WIDTH = 150;
    private static final int HEIGHT = 20;
    private static final int FONT_STYLE = 1;
    private static final int FONT_SIZE = 11;

    public CardKindLabel() {
        super("Discard", SwingConstants.CENTER);
        setFont(new Font("Arial", FONT_STYLE, FONT_SIZE));
        setForeground(Color.WHITE);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
    }
}
