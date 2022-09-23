package jalau.at18.architects.view;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class WarWinnerNumber extends JLabel {
    private static final int POSITION_X = 75;
    private static final int POSITION_Y = 75;
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;
    private static final int FONT_SIZE = 30;
    private static final int FONT_STYLE = 1;

    public WarWinnerNumber(int numberVictories) {
        super(numberVictories + "", SwingConstants.RIGHT);
        setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);
        setFont(new Font("Arial Black", FONT_STYLE, FONT_SIZE));
        setForeground(Color.BLACK);
        setVisible(true);
    }
}
