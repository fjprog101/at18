package jalau.at18.kingoftokyo.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class RollerButton extends JButton {
    public static final int DEFAULT_POSX = 800;
    public static final int DEFAULT_POSY = 450;
    public static final int DEFAULT_WIDTH = 100;
    public static final int DEFAULT_HEIGHT = 30;

    public RollerButton(ActionListener listener) {
        super("Roll Dice");
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        //addActionListener(listener);
    }
}
