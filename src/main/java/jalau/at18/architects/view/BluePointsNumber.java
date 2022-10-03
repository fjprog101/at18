package jalau.at18.architects.view;

import javax.swing.JLabel;
import jalau.at18.architects.model.cards.BluePoints;
import java.awt.Font;
import java.awt.Color;

public class BluePointsNumber extends JLabel {
    private static final int POSITION_X = 35;
    private static final int POSITION_Y = 18;
    private static final int WIDTH = 50;
    private static final int HEIGHT = 40;
    private static final int FONT_SIZE = 20;
    private static final int FONT_STYLE = 10;

    public BluePointsNumber(BluePoints bluePoints) {
        //BluePointsViewController bluePointsController = new BluePointsViewController();
        //setText(bluePointsController.getBluePoints()+ "");
        setText(bluePoints.getPoints() + "");
        setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);
        setFont(new Font("Arial Black", FONT_STYLE, FONT_SIZE));
        setForeground(Color.BLACK);
        setVisible(true);
    }
    public void setNumber(int number) {
        setText(number + "");
    }
}
