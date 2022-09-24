package jalau.at18.kingoftokyo.view.playercards;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PlayerCardMonsterIcon extends JLabel {
    private static final int POSITION_X = 150;
    private static final int POSITION_Y = 30;
    private static final int WIDTH = 100;
    private static final int HEIGHT = 100;

    public PlayerCardMonsterIcon(String path) {
        setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);
        ImageIcon image = new ImageIcon(path);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(WIDTH, HEIGHT,
                WIDTH));
        setIcon(icon);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
    }
}