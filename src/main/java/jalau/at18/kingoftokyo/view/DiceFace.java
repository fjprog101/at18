package jalau.at18.kingoftokyo.view;

import javax.swing.JLabel;
import javax.swing.*;

public class DiceFace extends JLabel {
    private static final int POS_X = 800;
    private static final int POS_Y = 500;
    private static final int POS_WIDTH = 40;
    private static final int POS_HEIGHT = 40;

    public DiceFace() {
        setBounds(POS_X, POS_Y, POS_WIDTH, POS_HEIGHT);
        diceOne();
    }
    public void diceOne() {
        ImageIcon diceFaceOne = new ImageIcon("src/main/resources/kingoftokio/one.png");
        setIcon(diceFaceOne);
    }
}
