package jalau.at18.architects.view;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.JLabel;

public class CardLabel extends JLabel {
    CardLabel() {
        setBackground(Color.WHITE);
        setVisible(true);
    }
    public void addImage(Icon imageOfCard) {
        setIcon(imageOfCard);
        this.repaint();
    }
}
