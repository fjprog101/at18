package jalau.at18.kingoftokyo.view.playercards;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PlayerCardName extends JLabel {
    private static final int POSITION_X = 80;
    private static final int POSITION_Y = 0;
    private static final int WIDTH = 140;
    private static final int HEIGHT = 20;
    private static final int FONT_SIZE = 17;
    private static final int FONT_STYLE = 1;

    public PlayerCardName() {
        super(" ", SwingConstants.CENTER);
        setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);
        setFont(new Font("Arial Black", FONT_STYLE, FONT_SIZE));
        setForeground(Color.white);
        setVisible(true);
    }

    public void setMonsterName(String name) {
        setText(name);
    }
}
