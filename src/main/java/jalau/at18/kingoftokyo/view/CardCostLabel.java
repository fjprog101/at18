package jalau.at18.kingoftokyo.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class CardCostLabel extends JLabel {

    public CardCostLabel(int cost) {
        super("" + cost);
        setBounds(5, 5, 20, 20);
        setFont(new Font("Arial Rounded MT Bold", 1, 21));
        setForeground(Color.WHITE);
        setVisible(true);
    }
}
