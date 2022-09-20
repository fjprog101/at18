package jalau.at18.kingoftokyo.view;

import java.awt.Font;
import java.awt.*;

import javax.swing.JLabel;

public class CardDescriptionLabel extends JLabel {
    private static final int POS_X = 1;
    private static final int POS_Y = 120;
    private static final int WIDTH = 150;
    private static final int HEIGHT = 70;
    private static final int FONT_STYLE = 1;
    private static final int FONT_SIZE = 11;

    public CardDescriptionLabel(String description) {
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setText("<html><p style=\"width:100px\" style=\"text-align:center\" >" + description + "</p></html>");
        setFont(new Font("Arial Roundeds", FONT_STYLE, FONT_SIZE));
        setForeground(Color.WHITE);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
    }
}
