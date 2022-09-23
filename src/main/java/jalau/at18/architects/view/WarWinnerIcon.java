package jalau.at18.architects.view;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class WarWinnerIcon extends JLabel {
    private static final int POSITION_X = 0;
    private static final int POSITION_Y = 0;
    private static final int WIDTH = 150;
    private static final int HEIGHT = 150;

    public WarWinnerIcon() {
        setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);
        ImageIcon image = new ImageIcon("src/main/resources/architects/tokens/warwinnertokens");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(WIDTH, HEIGHT,
                WIDTH));
        setIcon(icon);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
    }
}
