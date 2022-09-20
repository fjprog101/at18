package jalau.at18.kingoftokyo.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class CardCostLabel extends JLabel {
    private static final int POS = 5;
    private static final int SIZE = 20;
    private static final int FONT_STYLE = 1;
    private static final int FONT_SIZE = 21;

    public CardCostLabel(int cost) {
        super("" + cost);
        setBounds(POS, POS, SIZE, SIZE);
        setFont(new Font("Arial Rounded MT Bold", FONT_STYLE, FONT_SIZE));
        setForeground(Color.WHITE);
        setVisible(true);
    }
}