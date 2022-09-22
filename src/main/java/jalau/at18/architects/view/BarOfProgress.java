package jalau.at18.architects.view;

import javax.swing.*;

public class BarOfProgress extends JProgressBar {
    private static final int POS_X = 200;
    private static final int POS_Y = 250;
    private static final int WIDTH = 200;
    private static final int HEIGHT = 70;

    public BarOfProgress(int phase) {
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setValue(phase);
        setStringPainted(true);
        setVisible(true);
    }
}
