package jalau.at18.architects.view;

import javax.swing.*;

import jalau.at18.architects.GrayCard;

public class ResourceFrame extends JLabel {
    private static final int POS_X = 200;
    private static final int POS_Y = 50;
    private static final int WIDTH = 145;
    private static final int HEIGHT = 130;

    public ResourceFrame(GrayCard grayCard) {
        super(grayCard.getResource());
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setVisible(true);
    }

}
