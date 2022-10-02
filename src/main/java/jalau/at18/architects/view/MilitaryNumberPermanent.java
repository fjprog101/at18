package jalau.at18.architects.view;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import jalau.at18.architects.model.cards.MilitaryStrengthCounter;

public class MilitaryNumberPermanent extends JLabel {
    private static final int MILITARY_T_POSITION_X = 600;
    private static final int MILITARY_T_POSITION_Y = 500;
    private static final int WIDTH = 50;
    private static final int HEIGHT = 40;
    private static final int MILITARY_P_POSITION_X = 28;
    private static final int MILITARY_P_POSITION_Y = 25;
    private static final int FONT_SIZE = 20;
    private static final int FONT_STYLE = 10;
    public MilitaryNumberPermanent(MilitaryStrengthCounter militaryStatus) {
        setText(militaryStatus.getPermanentShield() + "");
        setBounds(MILITARY_P_POSITION_X, MILITARY_P_POSITION_Y, WIDTH, HEIGHT);
        setFont(new Font("Arial Black", FONT_STYLE, FONT_SIZE));
        setForeground(Color.BLACK);
        setVisible(true);
    }
}
