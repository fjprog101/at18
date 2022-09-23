package jalau.at18.architects.view;

import java.awt.Color;

import javax.swing.JLabel;

public class CardLabel extends JLabel {
    CardLabel() {
        super(" ");
        setBackground(Color.CYAN);
    }
    public void setImage(String file) {
        setVisible(true);
        this.repaint();
    }
}
