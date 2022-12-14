package jalau.at18.kingoftokyo.view.playercard;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PlayerCardLifePoints extends JLabel {
    private static final int POSITION_X = 15;
    private static final int POSITION_Y = 50;
    private static final int WIDTH = 90;
    private static final int HEIGHT = 20;
    private static final int FONT_SIZE = 20;
    private static final int FONT_STYLE = 1;

    public PlayerCardLifePoints() {
        super(" ", SwingConstants.LEFT);
        setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);
        setFont(new Font("Arial Black", FONT_STYLE, FONT_SIZE));
        setForeground(Color.white);
        setVisible(true);
        ImageIcon image = new ImageIcon("src/main/resources/kingoftokyo/Life_Points.png");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(HEIGHT, HEIGHT,
                HEIGHT));
        setIcon(icon);
        setAlignmentX(Component.LEFT_ALIGNMENT);
        setVisible(true);
    }

    public void setLifePoints(int lifePoints) {
        setText(lifePoints + " ");
    }
}
