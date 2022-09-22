package jalau.at18.kingoftokyo.view;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PlayerCardEnergyPoints extends JLabel {
    private static final int POSITION_X = 5;
    private static final int POSITION_Y = 80;
    private static final int WIDTH = 70;
    private static final int HEIGHT = 20;
    private static final int FONT_SIZE = 20;
    private static final int FONT_STYLE = 1;
    private static final int IMAGE_SIZE = 40;

    public PlayerCardEnergyPoints(int energyPoints) {
        super(energyPoints + " ", SwingConstants.RIGHT);
        setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);
        setFont(new Font("Arial Black", FONT_STYLE, FONT_SIZE));
        setForeground(Color.white);
        setVisible(true);
        ImageIcon image = new ImageIcon("src/main/resources/kingoftokyo/Energy_Points.png");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(IMAGE_SIZE, IMAGE_SIZE,
                IMAGE_SIZE));
        setIcon(icon);
        setAlignmentX(Component.LEFT_ALIGNMENT);
        setVisible(true);
    }
}