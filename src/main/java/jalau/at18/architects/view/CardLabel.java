package jalau.at18.architects.view;

import java.awt.Color;

import javax.swing.JLabel;

public class CardLabel extends JLabel{
    CardLabel(int x, int y) {
        super(" ");
        setBounds(x,y,70, 90);
        setBackground(Color.CYAN);
    }
    public void setImage(String file) {

        //setIcon(imageOfCard);
        setVisible(true);
        this.repaint();
    }
}
