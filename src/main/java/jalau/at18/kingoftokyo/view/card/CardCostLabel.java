package jalau.at18.kingoftokyo.view.card;

import java.awt.Color;
import java.awt.*;

import javax.swing.JLabel;

public class CardCostLabel extends JLabel {
    private static final int FONT_STYLE = 1;
    private static final int FONT_SIZE = 21;

    public CardCostLabel(int cost) {
        setCost(cost);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setFont(new Font("Arial Rounded MT Bold", FONT_STYLE, FONT_SIZE));
        setForeground(Color.WHITE);
        setVisible(true);
    }
    public void setCost(int cost) {
        setText(cost + "                         ");
    }
}
