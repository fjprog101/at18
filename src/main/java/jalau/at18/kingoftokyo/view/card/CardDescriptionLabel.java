package jalau.at18.kingoftokyo.view.card;

import java.awt.Font;
import java.awt.*;

import javax.swing.JLabel;

public class CardDescriptionLabel extends JLabel {
    private static final int FONT_STYLE = 1;
    private static final int FONT_SIZE = 11;

    public CardDescriptionLabel(String description) {
        setDescription(description);
        setFont(new Font("Arial Roundeds", FONT_STYLE, FONT_SIZE));
        setForeground(Color.WHITE);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
    }

    public void setDescription(String description) {
        setText("<html><p style=\"width:100px\" style=\"text-align:center\" >" + description + "</p></html>");
    }
}
