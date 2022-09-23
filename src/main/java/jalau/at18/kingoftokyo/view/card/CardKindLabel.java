package jalau.at18.kingoftokyo.view.card;

import java.awt.Font;
import java.awt.*;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CardKindLabel extends JLabel {
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
