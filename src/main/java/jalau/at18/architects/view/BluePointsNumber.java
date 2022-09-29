package jalau.at18.architects.view;

import javax.swing.JLabel;

import jalau.at18.architects.controller.BluePointsViewController;

import java.awt.Font;
import java.awt.Color;

public class BluePointsNumber extends JLabel {
    private static final int POSITION_X = 15;
    private static final int POSITION_Y = 0;
    private static final int WIDTH = 50;
    private static final int HEIGHT = 40;
    private static final int FONT_SIZE = 15;
    private static final int FONT_STYLE = 10;

    public BluePointsNumber() {
        BluePointsViewController bluePointsController = new BluePointsViewController();
        setText(bluePointsController.getBluePoints() + "");
        setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);
        setFont(new Font("Arial Black", FONT_STYLE, FONT_SIZE));
        setForeground(Color.BLACK);
        setVisible(true);
    }
}
