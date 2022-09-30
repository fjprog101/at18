package jalau.at18.architects.view;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BluePointsIcon extends JLabel {
    private static final int POSITION_X = 0;
    private static final int POSITION_Y = 0;
    private static final int WIDTH = 80;
    private static final int HEIGHT = 80;

    public BluePointsIcon() {
        setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);
        ImageIcon image = new ImageIcon("src/main/resources/architects/icons/a.png");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(WIDTH, HEIGHT,
                WIDTH));
        setIcon(icon);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
    }
}
