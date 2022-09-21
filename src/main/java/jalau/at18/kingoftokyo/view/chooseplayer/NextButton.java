package jalau.at18.kingoftokyo.view.chooseplayer;

import javax.swing.*;
import java.awt.event.ActionListener;

public class NextButton extends JButton {

    public static final int DEFAULT_POS_X = 0;
    public static final int DEFAULT_POS_Y = 500;
    public static final int DEFAULT_WIDTH = 500;
    public static final int DEFAULT_HEIGHT = 100;

    public NextButton(ActionListener listener) {
        super("Next");
        addActionListener(listener);
    }
}
