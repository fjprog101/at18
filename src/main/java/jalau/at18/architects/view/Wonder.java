package jalau.at18.architects.view;

import java.awt.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Wonder extends JLabel {
    private static final int POS_X = 150;
    private static final int POS_Y = 150;
    private static final int WIDTH = 200;
    private static final int HEIGHT = 130;
    private static final String PATH = "src/main/resources/architects/";

    public Wonder(String imagePath) {
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        ImageIcon image = new ImageIcon(PATH + imagePath);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_DEFAULT));
        setIcon(icon);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
    }

}
